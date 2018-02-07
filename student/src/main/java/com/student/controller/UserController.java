package com.student.controller;
  
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.json.JsonObject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.student.dao.mapper.bo.User;
import com.student.dao.mapper.bo.UserMessage;
import com.student.dao.mapper.bo.UserMessageExample;
import com.student.dao.mapper.interfaces.UserMessageMapper;
import com.student.service.interfaces.IUserMessage;
import com.student.service.interfaces.UserInsert;
import com.sun.net.httpserver.Authenticator.Success;

import javafx.scene.control.Alert;

@Controller  
@RequestMapping("/user")  
public class UserController {  
	private User user;
	private UserMessage userMessage;
	@Autowired
	private UserInsert userInsert;
	@Autowired
	private IUserMessage iUserMessage;
	Date date = new Date();
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyymmdd");
	
	Logger logger = Logger.getLogger(UserController.class);
    @RequestMapping("/insertUser")
    public String toIndex(HttpServletRequest request,Model model){  
        return "register"; 
    }
    @RequestMapping("/regeist")
    public void insert(HttpServletRequest request,Model model,HttpServletResponse response){
    	List<User> maxUserId = userInsert.selectUserId();
    	String name = request.getParameter("name");
    	String password = request.getParameter("password");
    	user = new User();
    	user.setUserName(name);
    	user.setIsOff(0);
    	user.setPassword(password);
    	user.setUserId(maxUserId.get(0).getUserId()+1);
    	user.setCreateDate(dateFormat.format(date));
    	userInsert.insert(user);
    	try {
			response.sendRedirect("http://localhost:8080/student/");
		} catch (IOException e) {
			e.printStackTrace();
		}
    	//return "index";
    }
    @RequestMapping("/login")
    public String login(HttpServletRequest request){
    	String name = request.getParameter("name");
    	String password = request.getParameter("password");
    	user =new User();
    	user.setUserName(name);
    	user.setPassword(password);
    	List<User> isOk = userInsert.login(user);
    	if( !isOk.isEmpty()){
    		HttpSession session = request.getSession();
        	session.setAttribute("name", name);
    		return "main";
    	}else{
    		return "register";
    	}
    }
    
    @RequestMapping("/InsertUserMessage")
    public String InsertUserMessage(HttpServletRequest request){
    	String userId = request.getParameter("userId");
    	String school = request.getParameter("school");
    	String major = request.getParameter("major");
    	String prefStandards = request.getParameter("prefStandards");
    	String workspace = request.getParameter("workspace");
    	String work = request.getParameter("work");
    	String companyType = request.getParameter("companyType");
    	String isMajor = request.getParameter("isMajor");
    	if("是".equals(isMajor)){
    		isMajor = "1";
    	}else{
    		isMajor = "2";
    	}
    	String isLocal = request.getParameter("isLocal");
    	if("否".equals(isLocal)){
    		isLocal = "1";
    	}else{
    		isLocal = "2";
    	}
    	userMessage = new UserMessage();
    	userMessage.setStudentId(0);
    	userMessage.setUserId(Integer.valueOf(userId));
    	userMessage.setSchool(school);
    	userMessage.setMajor(major);
    	userMessage.setPrefStandards(prefStandards);
    	userMessage.setWorkspace(workspace);
    	userMessage.setWork(work);
    	userMessage.setCompanyType(1);
    	userMessage.setIsMajor(Integer.valueOf(isMajor));
    	iUserMessage.insert(userMessage);
    	return "showMe";
    }
    
    @RequestMapping("/showMe")
    public String showMe(){
    	return "showMe";
    }
    @RequestMapping(value = "/showMe.do",method=RequestMethod.POST)
    public @ResponseBody Object getShopInJSON(HttpServletRequest request,HttpServletResponse response) {  
    	
    	HttpSession session = request.getSession();
    	String name = "";
    	try{
    		name = session.getAttribute("name").toString();
    	}catch(NullPointerException e){
    		try {
				response.sendRedirect("http://localhost:8080/student/");
				return false;
			} catch (IOException e1) {
				e1.printStackTrace();
			}
    	}
    	ObjectMapper mapper = new ObjectMapper();
    	UserMessageExample example =new UserMessageExample();
    	example.createCriteria().andUserIdEqualTo(Integer.valueOf(name));
    	UserMessage message = new UserMessage();
    	String string=null;
    	try {
			String req = mapper.writeValueAsString(example);
			List<UserMessage> userInfo= iUserMessage.select(req);
			if( !userInfo.isEmpty() ){
				 message.setSchool(userInfo.get(0).getSchool()); 
			     message.setStudentId(userInfo.get(0).getStudentId());
			     message.setCompanyType(userInfo.get(0).getCompanyType());
			     message.setIsMajor(userInfo.get(0).getIsMajor());
			     message.setMajor(userInfo.get(0).getMajor());
			     message.setPrefStandards(userInfo.get(0).getPrefStandards());
			     message.setWork(userInfo.get(0).getWork());
			     message.setUserId(userInfo.get(0).getUserId());
			     message.setWorkspace(userInfo.get(0).getWorkspace());
			     string = JSON.toJSONString(message);
			}else{
				 message.setSchool(""); 
			     message.setStudentId(null);
			     message.setCompanyType(1);
			     message.setIsMajor(null);
			     message.setMajor("");
			     message.setPrefStandards("");
			     message.setWork("");
			     message.setUserId(Integer.valueOf(name));
			     message.setWorkspace("");
			     string = JSON.toJSONString(message);
			}
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	return  JSONObject.parse(string);  
    } 
    @RequestMapping(value = "/showMeChange.do",method=RequestMethod.POST)
    public @ResponseBody String getShopInJSON2(HttpServletRequest request) {  
    	//@ResponseBody Object
    	ObjectMapper mapper = new ObjectMapper();
    	UserMessageExample example =new UserMessageExample();
    	example.createCriteria().andStudentIdEqualTo(Integer.valueOf(request.getParameter("studentId")));
    	try {
			String req = mapper.writeValueAsString(example);
			iUserMessage.delete(req);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
    	userMessage = new UserMessage();
    	userMessage.setSchool(request.getParameter("school")); 
    	userMessage.setStudentId(Integer.valueOf(request.getParameter("studentId")));
    	userMessage.setIsMajor(Integer.valueOf(request.getParameter("isMajor")));
        userMessage.setMajor(request.getParameter("major"));
        userMessage.setPrefStandards(request.getParameter("prefStandard"));
        userMessage.setWork(request.getParameter("work"));
        userMessage.setUserId(Integer.valueOf(request.getParameter("username")));
        userMessage.setWorkspace(request.getParameter("workspace"));
		iUserMessage.insert(userMessage);
        return "success";  
    } 
}  
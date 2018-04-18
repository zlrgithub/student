package com.student.controller;
  
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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
import com.student.dao.mapper.bo.Administrator;
import com.student.dao.mapper.bo.AdministratorExample;
import com.student.dao.mapper.bo.BusiUserMessage;
import com.student.dao.mapper.bo.BusiUserMessageExample;
import com.student.dao.mapper.bo.SchoolInfo;
import com.student.dao.mapper.bo.User;
import com.student.dao.mapper.bo.UserMessage;
import com.student.dao.mapper.bo.UserMessageExample;
import com.student.dao.mapper.bo.businessUser;
import com.student.dao.mapper.bo.businessUserExample;
import com.student.dao.mapper.interfaces.AdministratorMapper;
import com.student.dao.mapper.interfaces.BusiUserMessageMapper;
import com.student.dao.mapper.interfaces.businessUserMapper;
import com.student.service.interfaces.ISchool;
import com.student.service.interfaces.IUserMessage;
import com.student.service.interfaces.UserInsert;

@Controller  
@RequestMapping("/user")  
public class UserController {  
	
	@Autowired
	private UserInsert userInsert;
	
	@Autowired
	private IUserMessage iUserMessage;
	
	@Autowired
	private businessUserMapper businessUserMapper ;
	
	@Autowired
	private AdministratorMapper administratorMapper;
	
	@Autowired
	private BusiUserMessageMapper busiUserMessageMapper ;
	
	@Autowired
	private ISchool iSchool;
	
	private User user;
	private UserMessage userMessage;
	Date date = new Date();
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyymmdd");
	
	Logger logger = Logger.getLogger(UserController.class);
    @RequestMapping("/insertUser")
    public String toIndex(HttpServletRequest request,Model model){  
        return "register"; 
    }
    @RequestMapping("/regeist")
    public void insert(HttpServletRequest request,HttpServletResponse response){
    	String name = request.getParameter("name");
    	String password = request.getParameter("password");
    	String roleType = request.getParameter("roleType");
    	if("学生".equals(roleType)){
	    	user = new User();
	    	user.setUserId(name);
	    	user.setUserName(name);
	    	user.setPassword(password);
	    	user.setIsOff(0);
	    	user.setCreateDate(dateFormat.format(date));
	    	userInsert.insert(user);
	    	try {
				response.sendRedirect("http://localhost:8080/student/");
			} catch (IOException e) {
				e.printStackTrace();
			}
    	}else if("管理员".equals(roleType)){
    		Administrator administrator = new Administrator();
    		administrator.setUserId(name);
    		administrator.setUserName(name);
    		administrator.setPassword(password);
    		administrator.setIsOff(0);
    		administrator.setCreateDate(dateFormat.format(date));
    		administratorMapper.insert(administrator);
    		try {
				response.sendRedirect("http://localhost:8080/student/");
			} catch (IOException e) {
				e.printStackTrace();
			}
    	}else{
    		businessUser user = new businessUser();
	    	user.setUserId(name);
	    	user.setUserName(name);
	    	user.setPassword(password);
	    	user.setIsOff(0);
	    	user.setCreateDate(dateFormat.format(date));
	    	businessUserMapper.insert(user);
	    	try {
				response.sendRedirect("http://localhost:8080/student/");
			} catch (IOException e) {
				e.printStackTrace();
			}
    	}
    	//return "index";
    }
    @RequestMapping("/login")
    public String login(HttpServletRequest request){
    	String name = request.getParameter("name");
    	String password = request.getParameter("password");
    	String roleType = request.getParameter("roleType");
    	if("学生".equals(roleType)){
	    	user =new User();
	    	user.setUserName(name);
	    	user.setPassword(password);
	    	List<User> isOk = userInsert.login(user);
	    	if( !isOk.isEmpty()){
	    		HttpSession session = request.getSession();
	        	session.setAttribute("name", name);
	        	session.setAttribute("roleType", roleType);
	    		return "main";
	    	}else{
	    		return "register";
	    	}
    	}else if("管理员".equals(roleType)){
    		AdministratorExample example = new AdministratorExample();
    		example.createCriteria().andUserIdEqualTo(name).andPasswordEqualTo(password);
    		List<Administrator> isOk = administratorMapper.selectByExample(example);
    		if( !isOk.isEmpty()){
	    		HttpSession session = request.getSession();
	        	session.setAttribute("name", name);
	        	session.setAttribute("roleType", roleType);
	    		return "main";
	    	}else{
	    		return "register";
	    	}
    	}else{
    		businessUserExample example = new businessUserExample();
    		example.createCriteria().andUserIdEqualTo(name).andPasswordEqualTo(password);
	    	List<businessUser> isOk = businessUserMapper.selectByExample(example);
	    	if( !isOk.isEmpty()){
	    		HttpSession session = request.getSession();
	        	session.setAttribute("name", name);
	        	session.setAttribute("roleType", roleType);
	    		return "main";
	    	}else{
	    		return "register";
	    	}
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
    	userMessage.setStudentId("0");
    	userMessage.setUserId(userId);
    	userMessage.setSchool(school);
    	userMessage.setMajor(major);
    	userMessage.setPrefStandards(prefStandards);
    	userMessage.setWorkspace(workspace);
    	userMessage.setWork(work);
    	userMessage.setCompanyType(1);
    	userMessage.setIsMajor(Integer.valueOf(isMajor));
    	iUserMessage.insert(userMessage);
    	
    	SchoolInfo schoolInfo = new SchoolInfo();
    	schoolInfo.setSchool(school);
    	schoolInfo.setMajor(major);
    	iSchool.inert(schoolInfo);
    	return "showMe";
    }
    
    @RequestMapping("/showMe")
    public String showMe(HttpServletRequest request){
    	HttpSession session = request.getSession();
    	if("学生".equals(session.getAttribute("roleType").toString())){
    		return "showMe";
    	}else{
    		return "busiShowMe";
    	}
    }
    @RequestMapping(value = "/showMe.do",method=RequestMethod.POST)
    public @ResponseBody Object getShopInJSON(HttpServletRequest request,HttpServletResponse response) {  
    	HttpSession session = request.getSession();
    	String name = "";
    	String roleType = "";
    	try{
    		name = session.getAttribute("name").toString();
    		roleType = session.getAttribute("roleType").toString();
    	}catch(NullPointerException e){
    		try {
				response.sendRedirect("http://localhost:8080/student/");
				return false;
			} catch (IOException e1) {
				e1.printStackTrace();
			}
    	}
    	ObjectMapper mapper = new ObjectMapper();
    	if("学生".equals(roleType)){
	    	UserMessageExample example =new UserMessageExample();
	    	example.createCriteria().andUserIdEqualTo(name);
	    	UserMessage message = new UserMessage();
	    	String string=null;
	    	try {
				String req = mapper.writeValueAsString(example);
				List<UserMessage> userInfo= iUserMessage.select(req);
				
				if( !userInfo.isEmpty() ){
					
					 //message.setStudentId(userInfo.get(0).getStudentId());
					 message.setUserId(name);
					 message.setUsername(userInfo.get(0).getUsername());
					 message.setSex(userInfo.get(0).getSex());
					 
					 message.setSchool(userInfo.get(0).getSchool()); 
					 message.setGraTime(userInfo.get(0).getGraTime());
					 message.setIsTopSchool(userInfo.get(0).getIsTopSchool()); 
					 message.setMajor(userInfo.get(0).getMajor());
					 message.setPrefStandards(userInfo.get(0).getPrefStandards());
					 
					 message.setWorkspace(userInfo.get(0).getWorkspace());
					 message.setCityType(userInfo.get(0).getCityType());
					 message.setWork(userInfo.get(0).getWork());
				     message.setIsMajor(userInfo.get(0).getIsMajor());
				     message.setSalary(userInfo.get(0).getSalary());
				     message.setCompanyType(userInfo.get(0).getCompanyType());
				     
				     message.setIsTrain(userInfo.get(0).getIsTrain());
				     message.setWayOfOffer(userInfo.get(0).getWayOfOffer()); 
				     
				     string = JSON.toJSONString(message);
				}else{
					 //message.setStudentId(name);
					 message.setUserId(name);
					 message.setUsername("");
					 message.setSex("");
					 
					 message.setSchool(""); 
					 message.setGraTime(null);
					 message.setIsTopSchool(""); 
					 message.setMajor("");
					 message.setPrefStandards("");
					 
					 message.setWorkspace("");
					 message.setCityType("");
					 message.setWork("");
				     message.setIsMajor(null);
				     message.setSalary(null);
				     message.setCompanyType(null);
				     
				     message.setIsTrain("");
				     message.setWayOfOffer(null); 
				     string = JSON.toJSONString(message);
				}
			} catch (JsonGenerationException e) {
				e.printStackTrace();
			} catch (JsonMappingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	    	return  JSON.parse(string);  
    	} else{
    		BusiUserMessageExample example =new BusiUserMessageExample();
	    	example.createCriteria().andUserIdEqualTo(name);
	    	BusiUserMessage message = new BusiUserMessage();
	    	String string = null;
			List<BusiUserMessage> userInfo= busiUserMessageMapper.selectByExample(example);
			if( !userInfo.isEmpty() ){
				 message.setUserId(name);
				 message.setUserName(userInfo.get(0).getUserName());
				 message.setJob(userInfo.get(0).getJob());
				 message.setDepartment(userInfo.get(0).getDepartment());
			     message.setPhone(userInfo.get(0).getPhone());
			     message.setCompanyname(userInfo.get(0).getCompanyname());
			     message.setCompanyaddress(userInfo.get(0).getCompanyaddress());
			     message.setCompanytype(userInfo.get(0).getCompanytype());
			     message.setCompanyIntroduce(userInfo.get(0).getCompanyIntroduce());
			     System.out.println(userInfo.get(0).getCompanyIntroduce());
			     message.setEmail(userInfo.get(0).getEmail());
			     message.setCompanyWeb(userInfo.get(0).getCompanyWeb());
			     string = JSON.toJSONString(userInfo.get(0));
			}else{
				 message.setUserId(name);
				 message.setUserName("");
			   	 message.setJob("");
				 message.setDepartment("");
			     message.setPhone("");
			     message.setCompanyname("");
			     message.setCompanyaddress("");
			     message.setCompanytype("");
			     message.setCompanyIntroduce("");
			     message.setEmail("");
			     message.setCompanyWeb("");
			     string = JSON.toJSONString(message);
			}
    		return JSON.parse(string);
    	}
    }
    @RequestMapping(value = "/showMeChange.do",method=RequestMethod.POST)
    public @ResponseBody String getShopInJSON2(HttpServletRequest request) {  
    	HttpSession httpSession = request.getSession();
	    if("学生".equals(httpSession.getAttribute("roleType"))){
	    	ObjectMapper mapper = new ObjectMapper();
	    	UserMessageExample example =new UserMessageExample();
	    	example.createCriteria().andStudentIdEqualTo(request.getParameter("userId"));
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
	    	 userMessage.setStudentId(request.getParameter("userId"));
			 userMessage.setUserId(request.getParameter("userId"));
			 userMessage.setUsername(request.getParameter("username"));
			 userMessage.setSex(request.getParameter("sex"));
			 
			 userMessage.setSchool(request.getParameter("school")); 
			 userMessage.setGraTime(Integer.valueOf(request.getParameter("graTime"))); 
			 userMessage.setIsTopSchool(request.getParameter("isTopSchool")); 
			 userMessage.setMajor(request.getParameter("major"));
			 userMessage.setPrefStandards(request.getParameter("prefStandard"));
			 
			 userMessage.setWorkspace(request.getParameter("workspace"));
			 userMessage.setCityType(request.getParameter("cityType"));
			 userMessage.setWork(request.getParameter("work"));
		     userMessage.setIsMajor(Integer.valueOf(request.getParameter("isMajor")));
		     userMessage.setSalary(Integer.valueOf(request.getParameter("salary")));
		     userMessage.setCompanyType(Integer.valueOf(request.getParameter("companyType")));
		     
		     userMessage.setIsTrain(request.getParameter("isTrain"));
		     userMessage.setWayOfOffer(Integer.valueOf(request.getParameter("wayOfOffer"))); 
			iUserMessage.insert(userMessage);
			
			SchoolInfo schoolInfo = new SchoolInfo();
	    	schoolInfo.setSchool(request.getParameter("school"));
	    	schoolInfo.setMajor(request.getParameter("major"));
	    	iSchool.inert(schoolInfo);
	        return "success";  
	    }else{
	    	BusiUserMessageExample example =new BusiUserMessageExample();
	    	example.createCriteria().andBusiUserIdEqualTo(request.getParameter("userId"));
	    	busiUserMessageMapper.deleteByExample(example);
	    	 BusiUserMessage busiUserMessage = new BusiUserMessage();
	    	 busiUserMessage.setBusiUserId(request.getParameter("userId"));
	    	 busiUserMessage.setUserId(request.getParameter("userId"));
	    	 busiUserMessage.setUserName(request.getParameter("username"));
			 busiUserMessage.setJob(request.getParameter("job"));
			 busiUserMessage.setDepartment(request.getParameter("department"));
		     busiUserMessage.setPhone(request.getParameter("phone"));
		     busiUserMessage.setCompanyname(request.getParameter("companyName"));
		     busiUserMessage.setCompanyaddress(request.getParameter("companyAddress"));
		     busiUserMessage.setCompanytype(request.getParameter("companyType"));
		     busiUserMessage.setCompanyIntroduce(request.getParameter("companyIntroduce"));
		     busiUserMessage.setEmail(request.getParameter("email"));
		     busiUserMessage.setCompanyWeb(request.getParameter("companyWeb"));
			
		     busiUserMessageMapper.insert(busiUserMessage);
			
	    	return "success";  
	    } 
    }
}  
package com.student.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.student.dao.mapper.interfaces.BusiUserMessageMapper;
import com.student.dao.mapper.interfaces.JobInfoMapper;
import com.student.dao.mapper.interfaces.UserMapper;
import com.student.dao.mapper.interfaces.UserMessageMapper;
import com.student.dao.mapper.interfaces.businessUserMapper;
import com.student.dao.mapper.bo.BusiUserMessage;
import com.student.dao.mapper.bo.BusiUserMessageExample;
import com.student.dao.mapper.bo.JobInfo;
import com.student.dao.mapper.bo.JobInfoExample;
import com.student.dao.mapper.bo.SchoolInfo;
import com.student.dao.mapper.bo.User;
import com.student.dao.mapper.bo.UserExample;
import com.student.dao.mapper.bo.UserMessage;
import com.student.dao.mapper.bo.UserMessageExample;
import com.student.dao.mapper.bo.businessUser;
import com.student.dao.mapper.bo.businessUserExample;
import com.student.service.interfaces.IBusiMsg;
import com.student.service.interfaces.IBusiUser;
import com.student.service.interfaces.IJobInfo;
import com.student.service.interfaces.ISchool;
import com.student.service.interfaces.IUserMessage;
import com.student.service.interfaces.UserInsert;
import com.student.until.CityInfo;
import com.student.until.WorkInfoMap;

@Controller  
@RequestMapping("/showMessage")
public class ShowMsgController {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	@Autowired
	private IUserMessage iUserMessage;
	@Autowired
	private UserMessageMapper userMessageMapper;
	@Autowired
	private UserInsert userInsert;
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private ISchool iSchool;
	@Autowired
	IBusiUser iBusiUser;
	@Autowired
	businessUserMapper businessUserMapper;
	@Autowired
	IBusiMsg iBusiMsg;
	@Autowired
	BusiUserMessageMapper busiUserMessageMapper;
	@Autowired
	private IJobInfo iJobInfo;
	
	@Autowired
	private JobInfoMapper jobInfoMapper;
	
	@RequestMapping("/showMain")
	public String showMain(){
		return "workInfo";
	}
	
	@RequestMapping("/cityInfo")
	public void cityInfoSession(HttpServletRequest request,HttpServletResponse response){
		try {
			request.getRequestDispatcher("/WEB-INF/jsp/cityInfo.jsp").forward(request, response);
		} catch (ServletException e) {
			logger.error(e.getMessage(),e);
		} catch (IOException e) {
			logger.error(e.getMessage(),e);
		}
	}
	
	@RequestMapping("/cityInfoDao.do")
	public void cityInfoDao(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		String cityName = request.getParameter("cityName");
		HttpSession session = request.getSession();
		session.setAttribute("cityName", cityName);
	}
	
	@RequestMapping("/selectByMe")
	public String selectByMe(){
		return "selectByMe";
	}
	@RequestMapping("/releaseJobInfo")
	public String releaseJobInfo(){
		return "releaseJobInfo";
	}
	@RequestMapping(value = "/cityInfoGet.do",method=RequestMethod.POST)
	public @ResponseBody Object cityInfoGet(HttpServletRequest request,HttpServletResponse response){
		HttpSession session = request.getSession();
		Map<String, String> param;
		Calendar date = Calendar.getInstance();
        String year = String.valueOf(date.get(Calendar.YEAR));
		String cityName = (String)session.getAttribute("cityName");
		Map<String, List> cityInfo = new HashMap<String, List>();
		/*省级数据处理开始*/
		
		//获取毕业人数
		param = new HashMap<String, String>();
		param.put("cityName", cityName);
		param.put("year", year);
		List<CityInfo> successiveGraduation = iUserMessage.selectCityInfo(param);
		cityInfo.put("successiveGraduation", successiveGraduation);
		
		//就业、深造、不确定变化
		param = new HashMap<String, String>();
		param.put("cityName", cityName);
		param.put("year", year);
		List<List<CityInfo>> threeTypeChanege = new ArrayList<List<CityInfo>>();
		param.put("noJobInfo", "and work not in ('继续深造','未确定')");
		List<CityInfo> workChange = iUserMessage.selectCityInfo(param);
		param.put("noJobInfo", "and work = '继续深造'");
		List<CityInfo> continueChange = iUserMessage.selectCityInfo(param);
		param.put("noJobInfo", "and work = '未确定'");
		List<CityInfo> unknowChange = iUserMessage.selectCityInfo(param);
		threeTypeChanege.add(workChange);
		threeTypeChanege.add(continueChange);
		threeTypeChanege.add(unknowChange);
		cityInfo.put("threeTypeChange", threeTypeChanege);
		//就业率变化
		param = new HashMap<String, String>();
		param.put("cityName", cityName);
		param.put("year", year);
		param.put("noJobInfo", "and work not in ('继续深造','未确定')");
		List<CityInfo> employmentRate = iUserMessage.selectEmployRate(param);
		cityInfo.put("employmentRate", employmentRate);
		//是否从事本专业
		param = new HashMap<String, String>();
		param.put("cityName", cityName);
		param.put("year", year);
		param.put("noJobInfo", "and is_major = 1 ");
		List<CityInfo> isMajorJob = iUserMessage.selectEmployRate2(param);
		cityInfo.put("isMajorJob", isMajorJob);
		//实习与就业关系
		param = new HashMap<String, String>();
		param.put("factors", "is_train");
		param.put("cityName", cityName);
		param.put("year", year);
		param.put("noJobInfo", "and work not in ('继续深造','未确定')");
		List<CityInfo> trainAndJob = iUserMessage.selectTrainAndJob(param);
		cityInfo.put("trainAndJob", trainAndJob);
		//成绩与就业关系
		param = new HashMap<String, String>();
		param.put("factors", "pref_standards");
		param.put("cityName", cityName);
		param.put("year", year);
		param.put("noJobInfo", "and work not in ('继续深造','未确定')");
		List<CityInfo> gradeAndJob = iUserMessage.selectTrainAndJob(param);
		cityInfo.put("gradeAndJob", gradeAndJob);
		//不同单位人数变化
		param = new HashMap<String, String>();
		param.put("cityName", cityName);
		param.put("year", year);
		String[] noJobInfos = {"0","1","2","3","4","5","6"};
		String[] comTypeInfo = {"国有企业","外资企业","私有企业","事业单位","股份制公司","合资企业","上市公司"};
		List<List<CityInfo>> compTypeAndJobs = new ArrayList<List<CityInfo>>();
		for(int k=0 ;k< noJobInfos.length ; k++){
			param.put("noJobInfo", "and company_type = " + noJobInfos[k]);
			List<CityInfo> compTypeAndJob = iUserMessage.selectCityInfo(param);
			if( compTypeAndJob.size() < 5 ){
				int x = Integer.valueOf(year);
				Integer[] year2 = {x,x-1,x-2,x-3,x-4};
				for(int j = 0 ; j < 5 ; j++ ){
					int count=0;
					CityInfo cityInfo2;
					int xx = compTypeAndJob.size();
					if( xx > 0 ){
						for(int i = 0 ; i < compTypeAndJob.size() ; i++ ){
							count++;
							if(compTypeAndJob.get(i).year.equals(year2[j]+"")){
								compTypeAndJob.get(i).setFactor(comTypeInfo[k]);
								break;
							}
							if(count == xx){
								cityInfo2 = new CityInfo();
								cityInfo2.setYear(String.valueOf(year2[j]));
								cityInfo2.setNumber("0");
								cityInfo2.setFactor(comTypeInfo[k]);
								compTypeAndJob.add(j,cityInfo2);
							}
						}
					}else {
						cityInfo2 = new CityInfo();
						cityInfo2.setYear(String.valueOf(year2[j]));
						cityInfo2.setNumber("0");
						cityInfo2.setFactor(comTypeInfo[k]);
						compTypeAndJob.add(cityInfo2);
					}
						
				}
			}
			compTypeAndJobs.add(compTypeAndJob);
		}
		cityInfo.put("compTypeAndJobs", compTypeAndJobs);
		//每年最热十大专业
		param = new HashMap<String, String>();
		param.put("cityName", cityName);
		param.put("year", year);
		List<CityInfo> topTenJob = iUserMessage.selectTopTenJob(param);
		cityInfo.put("topTenJob", topTenJob);
		logger.info("所有数据："+JSON.parse(JSON.toJSONString(cityInfo)));
		/*省级数据处理结束*/
		
		return JSON.parse(JSON.toJSONString(cityInfo));
	}
    @RequestMapping(value = "/workInfoMap.do",method=RequestMethod.POST)
    public @ResponseBody Object getWorkInfoMap(HttpServletRequest request,HttpServletResponse response) {  
    	
    	String[] workSpaceName = { "北京","天津","上海","重庆","河北","河南","云南","辽宁","黑龙江","湖南",
    					"安徽","山东","新疆","江苏","浙江","江西","湖北","广西","甘肃","山西","内蒙古","陕西",
    					"吉林","福建","贵州","广东","青海","西藏","四川","宁夏","海南","台湾","香港","澳门"};
    	WorkInfoMap infoMap ;
    	List<WorkInfoMap> infoMapList = new ArrayList<WorkInfoMap>();
    	List<WorkInfoMap> continueList = new ArrayList<WorkInfoMap>();
    	List<WorkInfoMap> unknowList = new ArrayList<WorkInfoMap>();
    	UserMessageExample example =new UserMessageExample();
    	Long num = 0L;
    	List<String> noJobInfo = new ArrayList<String>();
    	noJobInfo.add("继续深造");
    	noJobInfo.add("未确定");
    	for ( int i = 0 ; i < workSpaceName.length; i++ ){
    		//就业人数查询
    		Calendar calendar = Calendar.getInstance();
    		
    		example.createCriteria().andWorkspaceEqualTo(workSpaceName[i]).andWorkIsNotNull().andWorkNotIn(noJobInfo).andGraTimeEqualTo(calendar.get(Calendar.YEAR));
    		infoMap = new WorkInfoMap();
    		num = iUserMessage.countByExample(example);
    		if ( num != null){
    			infoMap.setValue(num);
    		}else {
    			infoMap.setValue(0L);
    		}
    		infoMap.setName(workSpaceName[i]);
    		infoMapList.add(infoMap);
    		example.clear();
    		
    		//继续深造人数查询
    		example.createCriteria().andWorkspaceEqualTo(workSpaceName[i]).andWorkEqualTo("继续深造").andGraTimeEqualTo(calendar.get(Calendar.YEAR));
    		infoMap = new WorkInfoMap();
    		num = iUserMessage.countByExample(example);
    		if ( num != null){
    			infoMap.setValue(num);
    		}else {
    			infoMap.setValue(0L);
    		}
    		infoMap.setName(workSpaceName[i]);
    		continueList.add(infoMap);
    		example.clear();
    		
    		//未确定人数查询
    		example.createCriteria().andWorkspaceEqualTo(workSpaceName[i]).andWorkEqualTo("未确定").andGraTimeEqualTo(calendar.get(Calendar.YEAR));
    		infoMap = new WorkInfoMap();
    		num = iUserMessage.countByExample(example);
    		if ( num != null){
    			infoMap.setValue(num);
    		}else {
    			infoMap.setValue(0L);
    		}
    		infoMap.setName(workSpaceName[i]);
    		unknowList.add(infoMap);
    		example.clear();
    	}
    	Map<String, List<WorkInfoMap>> mapInfoList = new HashMap();
    	mapInfoList.put("infoMapList",infoMapList);
    	mapInfoList.put("continueList",continueList);
    	mapInfoList.put("unknowList",unknowList);
    	String string=null;
		string = JSON.toJSONString(mapInfoList);
		logger.info(string);
    	return  JSON.parse(string);
    }
    
    class A{
    	public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
		private String name;
    	private String value;
    }
    @RequestMapping(value = "/selectByMe.do",method=RequestMethod.POST)
    public @ResponseBody Object getSelectByMe(HttpServletRequest request,HttpServletResponse response) {
    	String selectInfos = request.getParameter("selectInfos");
    	Gson gson = new Gson();
    	Map<String,String> example = new HashMap<String,String>();
    	Map<String,String> example2 = new HashMap<String,String>();
    	List<A> list = new ArrayList<A>();
    	list = gson.fromJson(selectInfos, new TypeToken<List<A>>(){}.getType());
    	for( int i = 0 ;i < list.size() ; i++ ){
	    	if( "gradTime".equals(list.get(i).name)){
	    		example.put("gradTime", "and gra_time = '"+list.get(i).getValue()+"'");
	   		}else if ( "school".equals(list.get(i).name)){
	   			example.put("school", "and school = '"+list.get(i).getValue()+"'");
    		}else if ( "major".equals(list.get(i).name)){
	    		example.put("major", "and major = '"+list.get(i).getValue()+"'");
	   		}else if ( "trainTime".equals(list.get(i).name)){
	   			example.put("trainTime", "and is_train = '"+list.get(i).getValue()+"'");
    		}else if ( "prefStandards".equals(list.get(i).name)){
	    		example.put("prefStandards", "and pref_standards = '"+list.get(i).getValue()+"'");
	    	}else if ( "companyType".equals(list.get(i).name)){
	   			String[] compType = {"国有企业","外资企业","私有企业","事业单位","股份制公司","合资企业","上市公司"};
	   			int count = -1;
	   			for (String s : compType ){
	   				if( s.equals(list.get(i).value )){
    					count++;
	    				break;
	    			}
	    		}
	    		example.put("companyType", "and company_type = '"+count+"'");
	    	}else if ( "sex".equals(list.get(i).name)){
	    		example.put("sex", "and sex = '"+list.get(i).getValue()+"'");
	    	}else if ( "salary1".equals(list.get(i).name)){
	    		example.put("salary1", "and salary >= '"+list.get(i).getValue()+"'");
	    	}else if ( "salary2".equals(list.get(i).name)){
	    		example.put("salary2", "and salary <= '"+list.get(i).getValue()+"'");
	    	}
	    	if( i != (list.size()-1) ){
	    		if( "gradTime".equals(list.get(i).name)){
		   			example2.put("gradTime", "and gra_time = '"+list.get(i).getValue()+"'");
		   		}else if ( "school".equals(list.get(i).name)){
		   			example2.put("school", "and school = '"+list.get(i).getValue()+"'");
	    		}else if ( "major".equals(list.get(i).name)){
		   			example2.put("major", "and major = '"+list.get(i).getValue()+"'");
		   		}else if ( "trainTime".equals(list.get(i).name)){
		   			example2.put("trainTime", "and is_train = '"+list.get(i).getValue()+"'");
	    		}else if ( "prefStandards".equals(list.get(i).name)){
		    		example2.put("prefStandards", "and pref_standards = '"+list.get(i).getValue()+"'");
		    	}else if ( "companyType".equals(list.get(i).name)){
		   			String[] compType = {"国有企业","外资企业","私有企业","事业单位","股份制公司","合资企业","上市公司"};
		   			int count = -1;
		   			for (String s : compType ){
		   				if( s.equals(list.get(i).value )){
	    					count++;
		    				break;
		    			}
		    		}
		    		example2.put("companyType", "and company_type = '"+count+"'");
		    	}else if ( "sex".equals(list.get(i).name)){
		    		example2.put("sex", "and sex = '"+list.get(i).getValue()+"'");
		    	}else if ( "salary1".equals(list.get(i).name)){
		    		example2.put("salary1", "and salary >= '"+list.get(i).getValue()+"'");
		    	}else if ( "salary2".equals(list.get(i).name)){
		    		example2.put("salary2", "and salary <= '"+list.get(i).getValue()+"'");
		    	}
	    	}else{
		    	if( "gradTime".equals(list.get(i).name)){
		    		example2.put("gradTime", "and gra_time != '"+list.get(i).getValue()+"'");
		    	}else if ( "school".equals(list.get(i).name)){
		    		example2.put("school", "and school != '"+list.get(i).getValue()+"'");
		    	}else if ( "major".equals(list.get(i).name)){
		    		example2.put("major", "and major != '"+list.get(i).getValue()+"'");
		    	}else if ( "trainTime".equals(list.get(i).name)){
		    		example2.put("trainTime", "and is_train != '"+list.get(i).getValue()+"'");
		    	}else if ( "prefStandards".equals(list.get(i).name)){
		    		example2.put("prefStandards", "and pref_standards != '"+list.get(i).getValue()+"'");
		    	}else if ( "companyType".equals(list.get(i).name)){
		    		String[] compType = {"国有企业","外资企业","私有企业","事业单位","股份制公司","合资企业","上市公司"};
		    		int count = -1;
		    		for (String s : compType ){
		    			if( s.equals(list.get(i).value )){
		    				count++;
		    				break;
		    			}
		    		}
		    		example2.put("companyType", "and company_type != '"+count+"'");
		    	}else if ( "sex".equals(list.get(i).name)){
		    		example2.put("sex", "and sex != '"+list.get(i).getValue()+"'");
		    	}else if ( "salary1".equals(list.get(i).name)){
		    		example2.put("salary1", "and salary < '"+list.get(i).getValue()+"'");
		    	}else if ( "salary2".equals(list.get(i).name)){
		    		example2.put("salary2", "and salary > '"+list.get(i).getValue()+"'");
		    	}
	    	}
	   }
    	Long number = iUserMessage.countBySelectByMe(example);
    	A a = new A();
    	a.setName(list.get(list.size()-1).name);
    	a.setValue(number.toString());
    	System.out.println(JSON.toJSONString(example2));
    	Long number2 = iUserMessage.countBySelectByMe(example2);
    	A b = new A();
    	b.setName(list.get(list.size()-1).name);
    	b.setValue(number2.toString());
    	Map<String, A> num = new HashMap<String, A>();
    	
    	num.put("perCount", a);
    	num.put("perCount2", b);
    	System.out.println(JSON.toJSONString(num));
    	return JSON.parse(JSON.toJSONString(num));
    }
    
    @RequestMapping(value = "/selectByMeIndex.do",method=RequestMethod.POST)
    public @ResponseBody Object getSelectByMeIndex(HttpServletRequest request,HttpServletResponse response) {
    	List<SchoolInfo> schoolInfos = new ArrayList<SchoolInfo>();
    	schoolInfos = iSchool.selectSchoolInfo();
    	Map<String,Set<String>> selectByMeIndex = new HashMap<String,Set<String>>();
    	Set<String> schoolNames = new HashSet<String>();
     	Set<String> majorNames = new HashSet<String>();
    	for (SchoolInfo schoolInfo : schoolInfos){
    		schoolNames.add(schoolInfo.getSchool());
    		majorNames.add(schoolInfo.getMajor());
    	}
    	selectByMeIndex.put("schoolNames", schoolNames);
    	selectByMeIndex.put("majorNames", majorNames);
    	
    	logger.info(""+JSON.toJSONString(selectByMeIndex));
    	return JSON.parse(JSON.toJSONString(selectByMeIndex));
    }
    
    @RequestMapping(value = "/releaseJobInfoGet.do",method=RequestMethod.POST)
    public @ResponseBody Object releaseJobInfoGet(HttpServletRequest request,
    		HttpServletResponse response,int page,int rows,String jobName) throws ParseException {
    	Map<String,Object> map = new HashMap<String,Object>();
    	HttpSession httpSession = request.getSession();
    	/*if( null == jobName ){
    		if( null == createTime ){
    			if( null == endTime ){
			    	List<JobInfo> releaseJobInfos = iJobInfo.selectByPage((page-1)*rows,page*rows);
			    	JobInfoExample example = new JobInfoExample();
			    	example.createCriteria().andJobIdIsNotNull();
			    	Long total = jobInfoMapper.countByExample(example);
			    	map.put("total", total);
			    	map.put("rows", JSON.toJSON(releaseJobInfos));
    			}else{
    				List<JobInfo> releaseJobInfos = iJobInfo.selectByPage((page-1)*rows,page*rows);
			    	JobInfoExample example = new JobInfoExample();
			    	example.createCriteria().andJobIdIsNotNull().andEndtimeLessThanOrEqualTo(endTime);
			    	Long total = jobInfoMapper.countByExample(example);
			    	map.put("total", total);
			    	map.put("rows", JSON.toJSON(releaseJobInfos));
    			}
    		}else{
    			if( null == endTime ){
    				List<JobInfo> releaseJobInfos = iJobInfo.selectByPage((page-1)*rows,page*rows);
    		    	JobInfoExample example = new JobInfoExample();
    		    	example.createCriteria().andJobIdIsNotNull().andCreatetimeGreaterThanOrEqualTo(createTime);
    		    	Long total = jobInfoMapper.countByExample(example);
    		    	map.put("total", total);
    		    	map.put("rows", JSON.toJSON(releaseJobInfos));
    			}else{
    				List<JobInfo> releaseJobInfos = iJobInfo.selectByPage((page-1)*rows,page*rows);
    		    	JobInfoExample example = new JobInfoExample();
    		    	example.createCriteria().andJobIdIsNotNull().andCreatetimeGreaterThanOrEqualTo(createTime).andEndtimeLessThanOrEqualTo(endTime);
    		    	Long total = jobInfoMapper.countByExample(example);
    		    	map.put("total", total);
    		    	map.put("rows", JSON.toJSON(releaseJobInfos));
    			}
    		}
    	}else{
    		if( null == createTime ){
    			if( null == endTime ){
		    		List<JobInfo> releaseJobInfos = iJobInfo.selectByPage((page-1)*rows,page*rows);
			    	JobInfoExample example = new JobInfoExample();
			    	example.createCriteria().andJobIdIsNotNull().andJobNameLike(jobName);
			    	Long total = jobInfoMapper.countByExample(example);
			    	map.put("total", total);
			    	map.put("rows", JSON.toJSON(releaseJobInfos));
    			}else{
    				List<JobInfo> releaseJobInfos = iJobInfo.selectByPage((page-1)*rows,page*rows);
			    	JobInfoExample example = new JobInfoExample();
			    	example.createCriteria().andJobIdIsNotNull().andJobNameLike(jobName).andEndtimeLessThanOrEqualTo(endTime);
			    	Long total = jobInfoMapper.countByExample(example);
			    	map.put("total", total);
			    	map.put("rows", JSON.toJSON(releaseJobInfos));
    			}
    		}else{
    			if( null == endTime ){
	    			List<JobInfo> releaseJobInfos = iJobInfo.selectByPage((page-1)*rows,page*rows);
			    	JobInfoExample example = new JobInfoExample();
			    	example.createCriteria().andJobIdIsNotNull().andJobNameLike(jobName).andCreatetimeGreaterThanOrEqualTo(createTime);
			    	Long total = jobInfoMapper.countByExample(example);
			    	map.put("total", total);
			    	map.put("rows", JSON.toJSON(releaseJobInfos));
    			}else{
    				List<JobInfo> releaseJobInfos = iJobInfo.selectByPage((page-1)*rows,page*rows);
			    	JobInfoExample example = new JobInfoExample();
			    	example.createCriteria().andJobIdIsNotNull().andJobNameLike(jobName).andCreatetimeGreaterThanOrEqualTo(createTime).andEndtimeLessThanOrEqualTo(endTime);
			    	Long total = jobInfoMapper.countByExample(example);
			    	map.put("total", total);
			    	map.put("rows", JSON.toJSON(releaseJobInfos));
    			}
    		}
    	}*/
    	SimpleDateFormat dFormat = new SimpleDateFormat("yyyyMMddHHmmss");
    	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	if( null == jobName ){
    		List<JobInfo> releaseJobInfos = iJobInfo.selectByPage((page-1)*rows,page*rows,String.valueOf(httpSession.getAttribute("name")));
	    	JobInfoExample example = new JobInfoExample();
	    	example.createCriteria().andJobIdIsNotNull().andPublishEqualTo(String.valueOf(httpSession.getAttribute("name")));
	    	Long total = jobInfoMapper.countByExample(example);
	    	map.put("total", total);
	    	for( int i = 0 ; i < releaseJobInfos.size() ; i++ ){
	    		Date createdate = dFormat.parse(releaseJobInfos.get(i).getCreatetime());
	    		releaseJobInfos.get(i).setCreatetime(dateFormat.format(createdate));
	    		Date enddate = dFormat.parse(releaseJobInfos.get(i).getCreatetime());
	    		releaseJobInfos.get(i).setEndtime(dateFormat.format(enddate));
	    	}
	    	map.put("rows", JSON.toJSON(releaseJobInfos));
    	}else{
    		List<JobInfo> releaseJobInfos = iJobInfo.selectByPageAndJobName((page-1)*rows,page*rows,String.valueOf(httpSession.getAttribute("name")),"%"+jobName+"%");
	    	JobInfoExample example = new JobInfoExample();
	    	example.createCriteria().andJobIdIsNotNull().andPublishEqualTo(String.valueOf(httpSession.getAttribute("name"))).andJobNameLike("%"+jobName+"%");
	    	Long total = jobInfoMapper.countByExample(example);
	    	for( int i = 0 ; i < releaseJobInfos.size() ; i++ ){
	    		Date createdate = dFormat.parse(releaseJobInfos.get(i).getCreatetime());
	    		releaseJobInfos.get(i).setCreatetime(dateFormat.format(createdate));
	    		Date enddate = dFormat.parse(releaseJobInfos.get(i).getEndtime());
	    		releaseJobInfos.get(i).setEndtime(dateFormat.format(enddate));
	    	}
	    	map.put("total", total);
	    	map.put("rows", JSON.toJSON(releaseJobInfos));
	    	logger.info("showMsgController SelectJobInfo:"+(page-1)*rows+page*rows+"%"+jobName+"%"+String.valueOf(httpSession.getAttribute("name"))+"||"+jobName+JSON.toJSONString(map));

    	}
    	return JSON.parse(JSON.toJSONString(map));
    }
    @RequestMapping(value = "/releaseJobInfoGet2.do",method=RequestMethod.POST)
    public @ResponseBody Object releaseJobInfoGet2(HttpServletRequest request) throws ParseException {

    	SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	SimpleDateFormat dFormat2 = new SimpleDateFormat("yyyyMMddHHmmss");
    	HttpSession httpSession = request.getSession();
    	Gson gson = new Gson();
    	JobInfo jobInfo = gson.fromJson( request.getParameter("itemInfo"), JobInfo.class);
    	logger.info("showMsgController JobInfo"+request.getParameter("itemInfo"));
    	if( null != jobInfo ){
    		if( null != jobInfo.getJobId() ){
    			Date createDate = dFormat.parse(jobInfo.getCreatetime());
    			Date endDate = dFormat.parse(jobInfo.getEndtime());
    			jobInfo.setCreatetime(dFormat2.format(createDate));
    			jobInfo.setEndtime(dFormat2.format(endDate));
    			jobInfoMapper.updateByPrimaryKey(jobInfo);
    		}else{
    			JobInfoExample example = new JobInfoExample();
    			example.setOrderByClause("CAST(job_id AS SIGNED INTEGER) desc");
    			List<JobInfo> list = jobInfoMapper.selectByExample(example);
    			Date createDate = dFormat.parse(jobInfo.getCreatetime());
    			Date endDate = dFormat.parse(jobInfo.getEndtime());
    			jobInfo.setCreatetime(dFormat.format(createDate));
    			jobInfo.setEndtime(dFormat.format(endDate));
    			jobInfo.setJobId(String.valueOf(Integer.valueOf(list.get(0).getJobId())+1));
    			jobInfo.setPublish(String.valueOf(httpSession.getAttribute("name")));
    			jobInfoMapper.insert(jobInfo);
    		}
    	}
    	List<JobInfo> jobInfo2 = gson.fromJson( request.getParameter("delItems"),new TypeToken<List<JobInfo>>(){}.getType());
    	if( null != jobInfo2 && !jobInfo2.isEmpty() ){
    		for( JobInfo info : jobInfo2 ){
    			JobInfoExample example = new JobInfoExample();
        		example.createCriteria().andJobIdEqualTo(info.getJobId());
        		jobInfoMapper.deleteByExample(example);
        	}
    	}
    	return "success";
    }
    
    
    @RequestMapping(value="/studentMsg")
    public String studentMsg(){
    	return "studentMsg";
    }
    @RequestMapping(value="/studentAccount")
    public String studentAccount(){
    	return "studentAccount";
    }
    @RequestMapping(value="/busiMsg")
    public String busiMsg(){
    	return "busiMsg";
    }
    @RequestMapping(value="/busiAccount")
    public String busiAccount(){
    	return "busiAccount";
    }
    @RequestMapping(value="/jobMsg")
    public String jobMsg(){
    	return "jobMsg";
    }
    
    @RequestMapping(value = "/studentMsgGet.do",method=RequestMethod.POST)
    public @ResponseBody Object studentMsgGet(HttpServletRequest request,
    		HttpServletResponse response,int page,int rows,String uid) throws ParseException {
    	Map<String,Object> map = new HashMap<String,Object>();
    	if( null == uid ){
    		List<User> releaseJobInfos = userInsert.selectByPage((page-1)*rows,page*rows);
	    	UserExample example = new UserExample();
	    	example.createCriteria().andUserIdIsNotNull();
	    	Long total = userMapper.countByExample(example);
	    	map.put("total", total);
	    	map.put("rows", JSON.toJSON(releaseJobInfos));
    	}else{
    		List<User> releaseJobInfos = userInsert.selectByPageAndUserId((page-1)*rows,page*rows,"%"+uid+"%");
    		UserExample example = new UserExample();
	    	example.createCriteria().andUserIdIsNotNull().andUserIdLike("%"+uid+"%");
	    	Long total = userMapper.countByExample(example);
	    	map.put("total", total);
	    	map.put("rows", JSON.toJSON(releaseJobInfos));
    	}
    	return JSON.parse(JSON.toJSONString(map));
    }
    
    @RequestMapping(value = "/studentMsgGet2.do",method=RequestMethod.POST)
    public @ResponseBody Object studentMsgGet2(HttpServletRequest request) throws ParseException {

    	Gson gson = new Gson();
    	User jobInfo = gson.fromJson( request.getParameter("itemInfo"), User.class);
    	logger.info("showMsgController JobInfo"+request.getParameter("itemInfo"));
    	if( null != jobInfo ){
    		if( null != jobInfo.getUserId() ){
    			userMapper.updateByPrimaryKey(jobInfo);
    		}else{
    			jobInfo.setUserId(jobInfo.getUserName());
    			userMapper.insert(jobInfo);
    		}
    	}
    	List<User> jobInfo2 = gson.fromJson( request.getParameter("delItems"),new TypeToken<List<User>>(){}.getType());
    	if( null != jobInfo2 && !jobInfo2.isEmpty() ){
    		for( User info : jobInfo2 ){
    			UserExample example = new UserExample();
        		example.createCriteria().andUserIdEqualTo(info.getUserId());
        		userMapper.deleteByExample(example);
        	}
    	}
    	return "success";
    }
    
    @RequestMapping(value = "/studentAccountGet.do",method=RequestMethod.POST)
    public @ResponseBody Object studentAccountGet(HttpServletRequest request,
    		HttpServletResponse response,int page,int rows,String uid) throws ParseException {
    	Map<String,Object> map = new HashMap<String,Object>();
    	if( null == uid ){
    		List<UserMessage> releaseJobInfos = iUserMessage.selectByPage((page-1)*rows,page*rows);
	    	UserMessageExample example = new UserMessageExample();
	    	example.createCriteria().andUserIdIsNotNull();
	    	Long total = userMessageMapper.countByExample(example);
	    	map.put("total", total);
	    	map.put("rows", JSON.toJSON(releaseJobInfos));
    	}else{
    		List<UserMessage> releaseJobInfos = iUserMessage.selectByPageAndUserId((page-1)*rows,page*rows,"%"+uid+"%");
    		UserMessageExample example = new UserMessageExample();
	    	example.createCriteria().andUserIdIsNotNull().andUserIdLike("%"+uid+"%");
	    	Long total = userMessageMapper.countByExample(example);
	    	map.put("total", total);
	    	map.put("rows", JSON.toJSON(releaseJobInfos));
    	}
    	return JSON.parse(JSON.toJSONString(map));
    }
    
    @RequestMapping(value = "/studentAccountGet2.do",method=RequestMethod.POST)
    public @ResponseBody Object studentAccountGet2(HttpServletRequest request) throws ParseException {

    	Gson gson = new Gson();
    	UserMessage jobInfo = gson.fromJson( request.getParameter("itemInfo"), UserMessage.class);
    	logger.info("showMsgController JobInfo"+request.getParameter("itemInfo"));
    	if( null != jobInfo ){
    		if( null != jobInfo.getStudentId() ){
    			userMessageMapper.updateByPrimaryKey(jobInfo);
    		}else{
    			jobInfo.setStudentId(jobInfo.getUserId());
    			userMessageMapper.insert(jobInfo);
    		}
    	}
    	List<UserMessage> jobInfo2 = gson.fromJson( request.getParameter("delItems"),new TypeToken<List<UserMessage>>(){}.getType());
    	if( null != jobInfo2 && !jobInfo2.isEmpty() ){
    		for( UserMessage info : jobInfo2 ){
    			UserMessageExample example = new UserMessageExample();
        		example.createCriteria().andStudentIdEqualTo(info.getStudentId());
        		userMessageMapper.deleteByExample(example);
        	}
    	}
    	return "success";
    }
    
    @RequestMapping(value = "/busiAccountGet.do",method=RequestMethod.POST)
    public @ResponseBody Object busiAccountGet(HttpServletRequest request,
    		HttpServletResponse response,int page,int rows,String uid) throws ParseException {
    	Map<String,Object> map = new HashMap<String,Object>();
    	if( null == uid ){
    		List<businessUser> releaseJobInfos = iBusiUser.selectByPage((page-1)*rows,page*rows);
    		businessUserExample example = new businessUserExample();
	    	example.createCriteria().andUserIdIsNotNull();
	    	Long total = businessUserMapper.countByExample(example);
	    	map.put("total", total);
	    	map.put("rows", JSON.toJSON(releaseJobInfos));
    	}else{
    		List<businessUser> releaseJobInfos = iBusiUser.selectByPageAndUserId((page-1)*rows,page*rows,"%"+uid+"%");
    		businessUserExample example = new businessUserExample();
	    	example.createCriteria().andUserIdIsNotNull().andUserIdLike("%"+uid+"%");
	    	Long total = businessUserMapper.countByExample(example);
	    	map.put("total", total);
	    	map.put("rows", JSON.toJSON(releaseJobInfos));
    	}
    	return JSON.parse(JSON.toJSONString(map));
    }
    
    @RequestMapping(value = "/busiAccountGet2.do",method=RequestMethod.POST)
    public @ResponseBody Object busiAccountGet2(HttpServletRequest request) throws ParseException {

    	Gson gson = new Gson();
    	businessUser jobInfo = gson.fromJson( request.getParameter("itemInfo"), businessUser.class);
    	logger.info("showMsgController JobInfo"+request.getParameter("itemInfo"));
    	if( null != jobInfo ){
    		if( null != jobInfo.getUserId() ){
    			businessUserMapper.updateByPrimaryKey(jobInfo);
    		}else{
    			jobInfo.setUserId(jobInfo.getUserName());
    			businessUserMapper.insert(jobInfo);
    		}
    	}
    	List<businessUser> jobInfo2 = gson.fromJson( request.getParameter("delItems"),new TypeToken<List<businessUser>>(){}.getType());
    	if( null != jobInfo2 && !jobInfo2.isEmpty() ){
    		for( businessUser info : jobInfo2 ){
    			businessUserExample example = new businessUserExample();
        		example.createCriteria().andUserIdEqualTo(info.getUserId());
        		businessUserMapper.deleteByExample(example);
        	}
    	}
    	return "success";
    }
    
    @RequestMapping(value = "/busiMsgGet.do",method=RequestMethod.POST)
    public @ResponseBody Object busiMsgGet(HttpServletRequest request,
    		HttpServletResponse response,int page,int rows,String uid) throws ParseException {
    	Map<String,Object> map = new HashMap<String,Object>();
    	if( null == uid ){
    		List<BusiUserMessage> releaseJobInfos = iBusiMsg.selectByPage((page-1)*rows,page*rows);
	    	BusiUserMessageExample example = new BusiUserMessageExample();
	    	example.createCriteria().andBusiUserIdIsNotNull();
	    	Long total = busiUserMessageMapper.countByExample(example);
	    	map.put("total", total);
	    	map.put("rows", JSON.toJSON(releaseJobInfos));
    	}else{
    		List<BusiUserMessage> releaseJobInfos = iBusiMsg.selectByPageAndUserId((page-1)*rows,page*rows,"%"+uid+"%");
    		BusiUserMessageExample example = new BusiUserMessageExample();
	    	example.createCriteria().andBusiUserIdIsNotNull().andUserIdLike("%"+uid+"%");
	    	Long total = busiUserMessageMapper.countByExample(example);
	    	map.put("total", total);
	    	map.put("rows", JSON.toJSON(releaseJobInfos));
    	}
    	return JSON.parse(JSON.toJSONString(map));
    }
    
    @RequestMapping(value = "/busiMsgGet2.do",method=RequestMethod.POST)
    public @ResponseBody Object busiMsgGet2(HttpServletRequest request) throws ParseException {

    	Gson gson = new Gson();
    	BusiUserMessage jobInfo = gson.fromJson( request.getParameter("itemInfo"), BusiUserMessage.class);
    	logger.info("showMsgController JobInfo"+request.getParameter("itemInfo"));
    	if( null != jobInfo ){
    		if( null != jobInfo.getBusiUserId() ){
    			busiUserMessageMapper.updateByPrimaryKey(jobInfo);
    		}else{
    			jobInfo.setBusiUserId(jobInfo.getUserId());
    			busiUserMessageMapper.insert(jobInfo);
    		}
    	}
    	List<BusiUserMessage> jobInfo2 = gson.fromJson( request.getParameter("delItems"),new TypeToken<List<BusiUserMessage>>(){}.getType());
    	if( null != jobInfo2 && !jobInfo2.isEmpty() ){
    		for( BusiUserMessage info : jobInfo2 ){
    			BusiUserMessageExample example = new BusiUserMessageExample();
        		example.createCriteria().andBusiUserIdEqualTo(info.getBusiUserId());
        		busiUserMessageMapper.deleteByExample(example);
        	}
    	}
    	return "success";
    }
}

package com.student.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.student.dao.mapper.bo.JobInfo;
import com.student.dao.mapper.bo.JobInfoExample;
import com.student.dao.mapper.interfaces.JobInfoMapper;
import com.student.service.interfaces.IJobInfo;

@Controller
@RequestMapping(value = "/jobMsgController")
public class JobMsgController {
	@Autowired
	private JobInfoMapper jobInfoMapper;
	
	@Autowired
	private IJobInfo iJobInfo ;
	
	Logger logger = Logger.getLogger(JobMsgController.class);
	@RequestMapping(value = "/jobInfo")
	public String jobInfo(HttpServletRequest request){
		return "jobInfo";
	}
	
	@RequestMapping(value = "/showBusiInfo.do",method=RequestMethod.POST)
	public @ResponseBody Object showBusiInfo(HttpServletRequest request){
		int proview = Integer.valueOf(request.getParameter("low"))*10;
		int next = Integer.valueOf(request.getParameter("height"))*10;
		
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		String now = dateFormat.format(date).toString();
		List<JobInfo> jobInfos = iJobInfo.selectBusiInfoByPage(proview,next,now);
		logger.info(""+JSON.parse(JSON.toJSONString(jobInfos)));
		return JSON.parse(JSON.toJSONString(jobInfos));
	}
	
	@RequestMapping(value="/showJobInfoTotal.do",method=RequestMethod.POST)
	public @ResponseBody Object showJobInfoTotal(HttpServletRequest request){
		
		JobInfoExample example = new JobInfoExample();
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		String now = format.format(date);
		logger.info(""+ now );
		example.createCriteria().andEndtimeGreaterThanOrEqualTo(now);
		Long total =  jobInfoMapper.countByExample(example);
		Long page =  total/10;
		if( total%10 != 0 ){
			page=page+1;
		}
		Map<String, Long> map = new HashMap<>();
		map.put("total", total);
		map.put("page", page);
		logger.info(""+JSON.parse(JSON.toJSONString(map)));
		return JSON.parse(JSON.toJSONString(map));
	}
	
	@RequestMapping(value="/showJobInfo.do",method=RequestMethod.POST)
	public @ResponseBody Object showJobInfo(HttpServletRequest request){
		
		String page = request.getParameter("page");
		Integer low = (Integer.valueOf(page)-1)*10;
		Integer height = Integer.valueOf(page)*10;
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		String now = format.format(date);
		List<JobInfo> infos = iJobInfo.selectJobInfoBypage(now,low,height);
		
		logger.info("low:"+low+"height:"+height+""+JSON.parse(JSON.toJSONString(infos)));
		return JSON.parse(JSON.toJSONString(infos));
	}
}

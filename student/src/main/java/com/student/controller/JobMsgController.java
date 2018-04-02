package com.student.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.student.dao.mapper.interfaces.JobInfoMapper;

@Controller
@RequestMapping(value = "/jobMsgController")
public class JobMsgController {
	@Autowired
	private JobInfoMapper jobInfoMapper;
	
	@RequestMapping(value = "/jobInfo")
	public String jobInfo(HttpServletRequest request){
		return "jobInfo";
	}
}

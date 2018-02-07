package com.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  
@RequestMapping("/showMessage")
public class ShowMsgController {
	
	@RequestMapping("/showMain")
	public String showMain(){
		return "workInfo";
	}
	
	@RequestMapping("/selectByMe")
	public String selectByMe(){
		return "selectByMe";
	}
}

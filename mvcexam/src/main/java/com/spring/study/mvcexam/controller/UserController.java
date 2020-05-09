package com.spring.study.mvcexam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.study.mvcexam.dto.User;

@Controller
public class UserController {
	@RequestMapping(path = "/userform", method = RequestMethod.GET)
	public String userform() {
		return "userform";
	}
	
	@RequestMapping(path = "/regist", method = RequestMethod.POST)
	public String regist(@ModelAttribute User user) {
		System.out.println("user information");		
		System.out.println(user);
		return "regist";
	}
}

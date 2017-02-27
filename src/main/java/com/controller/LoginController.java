package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	private static final String LOGIN_SUCCESS = "pages/loginSuccess";
	
	@ResponseBody
	@RequestMapping(value="register", method=RequestMethod.POST)
	public String register(){
		return LOGIN_SUCCESS;
	}

	@RequestMapping("login")
	public String login() {
		return LOGIN_SUCCESS;
	}
} 

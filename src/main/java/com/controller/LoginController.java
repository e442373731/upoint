package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.domain.User;
import com.service.impl.UserServiceImpl;
import com.util.ResponseData;

@RestController
@RequestMapping("/user")
public class LoginController {
	
	@Autowired
	private UserServiceImpl userServiceImpl;

	@ResponseBody
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public ResponseData register(@RequestBody User user){
		userServiceImpl.registerUser(user);
		return new ResponseData(user);
	}

	@RequestMapping("login")
	public String login() {
		return "";
	}
} 

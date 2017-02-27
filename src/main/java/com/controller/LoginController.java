package com.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.domain.User;
import com.util.ResponseData;

@RestController
@RequestMapping("/user")
public class LoginController {

	@ResponseBody
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public ResponseData register(@RequestBody User user){
		System.out.println(user.getName());
		return new ResponseData(user);
	}

	@RequestMapping("login")
	public String login() {
		return "";
	}
} 

package com.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.BaseController;
import com.domain.User;
import com.service.UserService;
import com.util.ResponseData;

@RestController
@RequestMapping("/user")
public class LoginController extends BaseController{
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private UserService userServiceImpl;

	@RequestMapping(value="/register", method=RequestMethod.POST)
	public ResponseData register(@RequestBody User user){
		logger.info("get username = {} form page!", user.getUsername());
		userServiceImpl.registerUser(user);
		return new ResponseData(user);
	}
	
	@RequestMapping(value="/{username}",method=RequestMethod.GET)
	public ResponseData validateName(@PathVariable("username") String username){
		logger.info("start to validate username:{}!", username);
		User user = userServiceImpl.findUserByUserName(username);
		if(user == null){
			logger.info("the username is valid!");
		} else {
			logger.info("error! the username is not valid!");
		}
		
		return new ResponseData(user);
	}

	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ResponseData login(@RequestBody User user) {
		logger.info("start to login with username={}", user.getUsername());
		boolean loginWithName = userServiceImpl.loginValid(user);
		return new ResponseData(loginWithName);
	}
} 

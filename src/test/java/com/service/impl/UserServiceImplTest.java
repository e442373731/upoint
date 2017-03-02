package com.service.impl;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.BaseTest;
import com.domain.User;
import com.service.UserService;

public class UserServiceImplTest extends BaseTest {

	@Autowired
	private UserService userService;
	
	@Test
	public void findUserByUserName() throws Exception{
		String username = "tom";
		User user = userService.findUserByUserName(username);
		System.out.println(user.toString());
	}


}

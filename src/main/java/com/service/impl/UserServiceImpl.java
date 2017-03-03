package com.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.domain.User;
import com.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserDao userDao;

	@Override
	public User findUserByUserName(String username) {
		User user = userDao.findUserByUserName(username);
		return user;
	}
	
	@Override
	public void registerUser(User user){
		logger.info("start register {}!", user.getUsername());
		userDao.insertUserByinfo(user);
	}
}

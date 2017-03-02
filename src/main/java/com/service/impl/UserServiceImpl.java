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

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private UserDao userDao;

	@Override
	public User findUserByUserName(String username) {
		User user = userDao.findUserByUserName(username);
		return user;
	}
	
	@Override
	public int registerUser(User user){
		logger.info("start register {}!", user.getUserName());
		return userDao.insertUserByinfo(user);
	}
}

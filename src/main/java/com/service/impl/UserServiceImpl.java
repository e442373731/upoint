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
	
	@Override
	public boolean loginValid(User user){
		User tmpuser = findUserByUserName(user.getUsername());
		if(tmpuser == null){
			logger.error("the user is not exist!!");
			return false;
		} else {
			if(!tmpuser.getPassword().equals(user.getPassword())){
				logger.error("the password is not right!!");
				return false;
			}
		}
		logger.info("login success!!");
		return true;
	}
}

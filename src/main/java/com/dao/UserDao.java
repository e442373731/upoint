package com.dao;

import com.domain.User;

public interface UserDao {
	
	User findUserByUserName(String username);
	
	void insertUserByinfo(User user);
}

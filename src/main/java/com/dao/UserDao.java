package com.dao;

import com.domain.User;

public interface UserDao {
	
	User findUserByUserName(String username);
	
	int insertUserByinfo(User user);
}

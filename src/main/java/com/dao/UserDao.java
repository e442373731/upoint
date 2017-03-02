package com.dao;

import com.domain.User;

public interface UserDao {
	/*abstract int getMatchCount(UserInfo user);
	
	abstract UserInfo findUserByUserName(String username);
	
	abstract void addUserInfo(UserInfo user);
	
	abstract void updateLoginInfo(UserInfo user);*/
	
	User findUserByUserName(String username);
	
}

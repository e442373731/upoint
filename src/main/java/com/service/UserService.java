package com.service;

import com.domain.User;

public interface UserService {

	/**
	 * 
	 * 通过ID获取用户信息
	 * 
	 * @param id
	 * @return
	 */
	User findUserByUserName(String username);
	
	int registerUser(User user);
}

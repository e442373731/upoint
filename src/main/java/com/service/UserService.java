package com.service;

import com.domain.User;

public interface UserService {

	/**
	 * 
	 * ͨ��ID��ȡ�û���Ϣ
	 * 
	 * @param id
	 * @return
	 */
	User findUserByUserName(String username);
	
	int registerUser(User user);
}
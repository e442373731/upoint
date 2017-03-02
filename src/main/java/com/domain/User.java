package com.domain;

import java.util.Date;

public class User {
	
	private int userId;
	private String username;
	private String password;
	private int credits;
	private String lastIp;
	private Date lastVisit;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return username;
	}
	public void setUserName(String userName) {
		this.username = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public String getLastIp() {
		return lastIp;
	}
	public void setLastIp(String lastIp) {
		this.lastIp = lastIp;
	}
	public Date getLastVisit() {
		return lastVisit;
	}
	public void setLastVisit(Date lastVisit) {
		this.lastVisit = lastVisit;
	}
	
	public String toString(){
		return new StringBuffer("User:{").append(" userId=").append(userId)
				.append(" username=").append(username)
				.append(" password=").append(password)
				.append(" credits=").append(credits)
				.append(" lastIp=").append(lastIp)
				.append(" lastVisit=").append(lastVisit).append(" }").toString();
	}
}

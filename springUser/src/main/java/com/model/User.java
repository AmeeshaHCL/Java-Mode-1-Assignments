package com.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class User {
	
	@Value(value = "51888306")
	private int userId;
	@Value(value = "Ameesha Saxena")
	private String UserName;
	@Value(value ="q1w2e3r4")
	private String password;
	public int getUserId() 
	{
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}

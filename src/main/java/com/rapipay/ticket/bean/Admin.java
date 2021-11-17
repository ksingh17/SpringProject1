package com.rapipay.ticket.bean;

import org.springframework.stereotype.Component;


public class Admin {

	private String userName;
	private String password;

	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [userName=" + userName + ", password=" + password + "]";
	}
	

}

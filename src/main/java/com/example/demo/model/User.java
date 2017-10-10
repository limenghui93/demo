package com.example.demo.model;

import java.io.Serializable;

public class User implements Serializable {

	/**
	 * Comment for <code>serialVersionUID</code>
	 */

	private static final long serialVersionUID = 1L;
	private String name = "zhangsan";
	private String password = "123456";
	private String phone = "18637630596";
	private String email = "905283340@qq.com";

	public User() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

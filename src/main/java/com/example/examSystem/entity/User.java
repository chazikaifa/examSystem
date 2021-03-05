package com.example.examSystem.entity;

import java.sql.Date;

public class User{
	private Integer id;
	private String name;
	private String class_name;
	private Integer user_group;
	private String username;
	private String password;
	private String token;
	private Date token_time;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	public Integer getUser_group() {
		return user_group;
	}
	public void setUser_group(Integer user_group) {
		this.user_group = user_group;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public Date getToken_time() {
		return token_time;
	}
	public void setToken_time(Date token_time) {
		this.token_time = token_time;
	}
}
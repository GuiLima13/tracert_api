package com.tracert.model.dao;

public class UserDAO {
	private Long id;
	private String name;
	private String username;
	private String email;
	private boolean status;
	

	public UserDAO(Long id,String name, String username, String email, boolean status) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.email = email;
		this.status = status;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UserDAO() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}

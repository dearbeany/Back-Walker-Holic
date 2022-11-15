package com.ssafy.running.model.dto;

public class User {
	private String userId;
	private String username;
	private String password;
	private String campus;

	public User() {
	}

	public User(String userId, String username, String password, String campus) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.campus = campus;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

	public String getCampus() {
		return campus;
	}

	public void setCampus(String campus) {
		this.campus = campus;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", campus=" + campus
				+ "]";
	}

}

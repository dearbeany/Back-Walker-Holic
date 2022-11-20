package com.ssafy.running.model.dto;

public class UserMyPageReward {
	private String userId; // FK (user - userId)
	private String Reward; // Unique, 뱃지이름 저장됨

	public UserMyPageReward(String userId, String reward) {
		super();
		this.userId = userId;
		this.Reward = reward;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getReward() {
		return Reward;
	}

	public void setReward(String reward) {
		Reward = reward;
	}

}
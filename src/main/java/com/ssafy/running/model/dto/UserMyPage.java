package com.ssafy.running.model.dto;

public class UserMyPage {
	private String userId; // FK(user - userId)
	private String dailyCheck; // 출석체크 일시가 저장됨
	private int point; // 포인트
	private String reward;

	public UserMyPage(String userId, String dailyCheck, int point, String reward) {
		super();
		this.userId = userId;
		this.dailyCheck = dailyCheck;
		this.point = point;
		this.reward = reward;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getDailyCheck() {
		return dailyCheck;
	}

	public void setDailyCheck(String dailyCheck) {
		this.dailyCheck = dailyCheck;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getReward() {
		return reward;
	}

	public void setReward(String reward) {
		this.reward = reward;
	}

}
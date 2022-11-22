package com.ssafy.running.model.dto;

public class Follow {
	private int followNo;
	private String followerUserId;
	private String followingUserId;

	public Follow() {

	}

	public Follow(int followNo, String followerUserId, String followingUserId) {
		super();
		this.followNo = followNo;
		this.followerUserId = followerUserId;
		this.followingUserId = followingUserId;
	}

	public int getFollowNo() {
		return followNo;
	}

	public void setFollowNo(int followNo) {
		this.followNo = followNo;
	}

	public String getFollowerUserId() {
		return followerUserId;
	}

	public void setFollowerUserId(String followerUserId) {
		this.followerUserId = followerUserId;
	}

	public String getFollowingUserId() {
		return followingUserId;
	}

	public void setFollowingUserId(String follwingUserId) {
		this.followingUserId = follwingUserId;
	}

	@Override
	public String toString() {
		return "Follow [followNo=" + followNo + ", followerUserId=" + followerUserId + ", followingUserId="
				+ followingUserId + "]";
	}

}

package com.ssafy.running.model.dto;

public class Follow {
	private int followNo;
	private String followerUserId;
	private String followingUserId;
	private String followerAvatar;
	private String followingAvatar;

	public Follow() {

	}

	public Follow(int followNo, String followerUserId, String followingUserId, String followerAvatar,
			String followingAvatar) {
		super();
		this.followNo = followNo;
		this.followerUserId = followerUserId;
		this.followingUserId = followingUserId;
		this.followerAvatar = followerAvatar;
		this.followingAvatar = followingAvatar;
	}

	public String getFollowerAvatar() {
		return followerAvatar;
	}

	public void setFollowerAvatar(String followerAvatar) {
		this.followerAvatar = followerAvatar;
	}

	public String getFollowingAvatar() {
		return followingAvatar;
	}

	public void setFollowingAvatar(String followingAvatar) {
		this.followingAvatar = followingAvatar;
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
				+ followingUserId + ", followerAvatar=" + followerAvatar + ", followingAvatar=" + followingAvatar + "]";
	}

}

package com.ssafy.running.model.service;

import java.util.List;

import com.ssafy.running.model.dto.Follow;

public interface FollowService {
	// 팔로우한 유저들을 불러온다
	List<Follow> getUserList();

	// 팔로우를 한다
	void followUser(Follow follow);

	// 언팔로우를 한다
	void unfollowUser(Follow follow);

	String getAvatarByFollowerUserId(String followerUserId);

	String getAvatarByFollowingUserId(String followingUserId);
}

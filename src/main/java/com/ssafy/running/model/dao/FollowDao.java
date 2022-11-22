package com.ssafy.running.model.dao;

import java.util.List;

import com.ssafy.running.model.dto.Follow;

public interface FollowDao {
	// 팔로우한 유저들을 불러온다
	List<Follow> selectFollowAll();

	// 팔로우를 한다
	void insert(Follow follow);

	// 언팔로우를 한다
	void delete(Follow follow);
}

package com.ssafy.running.model.dao;

import java.util.List;

import com.ssafy.running.model.dto.User;

public interface UserDao {
	// User 정보 가져오기
	User select(String userId);

	List<User> selectAll();

	// 회원가입하기
	void createUser(User user);

	// 로그인 검증 여부
//	boolean login(User user);

}

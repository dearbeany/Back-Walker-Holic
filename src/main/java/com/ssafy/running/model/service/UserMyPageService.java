package com.ssafy.running.model.service;

import java.util.List;

import com.ssafy.running.model.dto.UserMyPage;

public interface UserMyPageService {
	
	List<UserMyPage> selectUserMyPage(String userId);
	
	void insertUserMyPageCal(UserMyPage userMyPage);
}

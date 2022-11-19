package com.ssafy.running.model.service;

import java.util.List;

import com.ssafy.running.model.dto.UserMyPage;
import com.ssafy.running.model.dto.UserMyPageReward;

public interface UserMyPageService {
	
	List<UserMyPage> selectUserMyPage(String userId);
	
	void insertUserMyPageCal(UserMyPage userMyPage);
	
	List<String> selectUserMyPageReward(String userId);
	
	void insertUserMyPageReward(UserMyPageReward userMyPageReward);
}

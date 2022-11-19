package com.ssafy.running.model.dao;

import java.util.List;

import com.ssafy.running.model.dto.UserMyPage;
import com.ssafy.running.model.dto.UserMyPageReward;

public interface UserMyPageDao {
	// UserMyData 가져오기
	
	List<UserMyPage> selectUserMyPage(String userId);
	
	void insertUserMyPageCal(UserMyPage userMyPage);
	
	List<String> selectUserMyPageReward(String userId);
	
	void insertUserMyPageReward(UserMyPageReward userMyPageReward);

}

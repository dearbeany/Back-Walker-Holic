package com.ssafy.running.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.running.model.dao.UserMyPageDao;
import com.ssafy.running.model.dto.UserMyPage;
import com.ssafy.running.model.dto.UserMyPageReward;

@Service
public class UserMyPageServiceImpl implements UserMyPageService {

	private UserMyPageDao userMyPageDao;

	@Autowired
	public void setUserDao(UserMyPageDao userMyPageDao) {
		this.userMyPageDao = userMyPageDao;
	}

	@Override
	public List<UserMyPage> selectUserMyPage(String userId) {
		return userMyPageDao.selectUserMyPage(userId);
	}

	@Override
	public List<String> selectUserMyPageReward(String userId) {
		return userMyPageDao.selectUserMyPageReward(userId);
	}

	@Override
	public void insertUserMyPageCal(UserMyPage userMyPage) {
		userMyPageDao.insertUserMyPageCal(userMyPage);

	}

	@Override
	public void insertUserMyPageReward(UserMyPageReward userMyPageReward) {
		userMyPageDao.insertUserMyPageReward(userMyPageReward);
	}

}
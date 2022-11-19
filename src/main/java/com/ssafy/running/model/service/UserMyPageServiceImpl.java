package com.ssafy.running.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.running.model.dao.UserDao;
import com.ssafy.running.model.dao.UserMyPageDao;
import com.ssafy.running.model.dto.UserMyPage;

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
	public void insertUserMyPageCal(UserMyPage userMyPage) {
		userMyPageDao.insertUserMyPageCal(userMyPage);
	}

}

package com.ssafy.running.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.running.model.dao.FollowDao;
import com.ssafy.running.model.dto.Follow;

@Service
public class FollowServiceImpl implements FollowService {

	private FollowDao followDao;

	@Autowired
	public void setFollowDao(FollowDao followDao) {
		this.followDao = followDao;
	}

	@Override
	public List<Follow> getUserList() {
		return followDao.selectFollowAll();
	}

	@Override
	public void followUser(Follow follow) {
		followDao.insert(follow);
	}

	@Override
	public void unfollowUser(Follow follow) {
		followDao.delete(follow);
	}

	@Override
	public String getAvatarByFollowerUserId(String followerUserId) {
		return followDao.selectAvatarByFollwerUserId(followerUserId);
	}

	@Override
	public String getAvatarByFollowingUserId(String followingUserId) {
		return followDao.selectAvatarByFollowingUserId(followingUserId);
	}

}

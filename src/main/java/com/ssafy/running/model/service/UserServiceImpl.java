package com.ssafy.running.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.running.model.dao.UserDao;
import com.ssafy.running.model.dto.User;

@Service
public class UserServiceImpl implements UserService {

	private UserDao userDao;

	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public User select(String userId) {
		return userDao.select(userId);
	}

	@Override
	public List<User> selectAll() {
		return userDao.selectAll();
	}

	@Override
	public void createUser(User user) {
		userDao.createUser(user);
	}

//	@Override
//	public boolean login(User user) {
//		List<User> userList = userDao.selectAll();
//		for (int i = 0; i < userList.size(); i++) {
//			if (userList.get(i).getUserId().equals(user.getUserId())
//					&& userList.get(i).getPassword().equals(user.getPassword())) {
//				return true;
//			}
//		}
//		return false;
//	}

}

package com.ssafy.running.model.service;

import java.util.List;

import com.ssafy.running.model.dto.User;

public interface UserService {
	User select(String userId);

	List<User> selectAll();

	void createUser(User user);

//	boolean login(User user);

}

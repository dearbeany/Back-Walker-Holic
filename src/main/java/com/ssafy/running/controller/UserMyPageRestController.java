package com.ssafy.running.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.running.model.dto.UserMyPage;
import com.ssafy.running.model.dto.UserMyPageReward;
import com.ssafy.running.model.service.UserMyPageService;

@RestController
@RequestMapping("/api")
public class UserMyPageRestController {
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";

	@Autowired
	private UserMyPageService userMyPageService;

	@GetMapping("/userPage")
	public ResponseEntity<List<UserMyPage>> selectUserMyPage(String userId) {
		return new ResponseEntity<List<UserMyPage>>(userMyPageService.selectUserMyPage(userId), HttpStatus.OK);
	}

	@PostMapping("/userPage")
	public ResponseEntity<String> insertUserMyPageCal(UserMyPage userMyPage) {
		userMyPageService.insertUserMyPageCal(userMyPage);
		return new ResponseEntity<String>(SUCCESS, HttpStatus.CREATED);
	}

	@GetMapping("/userPage/getreward")
	public ResponseEntity<List<String>> selectUserMyPageReward(String userId) {
		return new ResponseEntity<List<String>>(userMyPageService.selectUserMyPageReward(userId), HttpStatus.OK);
	}

	@PostMapping("/userPage/getreward")
	public ResponseEntity<String> insertUserMyPageReward(UserMyPageReward userMyPageReward) {
		userMyPageService.insertUserMyPageReward(userMyPageReward);
		return new ResponseEntity<String>(SUCCESS, HttpStatus.CREATED);
	}

}

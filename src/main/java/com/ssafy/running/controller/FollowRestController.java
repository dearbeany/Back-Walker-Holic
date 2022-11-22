package com.ssafy.running.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.running.model.dto.Follow;
import com.ssafy.running.model.service.FollowService;

@RestController
@RequestMapping("/api")
public class FollowRestController {
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";

	@Autowired
	private FollowService followService;

	@GetMapping("/follow")
	public ResponseEntity<List<Follow>> getFollowList() {
		List<Follow> list = followService.getUserList();
		for (Follow f : list) {
			System.out.println(f);
		}
		return new ResponseEntity<List<Follow>>(followService.getUserList(), HttpStatus.OK);
	}

	// 팔로우
	@PostMapping("/follow")
	public ResponseEntity<String> follow(Follow follow) {
		followService.followUser(follow);
		return new ResponseEntity<String>(SUCCESS, HttpStatus.CREATED);
	}

	// 언팔로우
	@DeleteMapping("/follow")
	public ResponseEntity<String> delete(Follow follow) {
		followService.unfollowUser(follow);
		return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);

	}
}

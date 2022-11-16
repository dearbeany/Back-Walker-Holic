package com.ssafy.running.controller;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.running.model.dto.User;
import com.ssafy.running.model.service.UserService;
import com.ssafy.running.util.JwtUtil;

@RestController
@RequestMapping("/api")
public class UserRestController {
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";

	@Autowired
	private JwtUtil jwtUtil;

	@Autowired
	private UserService userService;

	@GetMapping("/login")
	public ResponseEntity<User> selectUser(String userId) {
		return new ResponseEntity<User>(userService.select(userId), HttpStatus.OK);
	}

	// 로그인 하기
	@PostMapping("/login")
	public ResponseEntity<Map<String, Object>> loginUser(User user) {
		HashMap<String, Object> result = new HashMap<>();
		HttpStatus status = null;

		List<User> userList = userService.selectAll();

		// 가져온 유저
		String userId = user.getUserId();
		String password = user.getPassword();

		for (int i = 0; i < userList.size(); i++) {
			try {
				if (userList.get(i).getUserId().equals(userId) && userList.get(i).getPassword().equals(password)) {
					result.put("access-token", jwtUtil.createToken("id", userId));
					result.put("message", SUCCESS);
					status = HttpStatus.ACCEPTED;
					break;
				} else {
					result.put("message", FAIL);
					status = HttpStatus.ACCEPTED;
				}
			} catch (UnsupportedEncodingException e) {
				result.put("message", FAIL);
				status = HttpStatus.INTERNAL_SERVER_ERROR; // 서버 잘못이다! 500에러
			}
		}
		return new ResponseEntity<Map<String, Object>>(result, status);

	}

//	// 로그인 하기
//	@PostMapping("/login")
//	public ResponseEntity<String> loginUser(@RequestParam(defaultValue = "") String userId,
//			@RequestParam(defaultValue = "") String password) {
//		List<User> userList = userService.selectAll();
//		for (int i = 0; i < userList.size(); i++) {
//			if (userList.get(i).getUserId().equals(userId) && userList.get(i).getPassword().equals(password)) {
//				return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
//			}
//		}
//		return new ResponseEntity<String>(FAIL, HttpStatus.OK);
//	}

	// 유저 회원가입하기
	@PostMapping("/login/create")
	public ResponseEntity<String> createUser(User user) {
		userService.createUser(user);
		return new ResponseEntity<String>(SUCCESS, HttpStatus.CREATED);
	}

}

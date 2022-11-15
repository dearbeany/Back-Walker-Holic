package com.ssafy.running.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.running.exception.BoardNotFoundException;
import com.ssafy.running.model.dto.Board;
import com.ssafy.running.model.dto.User;
import com.ssafy.running.model.service.BoardService;
import com.ssafy.running.model.service.UserService;

@RestController
@RequestMapping("/api")
public class RunningRestController {
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";

	@Autowired
	private UserService userService;
	@Autowired
	private BoardService boardService;

	@GetMapping("/login")
	public ResponseEntity<User> selectUser(String userId) {
		return new ResponseEntity<User>(userService.select(userId), HttpStatus.OK);
	}

	// 로그인 하기
	@PostMapping("/login")
	public ResponseEntity<String> loginUser(@RequestParam(defaultValue = "") String userId,
			@RequestParam(defaultValue = "") String password) {
		List<User> userList = userService.selectAll();
		for (int i = 0; i < userList.size(); i++) {
			if (userList.get(i).getUserId().equals(userId) && userList.get(i).getPassword().equals(password)) {
				return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
			}
		}
		return new ResponseEntity<String>(FAIL, HttpStatus.OK);
	}

	// 유저 회원가입하기
	@PostMapping("/login/create")
	public ResponseEntity<String> createUser(User user) {
		userService.createUser(user);
		return new ResponseEntity<String>(SUCCESS, HttpStatus.CREATED);
	}

	// 게시판 가져오기
	@GetMapping("/board")
	public ResponseEntity<List<Board>> list(@RequestParam(defaultValue = "") String mode,
			@RequestParam(defaultValue = "") String keyword) {
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("mode", mode);
		params.put("keyword", keyword);

		return new ResponseEntity<List<Board>>(boardService.getBoardList(params), HttpStatus.OK);
	}

	// 게시판 글 등록하기
	@PostMapping("/board")
	public ResponseEntity<String> write(Board board) {
		boardService.writeBoard(board);
		return new ResponseEntity<String>(SUCCESS, HttpStatus.CREATED);
	}

	// 게시판 글 상세보기
	@GetMapping("/board/{id}")
	public ResponseEntity<Board> detail(@PathVariable int id) {
		try {
			return new ResponseEntity<Board>(boardService.getBoard(id), HttpStatus.OK);
		} catch (Exception e) {
			throw new BoardNotFoundException(id + "번 게시글은 없다.");
		}
	}

	// 게시판 글 수정하기
	@PutMapping("/board")
	public ResponseEntity<String> modify(Board board) {
		boardService.modifyBoard(board);
		return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
	}

	// 게시판 글 삭제하기
	@DeleteMapping("/board/{id}")
	public ResponseEntity<String> delete(@PathVariable int id) {
		if (boardService.removeBoard(id)) {
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		}
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}

}

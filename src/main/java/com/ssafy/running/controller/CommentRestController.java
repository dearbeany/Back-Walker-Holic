package com.ssafy.running.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.running.model.dto.Comment;
import com.ssafy.running.model.service.CommentService;

@RestController
@RequestMapping("/api")
public class CommentRestController {
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";

	private CommentService commentService;

	@Autowired
	public void setCommentService(CommentService commentService) {
		this.commentService = commentService;
	}

	// 게시판에 해당하는 댓글 리스트를 가져오기
	@GetMapping("/comment/{boardId}")
	public ResponseEntity<List<Comment>> listbyBoardId(@PathVariable int boardId) {
		System.out.println(boardId);
		return new ResponseEntity<List<Comment>>(commentService.getCommentList(boardId), HttpStatus.OK);
	}

	// 댓글 등록하기
	@PostMapping("/comment")
	public ResponseEntity<String> write(Comment comment) {
		commentService.writeComment(comment);
		return new ResponseEntity<String>(SUCCESS, HttpStatus.CREATED);
	}

	// 댓글 삭제하기
	@DeleteMapping("/comment/{commentId}")
	public ResponseEntity<String> delete(@PathVariable int commentId) {
		if (commentService.removeComment(commentId)) {
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		}
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}

}

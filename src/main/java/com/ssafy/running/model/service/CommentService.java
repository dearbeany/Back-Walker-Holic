package com.ssafy.running.model.service;

import java.util.List;

import com.ssafy.running.model.dto.Comment;

public interface CommentService {
	// 댓글 등록
	void writeComment(Comment comment);

	// 게시판에 해당하는 댓글 불러오기
	List<Comment> getCommentList(int boardId);

	// 댓글 하나 불러오기
	Comment getCommentOne(int commentId);

	// 댓글 삭제
	boolean removeComment(int commentId);

	// 댓글 수정
	void updateComment(int commentId);

}

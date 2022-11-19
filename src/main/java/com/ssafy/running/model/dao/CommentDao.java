package com.ssafy.running.model.dao;

import java.util.List;

import com.ssafy.running.model.dto.Comment;

public interface CommentDao {
	// 댓글 등록
	void insertComment(Comment comment);

	// 게시글에 해당하는 댓글 불러오기
	List<Comment> selectCommentListById(int boardId);

	// 댓글 하나 가져오기
	Comment selectCommentOne(int commentId);

	// 댓글 삭제
	int deleteComment(int commentId);

	// 댓글 수정
	int updateComment(Comment comment);

}

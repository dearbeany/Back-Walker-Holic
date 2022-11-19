package com.ssafy.running.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.running.model.dao.CommentDao;
import com.ssafy.running.model.dto.Comment;

@Service
public class CommentServiceImpl implements CommentService {
	private CommentDao commentDao;

	@Autowired
	public void setCommentDao(CommentDao commentDao) {
		this.commentDao = commentDao;
	}

	@Override
	public void writeComment(Comment comment) {
		this.commentDao.insertComment(comment);
	}

	@Override
	public List<Comment> getCommentList(int boardId) {
		return this.commentDao.selectCommentListById(boardId);
	}

	@Override
	public Comment getCommentOne(int commentId) {
		return this.commentDao.selectCommentOne(commentId);
	}

	@Override
	public boolean removeComment(int commentId) {
		return this.commentDao.deleteComment(commentId) == 1;
	}

	@Override
	public void updateComment(int commentId) {
		Comment comment = commentDao.selectCommentOne(commentId);
		comment.setCommentContent(comment.getCommentContent());
		commentDao.updateComment(comment);
	}

}

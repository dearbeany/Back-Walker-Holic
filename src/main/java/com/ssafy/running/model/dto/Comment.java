package com.ssafy.running.model.dto;

public class Comment {
	public int commentId; // 댓글 아이디(PK)
	public int boardId; // 게시 아이디(FK - borad id)
	public String userId; // 사용자 아이디(FK - User userId)
	public String commentContent; // 내용
	public String commentRegDate; // 등록일자

	public Comment() {

	}

	public Comment(int commentId, int boardId, String userId, String commentContent, String commentRegDate) {
		super();
		this.commentId = commentId;
		this.boardId = boardId;
		this.userId = userId;
		this.commentContent = commentContent;
		this.commentRegDate = commentRegDate;
	}

	public int getCommentId() {
		return commentId;
	}

	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}

	public int getBoardId() {
		return boardId;
	}

	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public String getCommentRegDate() {
		return commentRegDate;
	}

	public void setCommentRegDate(String commentRegDate) {
		this.commentRegDate = commentRegDate;
	}

	@Override
	public String toString() {
		return "Comment [commentId=" + commentId + ", boardId=" + boardId + ", userId=" + userId + ", commentContent="
				+ commentContent + ", commentRegDate=" + commentRegDate + "]";
	}

}

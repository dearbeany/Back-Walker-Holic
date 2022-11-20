package com.ssafy.running.model.dto;

public class Comment {
	public int commentId; // 댓글 아이디(PK)
	public int boardId; // 게시 아이디(FK - borad id)
	public String userId; // 사용자 아이디(FK - User userId)
	public String commentContent; // 내용
	public String commentRegDate; // 등록일자
	public int commentDepth; // 댓글의 깊이 (댓글은 0, 대댓글은 1)
	public int commentGroup; // 모댓글의 commentId를 저장

	public Comment() {

	}

	public Comment(int commentId, int boardId, String userId, String commentContent, String commentRegDate,
			int commentDepth, int commentGroup) {
		super();
		this.commentId = commentId;
		this.boardId = boardId;
		this.userId = userId;
		this.commentContent = commentContent;
		this.commentRegDate = commentRegDate;
		this.commentDepth = commentDepth;
		this.commentGroup = commentGroup;
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

	public int getCommentDepth() {
		return commentDepth;
	}

	public void setCommentDepth(int commentDepth) {
		this.commentDepth = commentDepth;
	}

	public int getCommentGroup() {
		return commentGroup;
	}

	public void setCommentGroup(int commentGroup) {
		this.commentGroup = commentGroup;
	}

	@Override
	public String toString() {
		return "Comment [commentId=" + commentId + ", boardId=" + boardId + ", userId=" + userId + ", commentContent="
				+ commentContent + ", commentRegDate=" + commentRegDate + ", commentDepth=" + commentDepth
				+ ", commentGroup=" + commentGroup + "]";
	}

}

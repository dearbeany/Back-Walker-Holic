package com.ssafy.running.model.dto;

public class ReplyComment {
	public int replyId; // 대댓글 아이디(PK)
	public int reviewId; // 리뷰 아이디(FK - RouteReview reviewId)
	public String userId; // 사용자 아이디(FK - User userId)
	public String replyContent; // 내용
	public String replyRegData; // 등록일자

	public ReplyComment() {

	}

	public ReplyComment(int replyId, int reviewId, String userId, String replyContent, String replyRegData) {
		super();
		this.replyId = replyId;
		this.reviewId = reviewId;
		this.userId = userId;
		this.replyContent = replyContent;
		this.replyRegData = replyRegData;
	}

	public int getReplyId() {
		return replyId;
	}

	public void setReplyId(int replyId) {
		this.replyId = replyId;
	}

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getReplyContent() {
		return replyContent;
	}

	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}

	public String getReplyRegData() {
		return replyRegData;
	}

	public void setReplyRegData(String replyRegData) {
		this.replyRegData = replyRegData;
	}

	@Override
	public String toString() {
		return "ReplyComment [replyId=" + replyId + ", reviewId=" + reviewId + ", userId=" + userId + ", replyContent="
				+ replyContent + ", replyRegData=" + replyRegData + "]";
	}

}

package com.ssafy.running.model.dto;

public class RouteReview {
	private int reviewId; // 리뷰 아이디 (PK)
	private int routeId; // 경로 아이디 (FK - Route routeId)
	private String reviewWriter; // 작성자 (FK - User userId)
	private String reviewContent; // 리뷰 내용
	private String reviewComment; // 리뷰에 대한 댓글
	private int reviewLikeCnt; // 리뷰 좋아요 수
	private String reviewRegDate; // 리뷰 작성일자
	private String reviewWriterAvatar; // 리뷰 작성자의 아바타

	public RouteReview() {

	}

	public RouteReview(int reviewId, int routeId, String reviewWriter, String reviewContent, String reviewComment,
			int reviewLikeCnt, String reviewRegDate, String reviewWriterAvatar) {
		super();
		this.reviewId = reviewId;
		this.routeId = routeId;
		this.reviewWriter = reviewWriter;
		this.reviewContent = reviewContent;
		this.reviewComment = reviewComment;
		this.reviewLikeCnt = reviewLikeCnt;
		this.reviewRegDate = reviewRegDate;
		this.reviewWriterAvatar = reviewWriterAvatar;
	}

	public String getReviewWriterAvatar() {
		return reviewWriterAvatar;
	}

	public void setReviewWriterAvatar(String reviewWriterAvatar) {
		this.reviewWriterAvatar = reviewWriterAvatar;
	}

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public int getRouteId() {
		return routeId;
	}

	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}

	public String getReviewWriter() {
		return reviewWriter;
	}

	public void setReviewWriter(String reviewWriter) {
		this.reviewWriter = reviewWriter;
	}

	public String getReviewContent() {
		return reviewContent;
	}

	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}

	public String getReviewComment() {
		return reviewComment;
	}

	public void setReviewComment(String reviewComment) {
		this.reviewComment = reviewComment;
	}

	public int getReviewLikeCnt() {
		return reviewLikeCnt;
	}

	public void setReviewLikeCnt(int reviewLikeCnt) {
		this.reviewLikeCnt = reviewLikeCnt;
	}

	public String getReviewRegDate() {
		return reviewRegDate;
	}

	public void setReviewRegDate(String reviewRegDate) {
		this.reviewRegDate = reviewRegDate;
	}

	@Override
	public String toString() {
		return "RouteReview [reviewId=" + reviewId + ", routeId=" + routeId + ", reviewWriter=" + reviewWriter
				+ ", reviewContent=" + reviewContent + ", reviewComment=" + reviewComment + ", reviewLikeCnt="
				+ reviewLikeCnt + ", reviewRegDate=" + reviewRegDate + "]";
	}

}

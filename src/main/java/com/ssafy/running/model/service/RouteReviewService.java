package com.ssafy.running.model.service;

import java.util.List;

import com.ssafy.running.model.dto.RouteReview;

public interface RouteReviewService {
	// 경로에 대한 리뷰 등록
	void writeRouteReview(RouteReview routeReview);

	// 경로에 대한 리뷰 목록
	List<RouteReview> getRouteReviewList();

	// 해당 경로에 대한 리뷰 목록
	List<RouteReview> getRouteReviewListById(int routeId);

	// 경로에 대한 리뷰 조회
	RouteReview getRouteReviewOne(int reviewId);

	// 경로에 대한 리뷰 삭제
	boolean removeRouteReview(int reviewId);

	// 경로에 대한 리뷰 수정 (좋아요 수만 증가)
	void updateRouteReview(int reviewId);
}

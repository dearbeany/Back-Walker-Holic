package com.ssafy.running.model.dao;

import java.util.List;

import com.ssafy.running.model.dto.RouteReview;

public interface RouteReviewDao {
	// 리뷰 등록
	void insertRouteReview(RouteReview routeReview);

	// 리뷰 목록 불러오기
	List<RouteReview> selectRouteReviewList();

	// 루트에 해당하는 리뷰 목록 불러오기
	List<RouteReview> selectRouteReviewListById(int routeId);

	// 리뷰 하나 가져오기
	RouteReview selectRouteReviewOne(int reviewId);

	// 리뷰 삭제
	int deleteRouteReview(int reviewId);

	// 리뷰 수정
	int updateRouteReview(RouteReview routeReview);
}

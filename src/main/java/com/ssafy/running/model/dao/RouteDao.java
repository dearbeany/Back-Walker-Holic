package com.ssafy.running.model.dao;

import java.util.List;

import com.ssafy.running.model.dto.Route;

public interface RouteDao {
	// 경로 등록
	void insertRoute(Route route);

	// 경로 목록
	List<Route> selectRouteList();

	// 경로 조회
	Route selectRouteOne(int routeId);

	// 경로 삭제
	int deleteRoute(int routeId);

	// 경로 좋아요 수 증가
	int updateRoute(Route route);
}

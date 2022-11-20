package com.ssafy.running.model.service;

import java.util.List;

import com.ssafy.running.model.dto.Route;

public interface RouteService {
	// 경로 등록
	void writeRoute(Route route);

	// 경로 목록
	List<Route> getRouteList();

	// 경로 조회
	Route getRoute(int routeId);

	// 경로 삭제
	boolean removeRoute(int routeId);

	// 경로 likeCnt 증가
	void updateLikeCnt(int routeId);

	// 경로 인기순 가져오기
	List<Route> getRouteListByLikeCnt();
}

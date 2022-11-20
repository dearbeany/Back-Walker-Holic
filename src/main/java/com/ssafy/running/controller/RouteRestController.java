package com.ssafy.running.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.running.exception.RouteNotFoundException;
import com.ssafy.running.model.dto.Route;
import com.ssafy.running.model.service.RouteService;

@RestController
@RequestMapping("/api")
public class RouteRestController {
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";

	@Autowired
	private RouteService routeService;

	// 전체 경로 리스트를 가져오기
	@GetMapping("/route")
	public ResponseEntity<List<Route>> list() {
		return new ResponseEntity<List<Route>>(routeService.getRouteList(), HttpStatus.OK);
	}

	// 인기순 경로 리스트 가져오기
//	@GetMapping("/route/popular")
//	public ResponseEntity<List<Route>> listOrderByLikeCnt() {
//		return new ResponseEntity<List<Route>>(routeService.getRouteListByLikeCnt(), HttpStatus.OK);
//	}

	// 경로 등록하기
	@PostMapping("/route")
	public ResponseEntity<String> write(Route route) {
		routeService.writeRoute(route);
		return new ResponseEntity<String>(SUCCESS, HttpStatus.CREATED);
	}

	// 경로 상세보기
	@GetMapping("/route/{routeId}")
	public ResponseEntity<Route> detail(@PathVariable int routeId) {
		try {
			return new ResponseEntity<Route>(routeService.getRoute(routeId), HttpStatus.OK);
		} catch (Exception e) {
			throw new RouteNotFoundException(routeId + "번 경로는 없다.");
		}
	}

	// 경로 삭제하기
	@DeleteMapping("/route/{routeId}")
	public ResponseEntity<String> delete(@PathVariable int routeId) {
		if (routeService.removeRoute(routeId)) {
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		}
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}

	// 경로 수정하기
	@PutMapping("/route")
	public ResponseEntity<String> modify(int routeId) {
		routeService.updateLikeCnt(routeId);
		return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
	}

}

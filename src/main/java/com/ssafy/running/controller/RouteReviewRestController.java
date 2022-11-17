package com.ssafy.running.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.running.exception.RouteReviewNotFoundException;
import com.ssafy.running.model.dto.RouteReview;
import com.ssafy.running.model.service.RouteReviewService;

@RestController
@RequestMapping("/api")
public class RouteReviewRestController {
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";

	@Autowired
	private RouteReviewService routeReviewService;

	// 전체 리뷰 리스트를 가져오기
	@GetMapping("/routeReview")
	public ResponseEntity<List<RouteReview>> list() {
		return new ResponseEntity<List<RouteReview>>(routeReviewService.getRouteReviewList(), HttpStatus.OK);
	}

	// 리뷰 등록하기
	@PostMapping("/routeReview")
	public ResponseEntity<String> write(RouteReview routeReview) {
		routeReviewService.writeRouteReview(routeReview);
		return new ResponseEntity<String>(SUCCESS, HttpStatus.CREATED);
	}

	// 리뷰 상세보기
	@GetMapping("/routeReview/{reviewId}")
	public ResponseEntity<RouteReview> detail(@PathVariable int reviewId) {
		System.out.println("11111");
		try {
			System.out.println("222222");
			return new ResponseEntity<RouteReview>(routeReviewService.getRouteReviewOne(reviewId), HttpStatus.OK);
		} catch (Exception e) {
			System.out.println("33333");
			throw new RouteReviewNotFoundException(reviewId + "번 리뷰는 없다.");
		}
	}

	// 리뷰 삭제하기
	@DeleteMapping("/routeReview/{reviewId}")
	public ResponseEntity<String> delete(@PathVariable int reviewId) {
		if (routeReviewService.removeRouteReview(reviewId)) {
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		}
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}

}

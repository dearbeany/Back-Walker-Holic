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

import com.ssafy.running.model.dto.RouteReview;
import com.ssafy.running.model.service.RouteReviewService;

@RestController
@RequestMapping("/api")
public class RouteReviewRestController {
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";

	private RouteReviewService routeReviewService;

	@Autowired
	public void setRouteReviewService(RouteReviewService routeReviewService) {
		this.routeReviewService = routeReviewService;
	}

	// 전체 리뷰 리스트를 가져오기
	@GetMapping("/routeReview")
	public ResponseEntity<List<RouteReview>> listAll() {
		return new ResponseEntity<List<RouteReview>>(routeReviewService.getRouteReviewList(), HttpStatus.OK);
	}

	// 루트번호에 해당하는 리뷰 리스트를 가져오기
	@GetMapping("/routeReview/{routeId}")
	public ResponseEntity<List<RouteReview>> listbyRouteId(@PathVariable int routeId) {
		System.out.println(routeId);
		return new ResponseEntity<List<RouteReview>>(routeReviewService.getRouteReviewListById(routeId), HttpStatus.OK);
	}

//	// 리뷰 글쓴이 해당하는 아바타 가져오기
//	@GetMapping("/routeReview/avatar/{reviewWriter}")
////	@RequestMapping(value = "/route/avatar/{register}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<HashMap<String, String>> getAvatarByRegister(@PathVariable String reviewWriter) {
//		HashMap<String, String> map = new HashMap<>();
//		map.put("reviewWriter", reviewWriter);
//		map.put("avatar", routeReviewService.getAvatarByWriter(reviewWriter));
//
//		List<User> userList = userService.selectAll();
//		for (int i = 0; i < userList.size(); i++) {
//			String userId = userList.get(i).getUserId();
//			String avatar = userList.get(i).getAvatar();
//		}
//
//		return new ResponseEntity<HashMap<String, String>>(HttpStatus.OK);
//	}

	// 리뷰 등록하기
	@PostMapping("/routeReview")
	public ResponseEntity<String> write(RouteReview routeReview) {
		routeReviewService.writeRouteReview(routeReview);
		return new ResponseEntity<String>(SUCCESS, HttpStatus.CREATED);
	}

//	// 리뷰 상세보기
//	@GetMapping("/routeReview/{reviewId}")
//	public ResponseEntity<RouteReview> detail(@PathVariable int reviewId) {
//		try {
//			return new ResponseEntity<RouteReview>(routeReviewService.getRouteReviewOne(reviewId), HttpStatus.OK);
//		} catch (Exception e) {
//			throw new RouteReviewNotFoundException(reviewId + "번 리뷰는 없다.");
//		}
//	}

	// 리뷰 수정하기
	@PutMapping("/routeReview")
	public ResponseEntity<String> modify(RouteReview routeReview) {
		routeReviewService.updateRouteReview(routeReview);
		return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
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

package com.ssafy.running.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.running.model.dao.RouteReviewDao;
import com.ssafy.running.model.dto.RouteReview;

@Service
public class RouteReviewServiceImpl implements RouteReviewService {
	private RouteReviewDao routeReviewDao;

	@Autowired
	private void setRouteReviewDao(RouteReviewDao routeReviewDao) {
		this.routeReviewDao = routeReviewDao;
	}

	@Override
	public void writeRouteReview(RouteReview routeReview) {
		routeReviewDao.insertRouteReview(routeReview);
	}

	@Override
	public List<RouteReview> getRouteReviewList() {
		return routeReviewDao.selectRouteReviewList();
	}

	@Override
	public List<RouteReview> getRouteReviewListById(int routeId) {
		return routeReviewDao.selectRouteReviewListById(routeId);
	}

	@Override
	public RouteReview getRouteReviewOne(int reviewId) {
		return routeReviewDao.selectRouteReviewOne(reviewId);
	}

	@Override
	public boolean removeRouteReview(int reviewId) {
		return routeReviewDao.deleteRouteReview(reviewId) == 1;
	}

	@Override
	public void updateRouteReview(int reviewId) {
		RouteReview routeReview = routeReviewDao.selectRouteReviewOne(reviewId);
		routeReview.setReviewLikeCnt(routeReview.getReviewLikeCnt() + 1);
		routeReviewDao.updateRouteReview(routeReview);
	}

}

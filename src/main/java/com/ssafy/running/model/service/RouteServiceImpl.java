package com.ssafy.running.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.running.model.dao.RouteDao;
import com.ssafy.running.model.dto.Route;

@Service
public class RouteServiceImpl implements RouteService {
	@Autowired
	private RouteDao routeDao;

	@Override
	public void writeRoute(Route route) {
		routeDao.insertRoute(route);
	}

	@Override
	public List<Route> getRouteList() {
		return routeDao.selectRouteList();
	}

	@Override
	public Route getRoute(int routeId) {
		return routeDao.selectRouteOne(routeId);
	}

	@Override
	public boolean removeRoute(int routeId) {
		return routeDao.deleteRoute(routeId) == 1;
	}

	@Override
	public void updateLikeCnt(int routeId) {
		Route route = routeDao.selectRouteOne(routeId);
		route.setLikeCnt(route.getLikeCnt() + 1);
		routeDao.updateRoute(route);
	}

}

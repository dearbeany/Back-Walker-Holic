package com.ssafy.running.model.dto;

public class Route {
	private int routeId; // 맵 아이디
	private String register; // 경로 등록자
	private String departLat; // 출발지 위도
	private String departLng; // 출발지 경도
	private String arriveLat; // 출발지 위도
	private String arriveLng; // 출발지 경도
	private String distance; // 소요 거리
	private String time; // 소요 시간
	private int likeCnt; // 좋아요 수
	private String regDate; // 경로 등록 일자

	public Route() {
	}

	public Route(int routeId, String register, String departLat, String departLng, String arriveLat, String arriveLng,
			String distance, String time, int likeCnt, String regDate) {
		super();
		this.routeId = routeId;
		this.register = register;
		this.departLat = departLat;
		this.departLng = departLng;
		this.arriveLat = arriveLat;
		this.arriveLng = arriveLng;
		this.distance = distance;
		this.time = time;
		this.likeCnt = likeCnt;
		this.regDate = regDate;
	}

	public int getRouteId() {
		return routeId;
	}

	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}

	public String getRegister() {
		return register;
	}

	public void setRegister(String register) {
		this.register = register;
	}

	public String getDepartLat() {
		return departLat;
	}

	public void setDepartLat(String departLat) {
		this.departLat = departLat;
	}

	public String getDepartLng() {
		return departLng;
	}

	public void setDepartLng(String departLng) {
		this.departLng = departLng;
	}

	public String getArriveLat() {
		return arriveLat;
	}

	public void setArriveLat(String arriveLat) {
		this.arriveLat = arriveLat;
	}

	public String getArriveLng() {
		return arriveLng;
	}

	public void setArriveLng(String arriveLng) {
		this.arriveLng = arriveLng;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getLikeCnt() {
		return likeCnt;
	}

	public void setLikeCnt(int likeCnt) {
		this.likeCnt = likeCnt;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "Route [routeId=" + routeId + ", register=" + register + ", departLat=" + departLat + ", departLng="
				+ departLng + ", arriveLat=" + arriveLat + ", arriveLng=" + arriveLng + ", distance=" + distance
				+ ", time=" + time + ", likeCnt=" + likeCnt + ", regDate=" + regDate + "]";
	}

}

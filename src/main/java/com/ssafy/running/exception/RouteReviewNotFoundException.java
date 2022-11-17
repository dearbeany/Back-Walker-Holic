package com.ssafy.running.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class RouteReviewNotFoundException extends RuntimeException {

	public RouteReviewNotFoundException(String msg) {
		super(msg);
	}
}

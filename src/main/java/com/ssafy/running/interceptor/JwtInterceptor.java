package com.ssafy.running.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.ssafy.running.util.JwtUtil;

@Component
public class JwtInterceptor implements HandlerInterceptor {
	// 요청을 넘길 때 키를 가지고 날린다
	private static final String HEADER_AUTH = "access-token";

	@Autowired
	private JwtUtil jwtUtil;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		if (request.getMethod().equals("OPTIONS"))
			return true;

		final String token = request.getHeader(HEADER_AUTH);

		if (token != null) { // 토큰이 있으면
			jwtUtil.valid(token); // 에러 없이 동작되면 정상
			return true;
		}

		throw new Exception("유효하지 않은 접근이다."); // 에러발생하면 유효성 검사에 걸린다
	}

}

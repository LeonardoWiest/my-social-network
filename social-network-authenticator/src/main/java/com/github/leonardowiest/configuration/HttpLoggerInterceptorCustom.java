package com.github.leonardowiest.configuration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class HttpLoggerInterceptorCustom extends HandlerInterceptorAdapter {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {

		if (logger.isInfoEnabled()) {

			logger.info("Request::{}:{}", request.getMethod(), request.getRequestURI());
		}

		return true;
	}
}

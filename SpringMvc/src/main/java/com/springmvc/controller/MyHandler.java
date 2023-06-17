package com.springmvc.controller;

import java.util.logging.Handler;

import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class MyHandler implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("Pre Handler");
		return HandlerInterceptor.super.preHandle(request, response, handler);
	}
	
	
}
package com.fadu.serverapi.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

@Component
public class CrossDomain implements Filter{

	
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException{
		
		HttpServletResponse response = (HttpServletResponse) res;
		
		response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE, PUT");
        response.setHeader("Access-Control-Max-Age", "3600");
        // Content-Type을 추가 하지 않으면 application/json 데이터 넘길때 크로스도메인 에러 현상 발생
        response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept ");
        
        response.setHeader("Access-Control-Allow-Origin", "*");

        chain.doFilter(req, res);
		
	}
	
	public void init(FilterConfig filterConfig) {}
	public void destroy() {}
	
}

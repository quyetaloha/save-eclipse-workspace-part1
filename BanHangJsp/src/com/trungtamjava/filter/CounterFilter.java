package com.trungtamjava.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;

@WebFilter(urlPatterns= {"/*"},initParams= {
		@WebInitParam(name="count",value="0")
})
public class CounterFilter implements Filter{
	private int count;
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		count++;
		HttpServletRequest request2=(HttpServletRequest) request;
		request2.getSession().setAttribute("hit-counter", count);
		chain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println(count);
		count=Integer.parseInt(filterConfig.getInitParameter("name"));
		
	}
	
}

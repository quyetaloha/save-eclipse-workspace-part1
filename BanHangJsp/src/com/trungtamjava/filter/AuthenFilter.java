package com.trungtamjava.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.trungtamjava.model.User;
import com.trungtamjava.service.UserService;

@WebFilter(urlPatterns= {"/*"})
public class AuthenFilter implements Filter{
	UserService UserService;
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest) request;
		HttpServletResponse resp=(HttpServletResponse) response;
		String url=req.getRequestURI();
		if(url.startsWith("/user/")) {
			String username=req.getParameter("username");
			String password=req.getParameter("password");
			HttpSession httpSession=req.getSession();
			Object obj=httpSession.getAttribute("user");
			if(obj!=null) {
				chain.doFilter(request, response);
			}
			else {
				if(username!=null&&password!=null) {
					User user=UserService.getUserByName(username);
					if(user!=null&& user.getPassword().equals(password)&&user.getRole().equals("ROLE_ADMIN")) {
						httpSession.setAttribute("username",username);
						chain.doFilter(request, response);
					}
					
				}
				else {
					resp.sendRedirect("/BanHangJsp/login.jsp?e");
				}
			}
		}
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		UserService=new UserService();
	}
	
}

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

import com.sun.xml.internal.bind.v2.runtime.Name;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

/*@WebFilter(urlPatterns= {"/servlet1","/servlet2"})*/
@WebFilter(urlPatterns= {"/*"},initParams= {
		@WebInitParam(name="count",value="100")
})
public class Logger implements Filter{
	private int count;
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("filter kết thúc");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		count++;
		System.out.println("Filter count= "+count);
		chain.doFilter(request, response);
		response.setContentType("text/plain");
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		count=Integer.valueOf(filterConfig.getInitParameter("count"));
		
	}

}

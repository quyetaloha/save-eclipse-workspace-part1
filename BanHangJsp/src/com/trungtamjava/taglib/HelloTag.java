package com.trungtamjava.taglib;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class HelloTag extends SimpleTagSupport{
	StringWriter stringWriter=new StringWriter();
	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public void doTag() throws JspException, IOException {
		getJspBody().invoke(stringWriter);
		JspWriter out=getJspContext().getOut();
		out.println("<strong>xin chào quyetdaik</strong>"+" "+stringWriter);
		out.println(message);
	}
}

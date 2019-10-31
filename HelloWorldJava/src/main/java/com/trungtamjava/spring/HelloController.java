package com.trungtamjava.spring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.trungtamjava.model.Person;

@Controller
// mapping tất cả đường dẫn hướng tới đề bắt đầu là admin
@RequestMapping(value="/admin")
public class HelloController {
	
	@Autowired
	@Qualifier("person2")
	private Person person;
	
	//cài đặt phương thức từ phía client gửi lên server. chỉ cho phép get gửi lên mới truy cập được.
	@RequestMapping(value= {"/hello","/say/hello"},method=RequestMethod.GET)
	public String sayHello(ModelMap map) {
		/* map.addAttribute("msg","trung tam java"); */
		map.addAttribute("person",person);
		return "hello";
	}
	
	//cách 2 để tạo hứng request
	@RequestMapping(value="/say-hello")
	public ModelAndView sayhello(HttpServletRequest request,HttpServletResponse response, HttpSession session) {
		request.setAttribute("person", person);
		return new ModelAndView("hello");
	}
}
package com.trungtamjava.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping(value="/hello")
	public String sayHello(ModelMap map) {
		map.addAttribute("msg","trung tam java");
		return "hello";
	}
}
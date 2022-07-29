package com.rebel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/home")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/hello")
	public ModelAndView hello() {
		return new ModelAndView("hello.jsp");
		
	}
	
	@RequestMapping("/hai/{name}/{tech}")
	public ModelAndView hai(@PathVariable String name, @PathVariable String tech) {
		System.out.println("Inside of Hai");
		ModelAndView modelAndView = new ModelAndView("hai.jsp");
//		String name = "Kishor";
//		String tech = "Java";
		modelAndView.addObject("msg", "Hai "+name+"<br>Hope you are enjoying "+tech);
		System.out.println("Model and view : "+modelAndView);
		
		return modelAndView;
	}

}

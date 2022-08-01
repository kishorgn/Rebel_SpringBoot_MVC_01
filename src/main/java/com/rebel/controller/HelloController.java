package com.rebel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/hello")
	public ModelAndView hello(String aa) {
		ModelAndView modelAndView = new ModelAndView("hello");
		modelAndView.addObject("name","Kishor");
		return modelAndView;
		
	}
	
	@RequestMapping("/hai")
	public ModelAndView hai() {
		System.out.println("Inside of Hai");
		ModelAndView modelAndView = new ModelAndView("hai");
		String name = "Kishor";
		String tech = "Java";
		modelAndView.addObject("msg", "Hai "+name+"<br>Hope you are enjoying "+tech);
		System.out.println("Model and view : "+modelAndView);
		
		return modelAndView;
	}

}

package com.rebel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.rebel.model.Person;

@Controller
public class EmployeeController {
	
	@RequestMapping("/newPerson")
	public ModelAndView personForm() {
		ModelAndView modelAndView = new ModelAndView("PersonForm");
		modelAndView.addObject("person", new Person());
		return modelAndView;
	}
	
	@RequestMapping("/regPerson")
	public ModelAndView personRegistration(@ModelAttribute Person person) {
		ModelAndView modelAndView = new ModelAndView("NewPerson");
		modelAndView.addObject("p1", person);
		return modelAndView;
	}

}

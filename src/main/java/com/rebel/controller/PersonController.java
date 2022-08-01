package com.rebel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.rebel.model.Person;
import com.rebel.service.PersonService;

@Controller
public class PersonController {
	
	PersonService personService;
	@Autowired
	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}

	@RequestMapping("/newPerson")
	public ModelAndView personForm() {
		ModelAndView modelAndView = new ModelAndView("PersonForm");
		modelAndView.addObject("person", new Person());
		return modelAndView;
	}
	
	@RequestMapping("/regPerson")
	public ModelAndView personRegistration(@ModelAttribute Person person) {
		ModelAndView modelAndView = new ModelAndView("redirect:listPersons");
		personService.savePerson(person);
		modelAndView.addObject("p1", "Person registered successfully with id : "+person.getId());
		return modelAndView;
	}
	
	@RequestMapping("/listPersons")
	public ModelAndView listPersons() {
		ModelAndView modelAndView = new ModelAndView("AllPersons");
		modelAndView.addObject("persons", personService.findAllPerson() );
		return modelAndView;
		
	}

}

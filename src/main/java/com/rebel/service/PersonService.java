package com.rebel.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rebel.exception.InvalidPersonIdException;
import com.rebel.model.Person;
import com.rebel.repo.PersonRepo;

@Service
public class PersonService {
	PersonRepo personRepo;
	@Autowired
	public void setPersonRepo(PersonRepo personRepo) {
		this.personRepo = personRepo;
	}
	public Person findPersonById(int id) throws InvalidPersonIdException {
		Optional<Person> optPerson = personRepo.findById(id);
		if(optPerson.isEmpty()) {
			throw new InvalidPersonIdException("Person ID not foudn : "+id);
		}
		return optPerson.get();
	}
	
	public List<Person> findAllPerson(){
		return personRepo.findAll();
	}
	
	public Person savePerson(Person person) {
		return personRepo.save(person);
	}
	
	public Person editPerson(Person person) throws InvalidPersonIdException {
		findPersonById(person.getId());
		return personRepo.save(person);
	}
	
	public Person deletePerson(int id) throws InvalidPersonIdException {
		Person found = findPersonById(id);
		personRepo.deleteById(id);
		return found;
	}
}

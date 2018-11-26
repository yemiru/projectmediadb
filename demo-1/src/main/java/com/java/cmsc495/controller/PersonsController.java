package com.java.cmsc495.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.cmsc495.model.Persons;
import com.java.cmsc495.repositories.PersonsRepository;

@RestController
public class PersonsController {
	
	
	@Autowired
	private PersonsRepository personsRepository;
	
	@RequestMapping(method=RequestMethod.GET,value="/persons/id")
	public List<Persons> getAllPursons(@pathVariable Integer id) {
		
		Persons obj = new Persons();
		obj.setPersonId(id);
		 return (List<Persons>) personsRepository.findAll();
		 
	}
	

}

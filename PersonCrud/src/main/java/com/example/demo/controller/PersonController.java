package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;

@RestController
@RequestMapping(path="con/person")
public class PersonController {
	private final PersonService ps;
	
	@Autowired
	public PersonController(PersonService ps) {
		super();
		this.ps = ps;
	}

	@GetMapping
	public List<Person> getPerson() {
		return ps.getPerson();
	}
	
	@PostMapping
	public void addPerson(@RequestBody Person p) {
		ps.addPerson(p);
	}
	
	@PutMapping
	public void updatePerson(@RequestBody Person np) {
		ps.updatePerson(np);
	}
	
	@DeleteMapping(path="{id}")
	public void deletebyId(@PathVariable int id) {
		ps.deletebyId(id);
	}

}

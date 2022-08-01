package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Person;
import com.example.demo.repo.PersonRepo;


@Service
public class PersonService {
	
	private final PersonRepo pr;
	
	@Autowired
	public PersonService(PersonRepo pr) {
		super();
		this.pr = pr;
	}

	
	public List<Person> getPerson() {
		return pr.findAll();
	}

	public void addPerson(Person p) {
		pr.save(p);
	}
	
	public void updatePerson(Person p) {
		if(pr.existsById(p.getId())) {
			Person np=pr.getById(p.getId());
			np.setAge(p.getAge());
			np.setEmail(p.getEmail());
			np.setName(p.getName());
			pr.save(np);
		}
	}
	
	public void deletebyId(int id) {
		if(pr.existsById(id)) {
			pr.deleteById(id);
		}
	}
}

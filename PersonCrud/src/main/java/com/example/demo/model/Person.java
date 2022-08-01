package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table
public class Person {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String email;
	private int age;
	public int getId() {
		return id;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(@JsonProperty("id") int id,@JsonProperty("name") String name,@JsonProperty("email") String email,@JsonProperty("age") int age) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}

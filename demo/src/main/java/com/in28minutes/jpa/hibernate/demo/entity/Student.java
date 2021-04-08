package com.in28minutes.jpa.hibernate.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
 
public class Student {
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
 
	@OneToOne(fetch=FetchType.LAZY)
	private Passport passport;
	
	
	@ManyToMany
	private List <Course> courses = new ArrayList<>();
 	
	protected Student() {}
	
	public Passport getPassport() {
		return passport;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	public Student(String name)
	{
		this.name=name;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	} 

}

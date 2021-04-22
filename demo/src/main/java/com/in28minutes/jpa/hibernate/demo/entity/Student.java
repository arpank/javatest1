package com.in28minutes.jpa.hibernate.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
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
	@JoinTable(name= "STUDENT_COURSE" , joinColumns= @JoinColumn(name="STUDENT_ID"),
	inverseJoinColumns = @JoinColumn(name="COURSE_ID")
			)
	
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

	public void addCourse(Course course) {
		this.courses.add(course);
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

package com.in28minutes.jpa.hibernate.demo.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
 
public class Passport {
	@Id
	@GeneratedValue
	private Long id;
	
	private String number;
 
	@OneToOne(fetch=FetchType.LAZY,  mappedBy = "passport")
	private Student student;
	
	protected Passport() {}
	
	public Passport(String number)
	{
		this.number=number;
	}
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + number + "]";
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String name) {
		this.number = name;
	}

	public Long getId() {
		return id;
	} 

}

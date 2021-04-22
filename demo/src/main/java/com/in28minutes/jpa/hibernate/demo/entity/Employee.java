package com.in28minutes.jpa.hibernate.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
//@Entity
//@Inheritance(strategy=InheritanceType.JOINED)	
public abstract class Employee {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column (nullable=false)
	private String name;
	private String address;
 
	protected Employee() {}	
	
	public Employee(String name)
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

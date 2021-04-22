package com.in28minutes.jpa.hibernate.demo.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FullTimeEmployee extends Employee {
 
	
 

	private BigDecimal salary;
	private BigDecimal commission;
 
	protected FullTimeEmployee() {}
	
	public FullTimeEmployee(String name)
	{

	}
	public FullTimeEmployee(String name, BigDecimal salary ,
			BigDecimal commission)
	{
		super(name);
	 
		this.salary = salary;
		this.commission=commission;
	}
 	
	
	@Override
	public String toString() {
		return "Course [  name=" + super.getName() + "]";
	}
 
}

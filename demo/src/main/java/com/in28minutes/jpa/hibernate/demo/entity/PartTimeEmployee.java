package com.in28minutes.jpa.hibernate.demo.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PartTimeEmployee extends Employee {
 
	
 

	private BigDecimal hourlyWage;
  
 
	protected PartTimeEmployee() {}
	
	public PartTimeEmployee(String name)
	{

	}
	public PartTimeEmployee(String name, BigDecimal hourlyWage )
	{
		super(name);
	 
		this.hourlyWage = hourlyWage;
	}
		
 
	
	
 

 

}

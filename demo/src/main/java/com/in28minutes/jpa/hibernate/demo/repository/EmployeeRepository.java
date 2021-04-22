package com.in28minutes.jpa.hibernate.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.in28minutes.jpa.hibernate.demo.entity.Employee;
@Repository
@Transactional
public class EmployeeRepository {
	
	@Autowired
	EntityManager em;
	
	 public void insert(Employee employee)
	 {
		 em.persist(employee);
	 }
	 
	 public List<Employee> retrieveAllFullTimeEmployees()
	 {
		 return em.createQuery("select e from FullTimeEmployee e", 
				 Employee.class)
		 .getResultList();
		 		
	 }
	 public List<Employee> retrieveAllPartTimeEmployees()
	 {
		 return em.createQuery("select e from PartTimeEmployee e", 
				 Employee.class)
		 .getResultList();
		 		
	 }
}

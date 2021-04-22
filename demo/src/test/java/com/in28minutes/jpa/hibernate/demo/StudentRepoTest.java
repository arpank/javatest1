package com.in28minutes.jpa.hibernate.demo;

import static org.junit.Assert.assertEquals;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.in28minutes.jpa.hibernate.demo.entity.Passport;
import com.in28minutes.jpa.hibernate.demo.entity.Student;
import com.in28minutes.jpa.hibernate.demo.repository.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentRepoTest {

	@Autowired
	public StudentRepository repo;
	
	
	@Test
	public void contextLoads() {
	}

	@Test 
	@Transactional
	public void findById()
	{
		Student c = repo.findbyId(20001L);
		System.out.println("c" + c.getPassport());
		assertEquals("Arpan Updated", c.getName());
		 
	 
	}
 
	@Test 
	@Transactional // persistance context
	public void someOperation()
	{
		repo.saveStudentWithPassport();
	//	repo.save (c);
		
	}
	
	
	
	@Test 
	@Transactional // persistance context
	public void someOperation1()
	{
		repo.saveStudentWithPassport();
	//	repo.save (c);
		
	}
 	
	
}

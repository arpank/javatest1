package com.in28minutes.jpa.hibernate.demo;

import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.in28minutes.jpa.hibernate.demo.entity.Course;
import com.in28minutes.jpa.hibernate.demo.entity.Student;
import com.in28minutes.jpa.hibernate.demo.repository.CourseRepository;
import com.in28minutes.jpa.hibernate.demo.repository.StudentRepository;


@RunWith(SpringRunner.class)
@SpringBootTest
public class JPQLTest {

	@Autowired
	public CourseRepository repo;
	
	@Autowired
	public StudentRepository studentRepo;
	@Test
	public void contextLoads() {
	}

	@Test 
	public void findById()
	{
		Student c = studentRepo.findbyId(20001L);
		System.out.println("Student rfom repo is " + c);
 	}
	
	@Test 
	@DirtiesContext
	public void deleteById_basic()
	{
		repo.deleteById(10002L);
		assertNull(repo.findbyId(10002L));
	}
	
 
	
}

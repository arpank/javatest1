package com.in28minutes.jpa.hibernate.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.jpa.hibernate.demo.entity.Course;
import com.in28minutes.jpa.hibernate.demo.entity.FullTimeEmployee;
import com.in28minutes.jpa.hibernate.demo.entity.PartTimeEmployee;
import com.in28minutes.jpa.hibernate.demo.repository.CourseRepository;
import com.in28minutes.jpa.hibernate.demo.repository.EmployeeRepository;
import com.in28minutes.jpa.hibernate.demo.repository.StudentRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	
	@Autowired 
	private CourseRepository repository;
	
	@Autowired 
	private StudentRepository studentRepository;
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public static void main(String[] args)  {
		
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		Course course = repository.findbyId(10001L);
 	
		repository.save(new Course ("Microservices in 100 steps"));
		System.out.println(course);
		
		studentRepository.saveStudentWithPassport();
		
		
		
		repository.addReviewsForCourse();
		
		
		studentRepository.retrieveStudentAndCourses();

		employeeRepository.insert(new PartTimeEmployee("Jack", new BigDecimal("100")));

		employeeRepository.insert(new FullTimeEmployee("Jack", new BigDecimal("10000"),
				 new BigDecimal("10000")));
		System.out.println("Full time " + employeeRepository.retrieveAllFullTimeEmployees());
	}
}

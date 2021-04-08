package com.in28minutes.jpa.hibernate.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.jpa.hibernate.demo.entity.Course;
import com.in28minutes.jpa.hibernate.demo.entity.Passport;
import com.in28minutes.jpa.hibernate.demo.entity.Student;
import com.in28minutes.jpa.hibernate.demo.repository.CourseRepository;
import com.in28minutes.jpa.hibernate.demo.repository.StudentRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	
	@Autowired 
	private CourseRepository repository;
	
	@Autowired 
	private StudentRepository studentRepository;
	
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
		
		
		

		
		
		
	}
}

package com.in28minutes.jpa.hibernate.demo.repository;

 
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.in28minutes.jpa.hibernate.demo.DemoApplication;
import com.in28minutes.jpa.hibernate.demo.entity.Course;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=DemoApplication.class)
public class DemoApplicationTests {

	@Autowired
	CourseRepository repository;
	
	
	@Test
	public void contextLoads() {
		 Course course = repository.findbyId(10001L);
		 
		 assertEquals("Test in 20 secs",course.getName());
	}
	
	@Test
	public void contextLoads11() {
		 Course course = repository.findbyId(10001L);
		 
		 assertEquals("Test in 20 secs",course.getName());
	}
	@Test
	public void contextLoads12() {
		 Course course = repository.findbyId(10001L);
		 
		 assertEquals("Test in 20 secs",course.getName());
	}

}

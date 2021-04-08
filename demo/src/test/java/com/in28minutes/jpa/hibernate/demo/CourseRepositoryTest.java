package com.in28minutes.jpa.hibernate.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.in28minutes.jpa.hibernate.demo.entity.Course;
@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseRepositoryTest {
	private   Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	public EntityManager em;
	
 
	@Test 
	public void findById()
	{
		List result = em.createQuery("Select c from Course c").getResultList();
		logger.info("Select ->{} " , result);
	}
 
	@Test 
	public void findById_type()
	{
		TypedQuery<Course> query = em.createQuery("Select c from Course c" , Course.class) ;
		List <Course> resultList = query.getResultList();
		
		
		TypedQuery<Course> query1 = em.createNamedQuery ("query_get_all" , Course.class) ;
		List <Course> resultList1 = query1.getResultList();
 
		logger.info("Select ->{} " , resultList);
		logger.info("Select1111111 ->{} " , resultList1);
	}
}

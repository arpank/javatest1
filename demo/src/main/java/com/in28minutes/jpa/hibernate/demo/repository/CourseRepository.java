package com.in28minutes.jpa.hibernate.demo.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.in28minutes.jpa.hibernate.demo.entity.Course;
import com.in28minutes.jpa.hibernate.demo.entity.Review;
@Repository
@Transactional
public class CourseRepository {
	
	@Autowired
	EntityManager em;
	
	public  Course findbyId(Long id)
	{
		return em.find(Course.class, id);
	}
	
	public void deleteById(Long id) {
		Course course = findbyId(id);
		em.remove(course);
	}
	
	public Course save(Course course) {

		if (course.getId()==null) 
		{
			em.persist(course);
		} else {
			em.merge(course);
		}

		return course;
	}
	public void playWithEM()
	{
		
		Course entity = new Course ("Web S in 100 steps");
		em.persist(entity );
		entity.setName("Arpan");
		Course entity2 = new Course ("Web S in 100 steps new");
		em.persist(entity2 );
		
		em.flush();
		em.clear();
		
		em.detach(entity2);
		entity.setName("Arpan");
	}
	
	public void addReviewsForCourse()
	{
		Course course = findbyId(10001L);
		System.out.println ( "Course reviews are " + course.getReviews());
		
		Review review1 = new Review("5", "Great handson");
		Review review2 = new Review("5", "Great handson");
		
		course.addRevew(review1);
		review1.setCourse(course);
		
		course.addRevew(review2);
		review2.setCourse(course);
		
		em.persist(review1);
		em.persist(review2);
	}
	
}

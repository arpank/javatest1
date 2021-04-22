package com.in28minutes.jpa.hibernate.demo.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.in28minutes.jpa.hibernate.demo.entity.Course;
import com.in28minutes.jpa.hibernate.demo.entity.Passport;
import com.in28minutes.jpa.hibernate.demo.entity.Student;
@Repository
@Transactional
public class StudentRepository {
	
	@Autowired
	EntityManager em;
  	
	public  Student findbyId(Long id)
	{
		return em.find(Student.class, id);
	}
	
	public void deleteById(Long id) {
		Student student = findbyId(id);
		em.remove(student);
	}
	
	public Student save(Student student) {

		if (student.getId()==null) 
		{
			em.persist(student);
		} else {
			em.merge(student);
		}

		return student;
	}
	
	public void saveStudentWithPassport( ) {

		Passport passport = new Passport ("abc");
		Student s = new Student("Arun");
		s.setPassport(passport);
		em.persist(passport);
		em.persist(s);
 	 
		
		Student c =  findbyId(20001L);
		Passport p =  c.getPassport();
		p.setNumber("asdf");
		c.setName("Arpan Updated");
		
		
		Passport pass = em.find(Passport.class, 40001L);
		System.out.println ( " Student is " + pass.getStudent() ) ;
		
	}
	
	public void playWithEM()
	{
		
		Student entity = new Student ("Web S in 100 steps");
		em.persist(entity );
		entity.setName("Arpan");
		Student entity2 = new Student ("Web S in 100 steps new");
		em.persist(entity2 );
		
		em.flush();
		em.clear();
		
		em.detach(entity2);
		entity.setName("Arpan");
	}
	
	public void retrieveStudentAndCourses()
	{
		
		Student student = em.find(Student.class, 20001L);
		
		System.out.println("Students courses are " + student.getCourses());
		
		Student s = new Student ("Jack11");
		Course c = new Course ("Microservicesz");
		Course c1 = new Course ("Microservicesz");
		Passport p = new Passport("20222");
		em.persist(s);
		em.persist(c);
		em.persist(p);
		em.persist(c1);
		s.addCourse(c);
		c.addStudent(s);
		s.addCourse(c1);
		c1.addStudent(s);
		s.setPassport(p);
		em.persist(s);
		
		
  
	}
	
	
}

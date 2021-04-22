package com.in28minutes.jpa.hibernate.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQuery(name="query_get_all", query="Select c from Course c") 
public class Course2 {
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
//	@UpdateTimestamp
//	private LocalDateTime lastUpdatedDate;
	//@CreationTimestamp
	//private LocalDateTime createdDate;
	//////////
	@OneToMany (mappedBy="course")
	private List<Review> reviews = new ArrayList<>();
	
	@ManyToMany(mappedBy="courses")
	private List <Student> students = new ArrayList<>();
	
	public List<Student> getStudents() {
		return students;
	}
	public void addStudent(Student student) {
		this.students.add(student);
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void addRevew( Review  review ) {
		this.reviews.add(review);
	}

	protected Course2() {}
	
	public Course2(String name)
	{
		this.name=name;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	} 

}

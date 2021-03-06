package com.in28minutes.jpa.hibernate.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
 
public class Review {
	@Id
	@GeneratedValue
	private Long id;
	private String rating;
	
	@ManyToOne
	private Course course ;
	
	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getdescription() {
		return description;
	}

	public void setdescription(String description) {
		this.description = description;
	}

	private String description;
 
	
	
	protected Review() {}
 
	public Review(String rating , String description)
	{
		this.rating=rating;
		this.description=description;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", description=" + description + "]";
	}

 

	public Long getId() {
		return id;
	} 

}

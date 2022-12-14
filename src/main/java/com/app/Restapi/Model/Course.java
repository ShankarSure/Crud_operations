package com.app.Restapi.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Table
@Entity
public class Course
{
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  
  @Column(name="Title")
  private String title;
  
  @Column(name="Description")
  private String Description;
  
public Course() {
	super();
	// TODO Auto-generated constructor stub
}
public Course(Long id, String title, String description) {
	super();
	this.id = id;
	this.title = title;
	Description = description;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDescription() {
	return Description;
}
public void setDescription(String description) {
	Description = description;
}
  
  
  
}

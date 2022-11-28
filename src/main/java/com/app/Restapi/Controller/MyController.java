package com.app.Restapi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Restapi.Model.Course;
import com.app.Restapi.Service.MyService;

@RestController
@RequestMapping("/")
public class MyController 
{
	@Autowired
     MyService service;

	@GetMapping("/home")
	public String home()
	{
		return "This is home Controller";
	}
	
	@GetMapping("/courses")
	public List<Course> getAllCourses()
	{
		return this.service.getAllCourses();
	}
	
	@GetMapping("/courses/{courseid}")
	public Course getCourse(@PathVariable String courseid)
	{
		return this.service.getCourse(Long.parseLong(courseid));
	}
	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course)
	{
		return this.service.addCourse(course);
	}
	
	@PutMapping("/courses/{courseid}")
	public Course updateCourse(@PathVariable String courseid)
	{
		return this.service.updateCourse(courseid);
	}
	
	@DeleteMapping("/courses/{courseid}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseid)
	{
		try
		{
			this.service.deleteCourse(Long.parseLong(courseid));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
}

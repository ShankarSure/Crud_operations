package com.app.Restapi.Service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.app.Restapi.Model.Course;

@Service
public interface MyService 
{

	List<Course> getAllCourses();
	
	 Course getCourse(Long courseid);

	Course addCourse(Course course);

	Course updateCourse(String courseid);

	void deleteCourse(Long parseLong);
}


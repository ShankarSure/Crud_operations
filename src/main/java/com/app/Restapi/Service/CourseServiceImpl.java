package com.app.Restapi.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Restapi.Model.Course;
import com.app.Restapi.Repository.CourseRepository;

@Service
public class CourseServiceImpl implements MyService 
{
	@Autowired
 CourseRepository repo;
//	 List<Course> list;
	 
//	 public CourseServiceImpl()
//	 {
//		 list=new ArrayList<>();
//		 list.add(new Course(123,"ABC","JAVA"));
//		 list.add(new Course(456,"PQR","PYTHON"));
//		 list.add(new Course(789,"MNO",".NET"));
	
//	 }
	 
	@Override
	public List<Course> getAllCourses()
	{
		return this.repo.findAll();
//		return list;
	}

	public Course getCourse(Long courseid) 
	{
		
//		Course c=null;
//		for(Course course:list)
//		{
//			if(course.getId()==courseid)
//			{
//				c=course;
//				break;
//			}
//		}
		
		
		return this.repo.getOne(courseid);
	}
	
	public Course addCourse(Course course) {
//	    list.add(course);
		return this.repo.save(course);
	}

	
	public void deleteCourse(Long parseLong) 
	{
//		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		Course entity=this.repo.getOne(parseLong);
		this.repo.delete(entity);
		
	}

	public Course updateCourse(String courseid) {
//		list.forEach(e->{
//			if(e.getId()==course.getId() )
//			{
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
		return this.repo.save(null);
	}


}




	

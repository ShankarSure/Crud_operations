package com.app.Restapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.app.Restapi.Model.Course;

@Repository
@EnableJpaRepositories
public interface CourseRepository extends JpaRepository<Course,Long>{

}

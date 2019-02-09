package com.mrb.firstapp.course;

import org.springframework.data.repository.CrudRepository;
import com.mrb.firstapp.course.Course;

public interface CourseRepository extends CrudRepository<Course, String>{

}

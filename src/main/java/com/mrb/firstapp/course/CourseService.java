package com.mrb.firstapp.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	CourseRepository courseRepository;
	
	List<Course> courses = new ArrayList<>();
	
	public List<Course> getAllCourses() {
		List<Course> courses = new ArrayList<>();
		courseRepository.findAll()
		.forEach(courses::add);
		return courses;
	}
	
	public Course getCourse(String id) {
		return courseRepository.findOne(id);
	}
	
	public void addCourse(Course course) {
		courseRepository.save(course);
	}
	
	public void updateCourse(Course course, String id) {
		courseRepository.save(course);
	}
	
	public void deleteCourse(String id) {
		courseRepository.delete(id);
	}
}

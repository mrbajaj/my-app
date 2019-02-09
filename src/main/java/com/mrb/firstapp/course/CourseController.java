package com.mrb.firstapp.course;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
//	@RequestMapping("/courses")
//	public List<Course> getAllTopics() {
//		return courseService.getAllCourses();
//	}
//	
//	@RequestMapping("/courses/{id}")  // default method is get, we can also specify request method in case of Get as well
//	public Course getTopic(@PathVariable String id) {
//		return courseService.getCourse(id);
//	}
//	
//	@RequestMapping(method=RequestMethod.POST , value="/courses")
//	public void addTopic(@RequestBody Course course) {
//		courseService.addCourse(course);
//	}
//	
//	@RequestMapping(method=RequestMethod.PUT , value="/topics/{id}")
//	public void updateTopic(@RequestBody Course course, @PathVariable String id) {
//		courseService.updateCourse(course, id);
//	}
//	
//	@RequestMapping(method=RequestMethod.DELETE , value="/topics/{id}")
//	public void deleteCourse(@PathVariable String id) {
//		courseService.deleteCourse(id);
//	}
	
}

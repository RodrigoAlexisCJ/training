package com.tcs.exampleSpringBoot.course.controller;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.exampleSpringBoot.course.bean.Course;

@RestController
public class CourseController {
	//http://localhost:8080/course
	@GetMapping("/course")
	public List<Course> getAllCourses(){
		return Arrays.asList(new Course(1,"Learn Microservice", "tcs"),
				new Course(2,"Learn Full Satck with Angular and React", "tcs"));
	}
	
	//http://localhost:8080/course/1
		@GetMapping("/course/1")
		public Course getCourseDetail(){
			return new Course(1,"Learn Microservice", "tcs");
		}
}

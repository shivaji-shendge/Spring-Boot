package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Course;
import com.example.demo.services.CourseService;

@RestController
public class MyController {
	@Autowired
	private CourseService service;
	List<Course> list;
	@GetMapping("/courses")
	public List<Course> getCourses(){
		list=service.getCourses();
		return list;	
	}
	@GetMapping("/courses/{id}")
	public Course getCourse(@PathVariable int id) {
		
		return service.getCourse(id);
		
	}
	@PostMapping("/courses")
	public boolean addCourse(@RequestBody Course course) {
		return service.addCourse(course);
		
	}
	@PutMapping("/courses/{id}")
	public String updateCourse(@PathVariable int id, @RequestBody Course c) {
		boolean b=service.updateCourse(id, c);
		return b?"Course Update Suceess":"Course Update Fail";
	}
	@DeleteMapping("/courses/{id}/{name}")
	public String deleteCourse(@PathVariable int id, @PathVariable String name) {
		boolean b=service.deleteCourse(id, name);
		return b?"Course Deleted Suceess":"Course Delete Fail";
		
	}


}

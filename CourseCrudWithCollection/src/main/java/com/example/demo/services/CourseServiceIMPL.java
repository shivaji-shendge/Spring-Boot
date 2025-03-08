package com.example.demo.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entities.Course;
@Service
public class CourseServiceIMPL implements CourseService {

	List<Course> list;
	public CourseServiceIMPL() {
		list = new ArrayList<Course>();
		list.add(new Course(4528,"Java Course","This Course contain java and frameworks"));
		list.add(new Course(4565,"Spring Boot","This Course contain advance java concepts"));
		list.add(new Course(4515,"Front End Technologies","This Course contain HTML, CSS and JavaScript"));
	}
	
	@Override
	public List<Course> getCourses() {
		return list;
	}

	@Override
	public Course getCourse(int id) {
		for(Course c: list) {
			if(c.getId()==id)
				return c;
		}
		return null;
	}

	@Override
	public boolean addCourse(Course course) {
		
		return list.add(course);
	}

	@Override
	public boolean updateCourse(int id,Course course) {
		for(Course c: list) {
			if(c.getId()==id) {
				c.setName(course.getName());
			    c.setDescription(course.getDescription());
			    return true;
			}
				
		}
		return false;
	}

	@Override
	public boolean deleteCourse(int id, String name) {
		Iterator<Course> iterator = list.iterator();
	    while (iterator.hasNext()) {
	        Course c = iterator.next();
	        if (c.getId() == id && c.getName().equals(name)) { 
	            iterator.remove(); 
	            return true; 
	        }
	    }
	    return false;
		
	}
	
}

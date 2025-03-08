package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Course;

public interface CourseService {
public List<Course> getCourses();
public Course getCourse(int id);
public boolean addCourse(Course course);
public boolean updateCourse(int id,Course c);
public boolean deleteCourse(int id, String name);
}

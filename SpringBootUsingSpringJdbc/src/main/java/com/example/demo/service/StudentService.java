package com.example.demo.service;

import java.util.List;

import com.example.demo.modal.Student;

public interface StudentService {
	public boolean isAddStudent(Student student);
	public List<Student> getAllStudents();
	public boolean isUpdateStudent(Student student);
	public boolean isDeleteStudent(Student student);
}

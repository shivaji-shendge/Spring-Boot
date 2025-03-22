package com.example.demo.repository;

import java.util.List;

import com.example.demo.modal.Student;

public interface StudentRepo {
	public boolean isAddStudent(Student student);
	public List<Student> getAllStudents();
	public boolean isUpdateStudent(Student student);
	public boolean isDeleteStudent(Student student);

}

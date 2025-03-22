package com.example.demo.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.demo.modal.Student;
@Repository
public class StudentRepoImpl implements StudentRepo{
	@Autowired
	JdbcTemplate template;

	@Override
	public boolean isAddStudent(Student student) {
		String query="insert into student values ('0',?,?)";
		int value=template.update(query,new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, student.getName());
				ps.setInt(2, student.getAge());;
				
			}
		});
		return value!=0 ;
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> list = new ArrayList<>();
		list = template.query("select *from student", new RowMapper<Student>() {

			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student s = new Student();
				s.setId(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setAge(rs.getInt(3));
				return s;
			}
			
		});
		return list;
		
		}

	@Override
	public boolean isUpdateStudent(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isDeleteStudent(Student student) {
		// TODO Auto-generated method stub
		return false;
	}

}

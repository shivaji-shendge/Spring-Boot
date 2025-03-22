package com.example.demo;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;

@SpringBootApplication
public class SpringBootUsingSpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringBootUsingSpringJdbcApplication.class, args);
			
	}

}

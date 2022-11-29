package com.hexagon.configuration;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

import com.hexagon.service.Student;
import com.hexagon.service.StudentImpl;

@Configurable
public class StudentConfig {
	
	@Bean(name="studentBean")
	public Student student() {
		return new StudentImpl();
	}

}

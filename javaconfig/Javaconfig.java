package com.springlearn.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springlearn.javaconfig")
public class Javaconfig {
	
	@Bean
	public Teacher getTeacher() {
		Teacher teacher = new Teacher();
		return teacher;
	}
	
}

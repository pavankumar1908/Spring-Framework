package com.springlearn.javaconfig;

import org.springframework.stereotype.Component;

@Component
public class Teacher {
	void teach() {
		System.out.println("Teaching");
	}
}

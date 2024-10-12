package com.springlearn.javaconfig;

import org.springframework.stereotype.Component;

@Component("s1")
public class Student {
	private Teacher t1;

	public Student(Teacher t1) {
		super();
		this.t1 = t1;
	}

	public Teacher getT1() {
		return t1;
	}

	public void setT1(Teacher t1) {
		this.t1 = t1;
	}

	void Study() {
		this.t1.teach();
		System.out.println("Studing !!!!!");
	}
}

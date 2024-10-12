package com.springlearn.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext con = new AnnotationConfigApplicationContext(Javaconfig.class);
		Student s1 = (Student) con.getBean("s1");
		System.out.println(s1);
		s1.Study();
//		Teacher t1 = (Teacher) con.getBean("teacher");
//		System.out.println(t1);
	}
}

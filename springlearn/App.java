package com.springlearn.springlearn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

//		// Using value as Tag
//		Student student1 = (Student) context.getBean("student1");
//		System.out.println(student1);
//
//		// Using value as Attribute
//		Student student2 = (Student) context.getBean("student2");
//		System.out.println(student2);
//
//		// Using p Schema
//		Student student3 = (Student) context.getBean("student3");
//		System.out.println(student3);
		
		A a = (A)context.getBean("aref");
		System.out.println(a.getNum1());
		System.out.println(a.getOb().getNum2());
	}
	
	
	
	
}

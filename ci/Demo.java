package com.springlearn.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springlearn/ci/config.xml");

//		// using value as Attribute
//		Person p = (Person) context.getBean("person");
//		System.out.println(p);
//
//		// using value as element or tag
//		Person p1 = (Person) context.getBean("person1");
//		System.out.println(p1);
//
//		// using value as c:schema
//		Person p2 = (Person) context.getBean("person2");
//		System.out.println(p2);
		
		Addition a1 = (Addition) context.getBean("Add");
		a1.add();
		
	}
	
		

}

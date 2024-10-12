package com.springlearn.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springlearn/collections/config.xml");
		Emp emp1 = (Emp) context.getBean("emp1");
		System.out.println(emp1.getName());
		System.out.println(emp1.getAddress());
		System.out.println(emp1.getPhones());
		System.out.println(emp1.getCourses());

	}

}

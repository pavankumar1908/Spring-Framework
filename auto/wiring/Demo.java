package com.springlearn.auto.wiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springlearn/auto/wiring/config.xml");
		Employee emp1 = (Employee) context.getBean("emp1");
		System.out.println(emp1);
		
		
		
		
	}

}

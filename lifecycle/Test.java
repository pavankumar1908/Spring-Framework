package com.springlearn.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springlearn/lifecycle/config.xml");
//		Samosa s1 = (Samosa)context.getBean("s1");
//		System.out.println(s1);
		context.registerShutdownHook();
		
//		Pepsi pep = (Pepsi)context.getBean("p1");
//		System.out.println(pep);
		
		
		Example exam = (Example)context.getBean("eg");
		System.out.println(exam);
		
		
	}
}

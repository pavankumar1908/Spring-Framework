package com.springlearn.springexpressionlanguage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext(
				"com/springlearn/springexpressionlanguage/sterotypeconfig.xml");
//		Demo d1 = (Demo) con.getBean("demo");
//		System.out.println(d1);
		
		Demo2 d1 = (Demo2) con.getBean("demo2");
		System.out.println(d1);
	}
}

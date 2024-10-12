package com.springlearn.springexpressionlanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Demo {
	@Value("#{22+11}")
	private int num1;
	@Value("#{30 > 10 ? 30 : 10}")
	private int num2;
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Demo [num1=" + num1 + ", num2=" + num2 + "]";
	}
	
}

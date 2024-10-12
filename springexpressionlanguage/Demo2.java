package com.springlearn.springexpressionlanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo2 {
	@Value("#{15 + 30}")
	private int num1;

	@Value("#{20 > 15 ? 10 : 20}")
	private int num2;

	@Value("#{T(java.lang.Math).sqrt(225)}")
	private double num3;

	@Value("#{50}")
	private double num4;

	@Value("#{T(java.lang.Math).PI}")
	private double num5;

	@Value("#{new java.lang.String('Pavankumar Srinivas Karnati')}")
	private String name;

	
	public boolean isActive() {
		return isActive;
	}

	@Override
	public String toString() {
		return "Demo2 [num1=" + num1 + ", num2=" + num2 + ", num3=" + num3 + ", num4=" + num4 + ", num5=" + num5
				+ ", name=" + name + ", isActive=" + isActive + "]";
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	@Value("#{8 -4 > 3 }")
	private boolean isActive;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Demo2() {
		super();
		// TODO Auto-generated constructor stub
	}

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

	public double getNum3() {
		return num3;
	}

	public void setNum3(double num3) {
		this.num3 = num3;
	}

	public double getNum4() {
		return num4;
	}

	public void setNum4(double num4) {
		this.num4 = num4;
	}

	public double getNum5() {
		return num5;
	}

	public void setNum5(double num5) {
		this.num5 = num5;
	}

}

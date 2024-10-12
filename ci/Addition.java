package com.springlearn.ci;

public class Addition {
	private int a;
	private int b;
	
	
	public Addition (int a , int b) {
		this.a = a;
		this.b = b;
		System.out.println("Integer Constructor");
	}
	
	public Addition (double a , double b) {
		this.a = (int) a;
		this.b = (int) b;
		System.out.println("Double Constructor");
	}
	
	public Addition (String a , String b) {
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("String Contructor");
	}
	
	public void add() {
		System.out.println("The addition of two numbers is "+ (this.a + this.b));
	}
}

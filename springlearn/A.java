package com.springlearn.springlearn;

public class A {
	private int num1;
	private B ob;
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public B getOb() {
		return ob;
	}
	public void setOb(B ob) {
		this.ob = ob;
	}
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "A [num1=" + num1 + ", ob=" + ob + "]";
	}
	
}

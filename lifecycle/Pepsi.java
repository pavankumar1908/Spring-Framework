package com.springlearn.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean , DisposableBean{
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Pepsi() {
		super();
		
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy Pepsi");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Init pepsi");
		
	}
	
}

package com.springlearn.auto.wiring.annotation;

public class Address {
	private String Area;
	private String city;

	public String getArea() {
		return Area;
	}

	public void setArea(String area) {
		Area = area;
	}

	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "Address [Area=" + Area + ", city=" + city + "]";
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
}

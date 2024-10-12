package com.springlearn.ci;

public class Person {
	private int personId;
	private String personName;
	private Job j;

	public Person(int personId, String personName,Job j) {
		this.personId = personId;
		this.personName = personName;
		this.j = j;
	}

	@Override
	public String toString() {
		return this.personId + ":" + this.personName +":" +this.j;
	}

}

package com.observerDesignPattern;

public class Person  implements Observer{
	private String personName;
	
	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public void update(String post) {
		System.out.println("Hello " + personName + " ur " + post + " is now avaliable in our station plz come and collect..");
	}

	@Override
	public String toString() {
		return "Person [personName=" + personName + "]";
	}
	
	

}

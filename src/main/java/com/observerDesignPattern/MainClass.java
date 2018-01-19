package com.observerDesignPattern;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("start...");
		Person p1 = new Person();
		p1.setPersonName("Tejas");
		
		Person p2 = new Person();
		p2.setPersonName("Ravi");
		
		PostOfficeStation pos = new PostOfficeStation();
		pos.setPostName("Stack OverFlow");
		
		pos.subscribeObserver(p1);
		pos.subscribeObserver(p2);
		pos.notifiyAllObserver();
		
		System.out.println("----------1 year later--------");
		//after few days..
		pos.unsubscribeObserver(p1);

		pos.notifiyAllObserver();
		
		System.out.println("end..");
	}
}

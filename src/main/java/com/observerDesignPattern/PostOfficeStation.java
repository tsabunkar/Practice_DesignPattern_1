package com.observerDesignPattern;


import java.util.ArrayList;
import java.util.List;

public class PostOfficeStation implements Subject {

	private String postName;
	private List<Observer> listOfObsers;
	
	
	public PostOfficeStation() {

		listOfObsers = new ArrayList<Observer>();
	}
	
	

	public String getPostName() {
		return postName;
	}



	public void setPostName(String postName) {
		this.postName = postName;
	}



	public void subscribeObserver(Observer obser) {
		//System.out.println("Observer that is added to list is : "+obser);
		listOfObsers.add(obser);
	}

	public void unsubscribeObserver(Observer obser) {
	//	System.out.println("Observer that is removed from the list is : "+obser);
		int indexToRemoveFromList = listOfObsers.indexOf(obser);
		//System.out.println("Observer with index "+ indexToRemoveFromList+ " is removed from the list");
		listOfObsers.remove(indexToRemoveFromList);
	}

	public void notifiyAllObserver() {

		System.out.println("notifiying all the subcribers (or) Observers  that post "+postName+"is avaliable in POSTOFFICE");
		for (Observer observer : listOfObsers) {
			observer.update(postName);
		}
	}

}

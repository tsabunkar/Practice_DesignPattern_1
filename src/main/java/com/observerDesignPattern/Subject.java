package com.observerDesignPattern;

//Observable is Subject.
public interface Subject {

	public void subscribeObserver(Observer obser);
	public void unsubscribeObserver(Observer obser);
	public void notifiyAllObserver();
}

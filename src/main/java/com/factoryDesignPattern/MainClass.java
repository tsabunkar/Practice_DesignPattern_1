package com.factoryDesignPattern;

public class MainClass {
	public static void main(String[] args) {
	
	/*	OS osObj = new Windows();
		osObj.specification();*/
		
	// but we want to hide this implementation from end user.
	// Soo We create FactoryDesignPattern Class which gives the instance 
	// of class that are implementing OS interface.
	//by requesting the string
		
		FactroyDesignPatterImpl fdp = new FactroyDesignPatterImpl();
		OS osObj = fdp.getInstanceOfOS("outdateOS");
		osObj.specification();
	}
}

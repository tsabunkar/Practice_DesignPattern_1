package com.factoryDesignPattern;

public class FactroyDesignPatterImpl {
	public OS getInstanceOfOS(String str){
		
		if(str.equals("openOS"))
			return new Android();
		else if(str.equals("bestOS"))
			return new IOS();
		else if (str.equals("outdateOS"))
			return new Windows();
		else
		return new InValidEntry();
		
	}
}

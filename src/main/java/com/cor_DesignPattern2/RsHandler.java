package com.cor_DesignPattern2;

public abstract class RsHandler {
	
	RsHandler rsHandler;
	
	public void nextHandler(RsHandler rsHandlerObj){
		this.rsHandler = rsHandlerObj;
	}

	public abstract void dispatchRs(long requestedAmount);
} 

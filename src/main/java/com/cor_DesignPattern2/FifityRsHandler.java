package com.cor_DesignPattern2;

public class FifityRsHandler extends RsHandler{
	@Override
	public void dispatchRs(long requestedAmount) {

		long noOfNotesToBeDispatched = requestedAmount/50;
		
		if(noOfNotesToBeDispatched > 0 ){
			if(noOfNotesToBeDispatched>1){
				System.out.println(noOfNotesToBeDispatched + ", Fifty rs notes is dispatch in FiftyRS Handler");
			}
			else{
				System.out.println(noOfNotesToBeDispatched + ", Fifty rs notes is dispatch in FiftyRS Handler");

			}
		}
		
		long pendingAmtToBeProcessed = requestedAmount % 50;
		if( pendingAmtToBeProcessed > 0){
			rsHandler.dispatchRs(pendingAmtToBeProcessed);
		}
		
	}
}

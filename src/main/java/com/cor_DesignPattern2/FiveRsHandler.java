package com.cor_DesignPattern2;

public class FiveRsHandler extends RsHandler {

	@Override
	public void dispatchRs(long requestedAmount) {

		long noOfNotesToBeDispatched = requestedAmount/5;
		
		if(noOfNotesToBeDispatched > 0 ){
			if(noOfNotesToBeDispatched>1){
				System.out.println(noOfNotesToBeDispatched + ", Five rs notes is dispatch in FiveRs Handler");
			}
			else{
				System.out.println(noOfNotesToBeDispatched + ", Five rs notes is dispatch in FiveRs Handler");

			}
		}
		
		long pendingAmtToBeProcessed = requestedAmount % 5;
		if( pendingAmtToBeProcessed > 0){
			rsHandler.dispatchRs(pendingAmtToBeProcessed);
		}
		
	}
}

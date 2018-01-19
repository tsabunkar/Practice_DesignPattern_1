package com.cor_DesignPattern2;

public class TwentyRsHandler extends RsHandler {
	@Override
	public void dispatchRs(long requestedAmount) {

		long noOfNotesToBeDispatched = requestedAmount/20;
		
		if(noOfNotesToBeDispatched > 0 ){
			if(noOfNotesToBeDispatched>1){
				System.out.println(noOfNotesToBeDispatched + ", Twenty rs notes is dispatch in TwentyRs Handler");
			}
			else{
				System.out.println(noOfNotesToBeDispatched + ", Twenty rs notes is dispatch in TwentyRs Handler");

			}
		}
		
		long pendingAmtToBeProcessed = requestedAmount % 20;
		if( pendingAmtToBeProcessed > 0){
			rsHandler.dispatchRs(pendingAmtToBeProcessed);
		}
		
	}
}

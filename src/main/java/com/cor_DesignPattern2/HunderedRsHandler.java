package com.cor_DesignPattern2;

public class HunderedRsHandler extends RsHandler {

	@Override
	public void dispatchRs(long requestedAmount) {

		long noOfNotesToBeDispatched = requestedAmount/100;
		
		if(noOfNotesToBeDispatched > 0 ){
			if(noOfNotesToBeDispatched>1){
				System.out.println(noOfNotesToBeDispatched + ", Hundred rs notes is dispatch in HundlerRs Handler");
			}
			else{
				System.out.println(noOfNotesToBeDispatched + ", Hundred rs notes is dispatch in HundlerRs Handler");

			}
		}
		
		long pendingAmtToBeProcessed = requestedAmount % 100;
		if( pendingAmtToBeProcessed > 0){
			rsHandler.dispatchRs(pendingAmtToBeProcessed);
		}
		
	}

}

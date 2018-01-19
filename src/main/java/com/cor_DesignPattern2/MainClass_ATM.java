package com.cor_DesignPattern2;

public class MainClass_ATM {

	public static void main(String[] args) {

		HunderedRsHandler hrh = new HunderedRsHandler();
		FifityRsHandler fifrh = new  FifityRsHandler();
		TwentyRsHandler trh = new TwentyRsHandler();
		FiveRsHandler frh = new FiveRsHandler();
		
		
		hrh.nextHandler(fifrh);
		fifrh.nextHandler(trh);
		trh.nextHandler(frh);
		
		//please entrer amont less that 500
		
		hrh.dispatchRs(280);
	}

}

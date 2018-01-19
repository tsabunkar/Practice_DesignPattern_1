package com.cor_DesignPattern;
public class Manager extends Employee{

	private int MAX_LEAVE_CAN_APPROVE = 30;
	
	@Override
	public void applyLeave(String employeeName, int noDaysLeave) {
		
		if(noDaysLeave <= MAX_LEAVE_CAN_APPROVE)
			leaveApproved(employeeName, noDaysLeave);
		else
		System.out.println(" Ur request for leave is more than 30 days. It cannot be approved !!");
	}

	private void leaveApproved(String employeeName, int noDaysLeave) {

		System.out.println(employeeName + " ur request for number of days leave "+ noDaysLeave+ "has been approved  by -Manager..");
	}
}

package com.cor_DesignPattern;
public class ProjectLeader extends Employee {

	private int MAX_LEAVE_CAN_APPROVE = 20;
	
	@Override
	public void applyLeave(String employeeName, int noDaysLeave) {
		
		if(noDaysLeave <= MAX_LEAVE_CAN_APPROVE)
			leaveApproved(employeeName, noDaysLeave);
		else
		getSupervisor().applyLeave(employeeName, noDaysLeave);
	}

	private void leaveApproved(String employeeName, int noDaysLeave) {

		System.out.println(employeeName + " ur request for number of days leave "+ noDaysLeave+ "has been approved  by -ProjectLeader..");
	}
}

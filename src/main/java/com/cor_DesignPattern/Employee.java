package com.cor_DesignPattern;

public abstract class Employee {
	
	//next element in COR
	private Employee supervisor;
	
	
	public Employee getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Employee supervisor) {
		this.supervisor = supervisor;
	}

	public void setNextSupervisor(Employee emp) {
		this.supervisor = emp;
	}
	
	public abstract void applyLeave(String employeeName, int noDaysLeave);
	
}

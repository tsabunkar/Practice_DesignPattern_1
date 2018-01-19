package com.cor_DesignPattern;
public class MainClass {

	public static void main(String[] args) {

		TeamLeader teamLead = new TeamLeader();
		ProjectLeader projectLead = new ProjectLeader();
		Manager mgr = new Manager();
		
		teamLead.setNextSupervisor(projectLead);
		projectLead.setNextSupervisor(mgr);
		
		teamLead.applyLeave("Tejas", 20);
	}

}

package com.xworkz.tasks.employee;

public class PoliceOfficer extends Employee{
    public void requestLeave() {
        System.out.println("Police: Requesting leave for personal reasons.");
    }

    public void clockOut() {
        System.out.println("Police: Wrapping up shift and handing over to next team.");
    }

    public void respondToCall() {
        System.out.println("Police: Responding to emergency call.");
    }

    public void patrolArea() {
        System.out.println("Police: Patrolling designated area for suspicious activity.");
    }

    public void arrestSuspect() {
        System.out.println("Police: Arresting a suspect for alleged crime.");
    }
}

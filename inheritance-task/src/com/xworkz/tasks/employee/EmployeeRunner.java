package com.xworkz.tasks.employee;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.employeeName();
        employee.employeeType();
        employee.clockIn();
        employee.performTask();
        employee.attendMeeting();

        Employee employee2 = new PoliceOfficer();
        employee2.employeeName();
        employee2.employeeType();
        employee2.clockIn();
        employee2.performTask();
        employee2.attendMeeting();

        PoliceOfficer policeOfficer = new PoliceOfficer();
        policeOfficer.requestLeave();
        policeOfficer.clockOut();
        policeOfficer.respondToCall();
        policeOfficer.patrolArea();
        policeOfficer.arrestSuspect();

        Employee employee1 = new PoliceOfficer();

        PoliceOfficer policeOfficer1 = (PoliceOfficer) employee1;
        System.out.println(policeOfficer1);
    }
}

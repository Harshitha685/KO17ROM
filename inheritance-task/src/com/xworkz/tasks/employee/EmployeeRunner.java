package com.xworkz.tasks.employee;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.employeeName();
        employee.employeeType();

        PoliceOfficer policeOfficer = new PoliceOfficer();
        policeOfficer.employeeName();
        policeOfficer.employeeType();

        Employee employee1 = new PoliceOfficer();

        PoliceOfficer policeOfficer1 = (PoliceOfficer) employee1;
        System.out.println(policeOfficer1);
    }
}

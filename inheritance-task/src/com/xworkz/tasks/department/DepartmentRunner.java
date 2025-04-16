package com.xworkz.tasks.department;

public class DepartmentRunner {
    public static void main(String[] args) {
        Department department = new Department();
        department.isDepartmentActive();
        department.assignManager();
        department.conductMeeting();
        department.assignWork();
        department.evaluatePerformance();

        Department department2 = new HRDepartment();
        department2.isDepartmentActive();
        department2.assignManager();
        department2.conductMeeting();
        department2.assignWork();
        department2.evaluatePerformance();

        HRDepartment hrDepartment = new HRDepartment();
        hrDepartment.recruitEmployees();
        hrDepartment.conductTraining();
        hrDepartment.resolveConflicts();
        hrDepartment.maintainEmployeeRecords();
        hrDepartment.organizeEvents();

        Department department1 = new HRDepartment();

        HRDepartment hrDepartment1 = (HRDepartment) department1;
        System.out.println(hrDepartment1);
    }
}

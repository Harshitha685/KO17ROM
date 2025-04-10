package com.xworkz.tasks.department;

public class DepartmentRunner {
    public static void main(String[] args) {
        Department department = new Department();
        department.isDepartmentActive();
        department.assignManager();

        HRDepartment hrDepartment = new HRDepartment();
        hrDepartment.assignManager();
        hrDepartment.isDepartmentActive();
    }
}

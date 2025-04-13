package com.xworkz.tasks.department;

public class DepartmentRunner {
    public static void main(String[] args) {
        Department department = new Department();
        department.isDepartmentActive();
        department.assignManager();

        HRDepartment hrDepartment = new HRDepartment();
        hrDepartment.assignManager();
        hrDepartment.isDepartmentActive();

        Department department1 = new HRDepartment();

        HRDepartment hrDepartment1 = (HRDepartment) department1;
        System.out.println(hrDepartment1);
    }
}

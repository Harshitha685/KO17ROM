package com.xworkz.tasks.owner;

public class OwnerRunner {
    public static void main(String[] args) {
        Owner owner = new Owner();
        owner.ownerName();
        owner.ownerAge();
        owner.ownerAddress();
        owner.ownsProperty();
        owner.idProof();

        System.out.println("--------------------------");

        Owner owner2 = new CompanyOwner();
        owner2.ownerName();
        owner2.ownerAge();
        owner2.ownerAddress();
        owner2.ownsProperty();
        owner2.idProof();

        System.out.println("--------------------------");

        CompanyOwner comp = new CompanyOwner();
        comp.companyName();
        comp.numberOfEmployees();
        comp.companyLocation();
        comp.yearlyRevenue();
        comp.gstNumber();

        System.out.println("--------------------------");

        Owner owner3 = new CompanyOwner();
        CompanyOwner comp2 = (CompanyOwner) owner3;
        System.out.println(comp2);
    }
}

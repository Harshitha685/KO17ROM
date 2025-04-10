package com.xworkz.tasks.owner;

public class OwnerRunner {
    public static void main(String[] args) {
        Owner owner = new Owner();
        owner.ownerName();
        owner.ownerType();

        CompanyOwner companyOwner = new CompanyOwner();
        companyOwner.ownerName();
        companyOwner.ownerType();
    }
}

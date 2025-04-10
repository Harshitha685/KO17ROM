package com.xworkz.tasks.company;

public class CompanyRunner {
    public static void main(String[] args) {
        Company company = new Company();
        company.registerCompany();
        company.displayCompanyInfo();

        ITCompany itCompany = new ITCompany();
        itCompany.registerCompany();
        itCompany.displayCompanyInfo();
    }
}

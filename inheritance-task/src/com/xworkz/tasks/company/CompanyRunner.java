package com.xworkz.tasks.company;

public class CompanyRunner {
    public static void main(String[] args) {
        Company company = new Company();
        company.registerCompany();
        company.displayCompanyInfo();
        company.hireEmployees();
        company.payTaxes();
        company.releaseProduct();

        Company company2 = new ITCompany();
        company2.registerCompany();
        company2.displayCompanyInfo();
        company2.hireEmployees();
        company2.payTaxes();
        company2.releaseProduct();

        ITCompany itCompany = new ITCompany();
        itCompany.developSoftware();
        itCompany.testApplication();
        itCompany.deployProject();
        itCompany.supportClients();
        itCompany.updateTechStack();

        Company company1 = new ITCompany();

        ITCompany itCompany1 =(ITCompany) company1;
        System.out.println(itCompany1);
    }
}

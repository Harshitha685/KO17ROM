package com.xworkz.tasks.insurance;

public class InsuranceRunner {
    public static void main(String[] args) {
        Insurance insurance = new Insurance();
        insurance.activatePolicy();
        insurance.cancelPolicy();
        insurance.calculateTotalPremium();
        insurance.renewPolicy();
        insurance.policyDetails();

        Insurance insurance2 = new LifeInsurance();
        insurance2.activatePolicy();
        insurance2.cancelPolicy();
        insurance2.calculateTotalPremium();
        insurance2.renewPolicy();
        insurance2.policyDetails();

        LifeInsurance lifeInsurance = new LifeInsurance();
        lifeInsurance.generatePolicySummary();
        lifeInsurance.checkMaturityDate();
        lifeInsurance.changeSumAssured();
        lifeInsurance.policyBenefits();
        lifeInsurance.checkPolicyStatus();

        Insurance insurance1 = new LifeInsurance();
        LifeInsurance lifeInsurance1 = (LifeInsurance) insurance1;
        System.out.println(lifeInsurance1);
    }
}

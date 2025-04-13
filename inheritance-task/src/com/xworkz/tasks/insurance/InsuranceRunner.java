package com.xworkz.tasks.insurance;

public class InsuranceRunner {
    public static void main(String[] args) {
        Insurance insurance = new Insurance();
        insurance.activatePolicy();
        insurance.cancelPolicy();

        LifeInsurance lifeInsurance = new LifeInsurance();
        lifeInsurance.activatePolicy();
        lifeInsurance.cancelPolicy();

        Insurance insurance1 = new LifeInsurance();
        LifeInsurance lifeInsurance1 = (LifeInsurance) insurance1;
        System.out.println(lifeInsurance1);
    }
}

package com.xworkz.tasks.insurance;

public class InsuranceRunner {
    public static void main(String[] args) {
        Insurance insurance = new Insurance();
        insurance.activatePolicy();
        insurance.cancelPolicy();

        LifeInsurance lifeInsurance = new LifeInsurance();
        lifeInsurance.activatePolicy();
        lifeInsurance.cancelPolicy();
    }
}

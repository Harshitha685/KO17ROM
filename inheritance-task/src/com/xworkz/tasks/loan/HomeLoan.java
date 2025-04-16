package com.xworkz.tasks.loan;

public class HomeLoan extends Loan {
    public void submitPropertyDocuments() {
        System.out.println("Property documents submitted.");
    }

    public void payProcessingFee() {
        System.out.println("Processing fee paid.");
    }

    public void getEMIDetails() {
        System.out.println("Monthly EMI: ₹18,000");
    }

    public void insuranceCover() {
        System.out.println("Home loan includes property insurance.");
    }

    public void loanTenure() {
        System.out.println("Home loan tenure: Up to 30 years");
    }
}

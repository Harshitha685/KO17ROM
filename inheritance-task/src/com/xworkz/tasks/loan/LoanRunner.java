package com.xworkz.tasks.loan;

public class LoanRunner {
    public static void main(String[] args) {

        Loan loan = new Loan();
        loan.getBankName();
        loan.loanType();
        loan.applyLoan();
        loan.checkEligibility();
        loan.loanTenure();


        Loan loan2 = new HomeLoan();
        loan2.getBankName();
        loan2.loanType();
        loan2.applyLoan();
        loan2.checkEligibility();
        loan2.loanTenure();


        HomeLoan homeLoan = new HomeLoan();
        homeLoan.submitPropertyDocuments();
        homeLoan.payProcessingFee();
        homeLoan.getEMIDetails();
        homeLoan.insuranceCover();
        homeLoan.loanTenure();
    }
}

package com.xworkz.tasks.loan;

public class LoanRunner {
    public static void main(String[] args) {
        Loan loan = new Loan();
        loan.loanType();
        loan.getLoanInfo();

        HomeLoan homeLoan = new HomeLoan();
        homeLoan.loanType();
        homeLoan.getLoanInfo();
    }
}

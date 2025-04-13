package com.xworkz.tasks.loan;

public class LoanRunner {
    public static void main(String[] args) {
        Loan loan = new Loan();
        loan.loanType();
        loan.getLoanInfo();

        HomeLoan homeLoan = new HomeLoan();
        homeLoan.loanType();
        homeLoan.getLoanInfo();

        Loan loan1 = new HomeLoan();

        HomeLoan homeLoan1 = (HomeLoan) loan1;
        System.out.println(loan1);
    }
}

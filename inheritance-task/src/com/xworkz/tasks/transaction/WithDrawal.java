package com.xworkz.tasks.transaction;

public class WithDrawal extends Transaction {
    public void withdrawalAmount() {
        System.out.println("Withdrawal Amount: ₹2000");
    }

    public void withdrawalFee() {
        System.out.println("Withdrawal Fee: ₹50");
    }

    public void isOverLimit() {
        System.out.println("Over Withdrawal Limit: No");
    }

    public void withdrawalAccount() {
        System.out.println("Withdrawal Account: Savings");
    }

    public void withdrawalStatus() {
        System.out.println("Withdrawal Status: Completed");
    }
}

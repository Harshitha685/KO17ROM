package com.xworkz.tasks.payment;

public class UPIPayment extends Payment {
    public void upiId() {
        System.out.println("UPI ID: john@upi");
    }

    public void transactionReference() {
        System.out.println("Transaction Reference: UPI1234567890");
    }

    public void bankName() {
        System.out.println("Bank Name: State Bank of India");
    }

    public void isInstantPayment() {
        System.out.println("Instant Payment: Yes");
    }

    public void paymentApp() {
        System.out.println("Payment App: Google Pay");
    }
}

package com.xworkz.tasks.payment;

public class PaymentRunner {
    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.processPayment();
        payment.cancelPayment();

        UPIPayment upiPayment = new UPIPayment();
        upiPayment.processPayment();
        upiPayment.cancelPayment();

        Payment payment1 = new UPIPayment();

        UPIPayment upiPayment1 = (UPIPayment) payment1;
        System.out.println(upiPayment1);
    }
}

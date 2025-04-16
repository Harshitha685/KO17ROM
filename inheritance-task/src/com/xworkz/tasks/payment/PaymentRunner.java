package com.xworkz.tasks.payment;

public class PaymentRunner {
    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.paymentType();
        payment.amount();
        payment.transactionDate();
        payment.paymentStatus();
        payment.paymentMethod();

        System.out.println("--------------------------");

        Payment payment2 = new UPIPayment();
        payment2.paymentType();
        payment2.amount();
        payment2.transactionDate();
        payment2.paymentStatus();
        payment2.paymentMethod();

        System.out.println("--------------------------");

        UPIPayment upiPayment = new UPIPayment();
        upiPayment.upiId();
        upiPayment.transactionReference();
        upiPayment.bankName();
        upiPayment.isInstantPayment();
        upiPayment.paymentApp();

        System.out.println("--------------------------");

        Payment payment3 = new UPIPayment();
        UPIPayment upiPayment2 = (UPIPayment) payment3;
        System.out.println(upiPayment2);
    }
}

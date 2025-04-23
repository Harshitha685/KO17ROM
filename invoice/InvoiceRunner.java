package com.xworkz.objectmethodtask.invoice;

public class InvoiceRunner {

        public static void main(String[] args) {

            InvoiceDto invoice = new InvoiceDto();

            invoice.setInvoiceNumber("INV12345");
            invoice.setCustomerName("Harshitha");
            invoice.setTotalAmount(3500.75);
            invoice.setIssueDate("2025-04-22");
            invoice.setPaid(true);

            System.out.println(invoice);
        }
    }



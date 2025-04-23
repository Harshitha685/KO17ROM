package com.xworkz.objectmethodtask.invoice;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InvoiceDto {

    private String invoiceNumber;
    private String customerName;
    private double totalAmount;
    private String issueDate;
    private boolean isPaid;

    @Override
    public String toString() {
        return "InvoiceDto = (" +
                "invoiceNumber = " + this.invoiceNumber + "," +
                "\ncustomerName = " + this.customerName + "," +
                "\ntotalAmount = ₹" + this.totalAmount + "," +
                "\nissueDate = " + this.issueDate + "," +
                "\nisPaid = " + this.isPaid + ")";
    }
}



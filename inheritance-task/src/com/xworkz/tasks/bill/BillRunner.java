package com.xworkz.tasks.bill;

import com.xworkz.tasks.bill.Bill;
import com.xworkz.tasks.bill.*;

public class BillRunner {

    public static void main(String[] args) {
        Bill bill = new Bill();
        bill.generateBill();
        bill.isPaid();
        bill.updateAmount();
        bill.markAsPaid();
        bill.setCustomerDetails();

        Bill bill2 = new ElectricityBill();
        bill2.generateBill();
        bill2.isPaid();
        bill2.updateAmount();
        bill2.markAsPaid();
        bill2.setCustomerDetails();

        ElectricityBill electricityBill = new ElectricityBill();
        electricityBill.setElectricityDetails();
        electricityBill.calculateAmount();
        electricityBill.showElectricityBill();
        electricityBill.checkHighUsage();
        electricityBill.suggestSavingTips();

        Bill bill1 = new ElectricityBill();

        ElectricityBill electricityBill1 = (ElectricityBill) bill1;
        System.out.println(electricityBill1);
    }
}

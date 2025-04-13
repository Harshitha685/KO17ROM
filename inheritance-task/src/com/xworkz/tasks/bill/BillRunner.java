package com.xworkz.tasks.bill;

import com.xworkz.tasks.level.Easy;

public class BillRunner {

    public static void main(String[] args) {
        Bill bill = new Bill();
        bill.generateBill();
        bill.isPaid();

        ElectricityBill electricityBill = new ElectricityBill();
        electricityBill.generateBill();
        electricityBill.isPaid();

        Bill bill1 = new ElectricityBill();

        ElectricityBill electricityBill1 = (ElectricityBill) bill1;
        System.out.println(electricityBill1);
    }
}

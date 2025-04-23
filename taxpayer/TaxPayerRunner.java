package com.xworkz.objectmethodtask.taxpayer;

public class TaxPayerRunner {

        public static void main(String[] args) {

            TaxPayerDto taxpayer = new TaxPayerDto();

            taxpayer.setName("Preethi");
            taxpayer.setPanNumber("ABCDE1234F");
            taxpayer.setAnnualIncome(650000.00);
            taxpayer.setOccupation("Software Engineer");
            taxpayer.setTaxFiled(true);

            System.out.println(taxpayer);
        }
    }



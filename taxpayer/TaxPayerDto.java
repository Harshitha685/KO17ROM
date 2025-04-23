package com.xworkz.objectmethodtask.taxpayer;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaxPayerDto {

    private String name;
    private String panNumber;
    private double annualIncome;
    private String occupation;
    private boolean isTaxFiled;

    @Override
    public String toString() {
        return "TaxPayerDto = (" +
                "name = " + this.name + "," +
                "\npanNumber = " + this.panNumber + "," +
                "\nannualIncome = ₹" + this.annualIncome + "," +
                "\noccupation = " + this.occupation + "," +
                "\nisTaxFiled = " + this.isTaxFiled + ")";
    }
}



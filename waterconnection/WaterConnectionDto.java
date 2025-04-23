package com.xworkz.objectmethodtask.waterconnection;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WaterConnectionDto {

    private String customerName;
    private String connectionNumber;
    private String area;
    private double monthlyUsage;
    private boolean isPaymentMade;

    @Override
    public String toString() {
        return "WaterConnectionDto = (" +
                "customerName = " + this.customerName + "," +
                "\nconnectionNumber = " + this.connectionNumber + "," +
                "\narea = " + this.area + "," +
                "\nmonthlyUsage = " + this.monthlyUsage + " Liters," +
                "\nisPaymentMade = " + this.isPaymentMade + ")";
    }
}



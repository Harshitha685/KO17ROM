package com.xworkz.objectmethodtask.techproduct;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TechProductDto {

    private String productName;
    private String brand;
    private double price;
    private String releaseDate;
    private boolean isAvailable;

    @Override
    public String toString() {
        return "TechProductDto = (" +
                "productName = " + this.productName + "," +
                "\nbrand = " + this.brand + "," +
                "\nprice = ₹" + this.price + "," +
                "\nreleaseDate = " + this.releaseDate + "," +
                "\nisAvailable = " + this.isAvailable + ")";
    }
}



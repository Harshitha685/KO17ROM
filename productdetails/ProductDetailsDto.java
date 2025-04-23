package com.xworkz.objectmethodtask.productdetails;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDetailsDto {

    private String productName;
    private String productCode;
    private double price;
    private int stockQuantity;
    private String category;

    @Override
    public String toString() {
        return "ProductDetailsDto = (" +
                "productName = " + this.productName + "," +
                "\nproductCode = " + this.productCode + "," +
                "\nprice = ₹" + this.price + "," +
                "\nstockQuantity = " + this.stockQuantity + "," +
                "\ncategory = " + this.category + ")";
    }
}



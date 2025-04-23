package com.xworkz.objectmethodtask.discount;



import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DiscountDto {

    private String discountCode;
    private double discountPercentage;
    private String validTill;
    private boolean isActive;
    private String applicableProducts;

    @Override
    public String toString() {
        return "DiscountDto = (" +
                "discountCode = " + this.discountCode + "," +
                "\ndiscountPercentage = " + this.discountPercentage + "%," +
                "\nvalidTill = " + this.validTill + "," +
                "\nisActive = " + this.isActive + "," +
                "\napplicableProducts = " + this.applicableProducts + ")";
    }
}



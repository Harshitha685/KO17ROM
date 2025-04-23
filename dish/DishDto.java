package com.xworkz.objectmethodtask.dish;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DishDto {

    private String dishName;
    private String cuisine;
    private double price;
    private boolean isVegetarian;
    private int preparationTime;

    @Override
    public String toString() {
        return "DishDto = (" +
                "dishName = " + this.dishName + "," +
                "\ncuisine = " + this.cuisine + "," +
                "\nprice = ₹" + this.price + "," +
                "\nisVegetarian = " + this.isVegetarian + "," +
                "\npreparationTime = " + this.preparationTime + " minutes)";
    }
}



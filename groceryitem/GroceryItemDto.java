package com.xworkz.objectmethodtask.groceryitem;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GroceryItemDto {

    private String itemName;
    private double price;
    private int quantity;
    private String category;
    private boolean isOrganic;

    @Override
    public String toString() {
        return "GroceryItemDto = (" +
                "itemName = " + this.itemName + "," +
                "\nprice = ₹" + this.price + "," +
                "\nquantity = " + this.quantity + "," +
                "\ncategory = " + this.category + "," +
                "\nisOrganic = " + this.isOrganic + ")";
    }
}



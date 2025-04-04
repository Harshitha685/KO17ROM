package com.dmart.supermarketapp.product;

import com.dmart.supermarketapp.section.Sections;

public class Products {
    public String productName;
    public double price;
    public int quantity;
    public String ingredients[];

    public void displayProductsInfo(){
        System.out.println("Product name is : " +productName);
        System.out.println("Product price is : " +price);
        System.out.println("Quantity of the product : " +quantity);
        for(String ingredient:ingredients){
            System.out.println(ingredient);
        }
    }


}

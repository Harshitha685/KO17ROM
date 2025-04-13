package com.xworkz.tasks.beautyproducts;

public class BeautyProductsRunner {
    public static void main(String[] args) {
        BeautyProducts beautyProducts = new BeautyProducts();
        beautyProducts.checkAvailability();
        beautyProducts.type();

        Cream cream = new Cream();
        cream.checkAvailability();
        cream.type();

        BeautyProducts beautyProducts1 = new Cream();

        Cream cream1 = (Cream) beautyProducts1;
        System.out.println(cream1);
    }
}

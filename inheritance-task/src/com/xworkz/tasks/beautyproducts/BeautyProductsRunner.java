package com.xworkz.tasks.beautyproducts;

public class BeautyProductsRunner {
    public static void main(String[] args) {
        BeautyProducts beautyProducts = new BeautyProducts();
        beautyProducts.checkAvailability();
        beautyProducts.type();

        Cream cream = new Cream();
        cream.checkAvailability();
        cream.type();
    }
}

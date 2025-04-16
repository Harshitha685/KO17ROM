package com.xworkz.tasks.beautyproducts;

public class BeautyProductsRunner {
    public static void main(String[] args) {
        BeautyProducts beautyProducts = new BeautyProducts();
        beautyProducts.checkAvailability();
        beautyProducts.type();
        beautyProducts.apply();
        beautyProducts.checkExpiry();
        beautyProducts.displayBrand();

        BeautyProducts beautyProducts2 = new Cream();
        beautyProducts2.checkAvailability();
        beautyProducts2.type();
        beautyProducts2.apply();
        beautyProducts2.checkExpiry();
        beautyProducts2.displayBrand();

       Cream cream = new Cream();
       cream.applyToSkin();
       cream.checkSPF();
       cream.hydrateSkin();;
       cream.showUsageInstructions();
       cream.fragrance();
        BeautyProducts beautyProducts1 = new Cream();

        Cream cream1 = (Cream) beautyProducts1;
        System.out.println(cream1);
    }
}

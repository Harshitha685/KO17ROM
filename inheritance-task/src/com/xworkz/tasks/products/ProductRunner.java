package com.xworkz.tasks.products;

public class ProductRunner {
    public static void main(String[] args) {
        Products product = new Products();
        product.productName();
        product.productCategory();
        product.productPrice();
        product.productBrand();
        product.warranty();

        System.out.println("--------------------------");

        Products product2 = new Electronics();
        product2.productName();
        product2.productCategory();
        product2.productPrice();
        product2.productBrand();
        product2.warranty();

        System.out.println("--------------------------");

        Electronics electronic = new Electronics();
        electronic.electronicType();
        electronic.batteryLife();
        electronic.screenSize();
        electronic.operatingSystem();
        electronic.isTouchScreen();

        System.out.println("--------------------------");

        Products product3 = new Electronics();
        Electronics electronic2 = (Electronics) product3;
        System.out.println(electronic2);
    }
}

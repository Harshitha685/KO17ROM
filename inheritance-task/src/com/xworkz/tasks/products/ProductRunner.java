package com.xworkz.tasks.products;

public class ProductRunner {
    public static void main(String[] args) {
        Products products = new Products();
        products.setProductName();
        products.getProductName();

        Electronics electronics = new Electronics();
        electronics.setProductName();
        electronics.getProductName();

        Products products1 = new Electronics();

        Electronics electronics1 = (Electronics) products1;
        System.out.println(electronics1);
    }
}

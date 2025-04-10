package com.xworkz.tasks.menuitem;

public class MenuRunner {
    public static void main(String[] args) {
        MenuItem menuItem = new MenuItem();
        menuItem.applyDiscount();
        menuItem.markInStock();

        Desserts desserts = new Desserts();
        desserts.applyDiscount();
        desserts.markInStock();
    }
}

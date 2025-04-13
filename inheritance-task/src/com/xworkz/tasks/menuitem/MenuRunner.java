package com.xworkz.tasks.menuitem;

import sun.security.krb5.internal.crypto.Des;

public class MenuRunner {
    public static void main(String[] args) {
        MenuItem menuItem = new MenuItem();
        menuItem.applyDiscount();
        menuItem.markInStock();

        Desserts desserts = new Desserts();
        desserts.applyDiscount();
        desserts.markInStock();

        MenuItem menuItem1 = new Desserts();

        Desserts desserts1 = (Desserts) menuItem1;
        System.out.println(desserts1);
    }
}

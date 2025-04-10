package com.xworkz.tasks.shopping;

public class ShoppingRunner {
    public static void main(String[] args) {
        Shopping shopping = new Shopping();
        shopping.addItemToCart();
        shopping.removeItemFromCart();

        OnlineShopping onlineShopping = new OnlineShopping();
        onlineShopping.addItemToCart();
        onlineShopping.removeItemFromCart();
    }
}

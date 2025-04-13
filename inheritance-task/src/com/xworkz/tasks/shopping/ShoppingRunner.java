package com.xworkz.tasks.shopping;

public class ShoppingRunner {
    public static void main(String[] args) {
        Shopping shopping = new Shopping();
        shopping.addItemToCart();
        shopping.removeItemFromCart();

        OnlineShopping onlineShopping = new OnlineShopping();
        onlineShopping.addItemToCart();
        onlineShopping.removeItemFromCart();

        Shopping shopping1  = new OnlineShopping();

        OnlineShopping onlineShopping1 = (OnlineShopping) shopping1;
        System.out.println(onlineShopping1);
    }
}

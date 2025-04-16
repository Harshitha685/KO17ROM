package com.xworkz.tasks.shopping;

public class ShoppingRunner {
    public static void main(String[] args) {
        Shopping shopping = new Shopping();
        shopping.shoppingType();
        shopping.storeName();
        shopping.itemPurchased();
        shopping.totalAmount();
        shopping.paymentMethod();

        System.out.println("--------------------------");

        Shopping shopping2 = new OnlineShopping();
        shopping2.shoppingType();
        shopping2.storeName();
        shopping2.itemPurchased();
        shopping2.totalAmount();
        shopping2.paymentMethod();

        System.out.println("--------------------------");

        OnlineShopping onlineShopping = new OnlineShopping();
        onlineShopping.websiteName();
        onlineShopping.deliveryTime();
        onlineShopping.paymentStatus();
        onlineShopping.discountApplied();
        onlineShopping.shippingFee();

        System.out.println("--------------------------");

        Shopping shopping3 = new OnlineShopping();
        OnlineShopping onlineShopping2 = (OnlineShopping) shopping3;
        System.out.println(onlineShopping2);
    }
}

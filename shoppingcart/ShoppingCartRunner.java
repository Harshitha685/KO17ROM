package com.xworkz.objectmethodtask.shoppingcart;

public class ShoppingCartRunner {

        public static void main(String[] args) {

            ShoppingCartDto cart = new ShoppingCartDto();

            cart.setCustomerName("Harshitha");
            cart.setTotalItems(5);
            cart.setTotalPrice(2499.99);
            cart.setCheckoutComplete(true);
            cart.setPaymentMode("Credit Card");

            System.out.println(cart);
        }
    }



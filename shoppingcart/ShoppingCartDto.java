package com.xworkz.objectmethodtask.shoppingcart;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ShoppingCartDto {
    private String customerName;
    private int totalItems;
    private double totalPrice;
    private boolean isCheckoutComplete;
    private String paymentMode;


        @Override
        public String toString() {
            return "ShoppingCartDto = (" +
                    "customerName = " + this.customerName + "," +
                    "\ntotalItems = " + this.totalItems + "," +
                    "\ntotalPrice = " + this.totalPrice + "," +
                    "\nisCheckoutComplete = " + this.isCheckoutComplete + "," +
                    "\npaymentMode = " + this.paymentMode + ")";
        }
    }



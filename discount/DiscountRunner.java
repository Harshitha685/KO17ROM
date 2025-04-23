package com.xworkz.objectmethodtask.discount;

public class DiscountRunner {

        public static void main(String[] args) {

            DiscountDto discount = new DiscountDto();

            discount.setDiscountCode("SUMMER21");
            discount.setDiscountPercentage(15.5);
            discount.setValidTill("2021-08-31");
            discount.setActive(true);
            discount.setApplicableProducts("Clothing, Electronics");

            System.out.println(discount);
        }
    }



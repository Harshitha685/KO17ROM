package com.xworkz.objectmethodtask.groceryitem;

public class GroceryItemRunner {

        public static void main(String[] args) {

            GroceryItemDto item = new GroceryItemDto();

            item.setItemName("Organic Apples");
            item.setPrice(120.50);
            item.setQuantity(3);
            item.setCategory("Fruits");
            item.setOrganic(true);

            System.out.println(item);
        }
    }



package com.xworkz.objectmethodtask.productdetails;

public class ProductDetailsRunner {

        public static void main(String[] args) {

            ProductDetailsDto product = new ProductDetailsDto();

            product.setProductName("Smartphone");
            product.setProductCode("SP12345");
            product.setPrice(24999.99);
            product.setStockQuantity(50);
            product.setCategory("Electronics");

            System.out.println(product);
        }
    }



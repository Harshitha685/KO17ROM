package com.xworkz.objectmethodtask.techproduct;

public class TechProductRunner {
        public static void main(String[] args) {

            TechProductDto product = new TechProductDto();

            product.setProductName("Smartphone");
            product.setBrand("Samsung");
            product.setPrice(39999.99);
            product.setReleaseDate("2025-03-15");
            product.setAvailable(true);

            System.out.println(product);
        }
    }



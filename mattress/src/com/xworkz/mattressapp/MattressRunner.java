package com.xworkz.mattressapp;

import com.xworkz.mattressapp.mattress.Mattress;

public class MattressRunner {

        public static void main(String[] args) {
            Mattress ref1 = new Mattress();
            ref1.setBrand("SleepWell");
            ref1.setSize("Queen");
            ref1.setThickness(6.0);
            ref1.setMaterialType("Memory Foam");
            ref1.setIsOrthopedic(true);
            ref1.setWeight(12.5);
            ref1.setPrice(8499.99);

            String brand1 = ref1.getBrand();
            String size1 = ref1.getSize();
            double thickness1 = ref1.getThickness();
            String material1 = ref1.getMaterialType();
            boolean ortho1 = ref1.getIsOrthopedic();
            double weight1 = ref1.getWeight();
            double price1 = ref1.getPrice();

            System.out.println("Mattress Brand       : " + brand1);
            System.out.println("Size                 : " + size1);
            System.out.println("Thickness            : " + thickness1 + " inches");
            System.out.println("Material Type        : " + material1);
            System.out.println("Is Orthopedic        : " + ortho1);
            System.out.println("Weight               : " + weight1 + " kg");
            System.out.println("Price                : ₹" + price1);
            System.out.println();

            Mattress ref2 = new Mattress();
            ref2.setBrand("Wakefit");
            ref2.setSize("King");
            ref2.setThickness(8.0);
            ref2.setMaterialType("Latex");
            ref2.setIsOrthopedic(false);
            ref2.setWeight(14.0);
            ref2.setPrice(10999.00);

            String brand2 = ref2.getBrand();
            String size2 = ref2.getSize();
            double thickness2 = ref2.getThickness();
            String material2 = ref2.getMaterialType();
            boolean ortho2 = ref2.getIsOrthopedic();
            double weight2 = ref2.getWeight();
            double price2 = ref2.getPrice();

            System.out.println("Mattress Brand       : " + brand2);
            System.out.println("Size                 : " + size2);
            System.out.println("Thickness            : " + thickness2 + " inches");
            System.out.println("Material Type        : " + material2);
            System.out.println("Is Orthopedic        : " + ortho2);
            System.out.println("Weight               : " + weight2 + " kg");
            System.out.println("Price                : ₹" + price2);
            System.out.println();

            Mattress ref3 = new Mattress();
            ref3.setBrand("Duroflex");
            ref3.setSize("Single");
            ref3.setThickness(5.0);
            ref3.setMaterialType("PU Foam");
            ref3.setIsOrthopedic(true);
            ref3.setWeight(9.2);
            ref3.setPrice(5499.50);

            String brand3 = ref3.getBrand();
            String size3 = ref3.getSize();
            double thickness3 = ref3.getThickness();
            String material3 = ref3.getMaterialType();
            boolean ortho3 = ref3.getIsOrthopedic();
            double weight3 = ref3.getWeight();
            double price3 = ref3.getPrice();

            System.out.println("Mattress Brand       : " + brand3);
            System.out.println("Size                 : " + size3);
            System.out.println("Thickness            : " + thickness3 + " inches");
            System.out.println("Material Type        : " + material3);
            System.out.println("Is Orthopedic        : " + ortho3);
            System.out.println("Weight               : " + weight3 + " kg");
            System.out.println("Price                : ₹" + price3);
            System.out.println();

            Mattress ref4 = new Mattress();
            ref4.setBrand("Peps");
            ref4.setSize("Double");
            ref4.setThickness(4.5);
            ref4.setMaterialType("Spring");
            ref4.setIsOrthopedic(false);
            ref4.setWeight(11.0);
            ref4.setPrice(6499.99);

            String brand4 = ref4.getBrand();
            String size4 = ref4.getSize();
            double thickness4 = ref4.getThickness();
            String material4 = ref4.getMaterialType();
            boolean ortho4 = ref4.getIsOrthopedic();
            double weight4 = ref4.getWeight();
            double price4 = ref4.getPrice();

            System.out.println("Mattress Brand       : " + brand4);
            System.out.println("Size                 : " + size4);
            System.out.println("Thickness            : " + thickness4 + " inches");
            System.out.println("Material Type        : " + material4);
            System.out.println("Is Orthopedic        : " + ortho4);
            System.out.println("Weight               : " + weight4 + " kg");
            System.out.println("Price                : ₹" + price4);
            System.out.println();

            Mattress ref5 = new Mattress();
            ref5.setBrand("Kurlon");
            ref5.setSize("King");
            ref5.setThickness(10.0);
            ref5.setMaterialType("Coir");
            ref5.setIsOrthopedic(true);
            ref5.setWeight(15.3);
            ref5.setPrice(12499.00);

            String brand5 = ref5.getBrand();
            String size5 = ref5.getSize();
            double thickness5 = ref5.getThickness();
            String material5 = ref5.getMaterialType();
            boolean ortho5 = ref5.getIsOrthopedic();
            double weight5 = ref5.getWeight();
            double price5 = ref5.getPrice();

            System.out.println("Mattress Brand       : " + brand5);
            System.out.println("Size                 : " + size5);
            System.out.println("Thickness            : " + thickness5 + " inches");
            System.out.println("Material Type        : " + material5);
            System.out.println("Is Orthopedic        : " + ortho5);
            System.out.println("Weight               : " + weight5 + " kg");
            System.out.println("Price                : ₹" + price5);
            System.out.println();
        }
    }




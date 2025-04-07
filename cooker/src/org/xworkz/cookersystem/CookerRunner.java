package org.xworkz.cookersystem;

import org.xworkz.cookersystem.cooker.Cooker;

public class CookerRunner {

        public static void main(String[] args) {

            Cooker ref1 = new Cooker();
            ref1.setBrand("Prestige");
            ref1.setCapacityInLiters(5);
            ref1.setMaterial("Aluminium");
            ref1.setIsElectric(false);
            ref1.setLidType("Inner Lid");
            ref1.setPrice(1800.00);
            ref1.setColor("Silver");

            String brand1 = ref1.getBrand();
            int capacity1 = ref1.getCapacityInLiters();
            String material1 = ref1.getMaterial();
            boolean electric1 = ref1.getIsElectric();
            String lidType1 = ref1.getLidType();
            double price1 = ref1.getPrice();
            String color1 = ref1.getColor();

            System.out.println("Cooker Brand         : " + brand1);
            System.out.println("Capacity (Ltrs)      : " + capacity1);
            System.out.println("Material             : " + material1);
            System.out.println("Is Electric          : " + electric1);
            System.out.println("Lid Type             : " + lidType1);
            System.out.println("Price (₹)            : " + price1);
            System.out.println("Color                : " + color1);
            System.out.println("--------------------------------");

            Cooker ref2 = new Cooker();
            ref2.setBrand("Butterfly");
            ref2.setCapacityInLiters(3);
            ref2.setMaterial("Hard Anodized");
            ref2.setIsElectric(false);
            ref2.setLidType("Outer Lid");
            ref2.setPrice(1550.00);
            ref2.setColor("Black");

            String brand2 = ref2.getBrand();
            int capacity2 = ref2.getCapacityInLiters();
            String material2 = ref2.getMaterial();
            boolean electric2 = ref2.getIsElectric();
            String lidType2 = ref2.getLidType();
            double price2 = ref2.getPrice();
            String color2 = ref2.getColor();

            System.out.println("Cooker Brand         : " + brand2);
            System.out.println("Capacity (Ltrs)      : " + capacity2);
            System.out.println("Material             : " + material2);
            System.out.println("Is Electric          : " + electric2);
            System.out.println("Lid Type             : " + lidType2);
            System.out.println("Price (₹)            : " + price2);
            System.out.println("Color                : " + color2);
            System.out.println();

            Cooker ref3 = new Cooker();
            ref3.setBrand("Pigeon");
            ref3.setCapacityInLiters(4);
            ref3.setMaterial("Stainless Steel");
            ref3.setIsElectric(false);
            ref3.setLidType("Outer Lid");
            ref3.setPrice(1699.00);
            ref3.setColor("Grey");

            String brand3 = ref3.getBrand();
            int capacity3 = ref3.getCapacityInLiters();
            String material3 = ref3.getMaterial();
            boolean electric3 = ref3.getIsElectric();
            String lidType3 = ref3.getLidType();
            double price3 = ref3.getPrice();
            String color3 = ref3.getColor();

            System.out.println("Cooker Brand         : " + brand3);
            System.out.println("Capacity (Ltrs)      : " + capacity3);
            System.out.println("Material             : " + material3);
            System.out.println("Is Electric          : " + electric3);
            System.out.println("Lid Type             : " + lidType3);
            System.out.println("Price (₹)            : " + price3);
            System.out.println("Color                : " + color3);
            System.out.println();

            Cooker ref4 = new Cooker();
            ref4.setBrand("Hawkins");
            ref4.setCapacityInLiters(6);
            ref4.setMaterial("Aluminium");
            ref4.setIsElectric(false);
            ref4.setLidType("Inner Lid");
            ref4.setPrice(2100.00);
            ref4.setColor("Red");

            String brand4 = ref4.getBrand();
            int capacity4 = ref4.getCapacityInLiters();
            String material4 = ref4.getMaterial();
            boolean electric4 = ref4.getIsElectric();
            String lidType4 = ref4.getLidType();
            double price4 = ref4.getPrice();
            String color4 = ref4.getColor();

            System.out.println("Cooker Brand         : " + brand4);
            System.out.println("Capacity (Ltrs)      : " + capacity4);
            System.out.println("Material             : " + material4);
            System.out.println("Is Electric          : " + electric4);
            System.out.println("Lid Type             : " + lidType4);
            System.out.println("Price (₹)            : " + price4);
            System.out.println("Color                : " + color4);
            System.out.println();

            Cooker ref5 = new Cooker();
            ref5.setBrand("Usha");
            ref5.setCapacityInLiters(6);
            ref5.setMaterial("Stainless Steel");
            ref5.setIsElectric(true);
            ref5.setLidType("Outer Lid");
            ref5.setPrice(2450.00);
            ref5.setColor("Rose Gold");

            String brand5 = ref5.getBrand();
            int capacity5 = ref5.getCapacityInLiters();
            String material5 = ref5.getMaterial();
            boolean electric5 = ref5.getIsElectric();
            String lidType5 = ref5.getLidType();
            double price5 = ref5.getPrice();
            String color5 = ref5.getColor();

            System.out.println("Cooker Brand         : " + brand5);
            System.out.println("Capacity (Ltrs)      : " + capacity5);
            System.out.println("Material             : " + material5);
            System.out.println("Is Electric          : " + electric5);
            System.out.println("Lid Type             : " + lidType5);
            System.out.println("Price (₹)            : " + price5);
            System.out.println("Color                : " + color5);
        }
    }





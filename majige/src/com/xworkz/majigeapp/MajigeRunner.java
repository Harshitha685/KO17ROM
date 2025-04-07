package com.xworkz.majigeapp;

import com.xworkz.majigeapp.majige.Majige;

public class MajigeRunner {

        public static void main(String[] args) {
            Majige ref1 = new Majige();
            ref1.setBrand("Namma Majjige");
            ref1.setOriginVillage("Mandya");
            ref1.setContainerType("Bottle");
            ref1.setVolume(1.0);
            ref1.setIsSalted(true);
            ref1.setPrice(25.50);
            ref1.setColor("White");

            String brand1 = ref1.getBrand();
            String village1 = ref1.getOriginVillage();
            String container1 = ref1.getContainerType();
            double volume1 = ref1.getVolume();
            boolean salted1 = ref1.getIsSalted();
            double price1 = ref1.getPrice();
            String color1 = ref1.getColor();

            System.out.println("Majige Brand       : " + brand1);
            System.out.println("Origin Village     : " + village1);
            System.out.println("Container Type     : " + container1);
            System.out.println("Volume             : " + volume1 + " L");
            System.out.println("Is Salted          : " + salted1);
            System.out.println("Price              : ₹" + price1);
            System.out.println("Color              : " + color1);
            System.out.println();

            Majige ref2 = new Majige();
            ref2.setBrand("Cool Buttermilk");
            ref2.setOriginVillage("Hassan");
            ref2.setContainerType("Tetra Pack");
            ref2.setVolume(0.5);
            ref2.setIsSalted(false);
            ref2.setPrice(18.75);
            ref2.setColor("Off White");

            String brand2 = ref2.getBrand();
            String village2 = ref2.getOriginVillage();
            String container2 = ref2.getContainerType();
            double volume2 = ref2.getVolume();
            boolean salted2 = ref2.getIsSalted();
            double price2 = ref2.getPrice();
            String color2 = ref2.getColor();

            System.out.println("Majige Brand       : " + brand2);
            System.out.println("Origin Village     : " + village2);
            System.out.println("Container Type     : " + container2);
            System.out.println("Volume             : " + volume2 + " L");
            System.out.println("Is Salted          : " + salted2);
            System.out.println("Price              : ₹" + price2);
            System.out.println("Color              : " + color2);
            System.out.println();

            Majige ref3 = new Majige();
            ref3.setBrand("Swad Majige");
            ref3.setOriginVillage("Channarayapatna");
            ref3.setContainerType("Can");
            ref3.setVolume(1.5);
            ref3.setIsSalted(true);
            ref3.setPrice(32.00);
            ref3.setColor("Cream");

            String brand3 = ref3.getBrand();
            String village3 = ref3.getOriginVillage();
            String container3 = ref3.getContainerType();
            double volume3 = ref3.getVolume();
            boolean salted3 = ref3.getIsSalted();
            double price3 = ref3.getPrice();
            String color3 = ref3.getColor();

            System.out.println("Majige Brand       : " + brand3);
            System.out.println("Origin Village     : " + village3);
            System.out.println("Container Type     : " + container3);
            System.out.println("Volume             : " + volume3 + " L");
            System.out.println("Is Salted          : " + salted3);
            System.out.println("Price              : ₹" + price3);
            System.out.println("Color              : " + color3);
            System.out.println();

            Majige ref4 = new Majige();
            ref4.setBrand("Natural Majjige");
            ref4.setOriginVillage("Tumkur");
            ref4.setContainerType("Glass Bottle");
            ref4.setVolume(0.75);
            ref4.setIsSalted(false);
            ref4.setPrice(22.50);
            ref4.setColor("Milky White");

            String brand4 = ref4.getBrand();
            String village4 = ref4.getOriginVillage();
            String container4 = ref4.getContainerType();
            double volume4 = ref4.getVolume();
            boolean salted4 = ref4.getIsSalted();
            double price4 = ref4.getPrice();
            String color4 = ref4.getColor();

            System.out.println("Majige Brand       : " + brand4);
            System.out.println("Origin Village     : " + village4);
            System.out.println("Container Type     : " + container4);
            System.out.println("Volume             : " + volume4 + " L");
            System.out.println("Is Salted          : " + salted4);
            System.out.println("Price              : ₹" + price4);
            System.out.println("Color              : " + color4);
            System.out.println();

            Majige ref5 = new Majige();
            ref5.setBrand("Farm Fresh");
            ref5.setOriginVillage("Udupi");
            ref5.setContainerType("Clay Pot");
            ref5.setVolume(2.0);
            ref5.setIsSalted(true);
            ref5.setPrice(40.00);
            ref5.setColor("White");

            String brand5 = ref5.getBrand();
            String village5 = ref5.getOriginVillage();
            String container5 = ref5.getContainerType();
            double volume5 = ref5.getVolume();
            boolean salted5 = ref5.getIsSalted();
            double price5 = ref5.getPrice();
            String color5 = ref5.getColor();

            System.out.println("Majige Brand       : " + brand5);
            System.out.println("Origin Village     : " + village5);
            System.out.println("Container Type     : " + container5);
            System.out.println("Volume             : " + volume5 + " L");
            System.out.println("Is Salted          : " + salted5);
            System.out.println("Price              : ₹" + price5);
            System.out.println("Color              : " + color5);
            System.out.println();
        }



}

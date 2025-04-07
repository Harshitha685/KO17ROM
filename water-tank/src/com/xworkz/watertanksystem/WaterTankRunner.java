package com.xworkz.watertanksystem;

import com.xworkz.watertanksystem.watertank.WaterTank;

public class WaterTankRunner {

        public static void main(String[] args) {
            WaterTank ref1 = new WaterTank();
            ref1.setBrand("Sintex");
            ref1.setCapacity(500);
            ref1.setMaterial("Plastic");
            ref1.setColor("Black");
            ref1.setHeight(4.2);
            ref1.setIsInsulated(true);
            ref1.setPrice(2800.00);

            String brand1 = ref1.getBrand();
            int capacity1 = ref1.getCapacity();
            String material1 = ref1.getMaterial();
            String color1 = ref1.getColor();
            double height1 = ref1.getHeight();
            boolean insulated1 = ref1.getIsInsulated();
            double price1 = ref1.getPrice();

            System.out.println("Brand: " + brand1);
            System.out.println("Capacity: " + capacity1 + " liters");
            System.out.println("Material: " + material1);
            System.out.println("Color: " + color1);
            System.out.println("Height: " + height1 + " feet");
            System.out.println("Insulated: " + insulated1);
            System.out.println("Price: ₹" + price1);
            System.out.println();

            WaterTank ref2 = new WaterTank();
            ref2.setBrand("Plasto");
            ref2.setCapacity(1000);
            ref2.setMaterial("HDPE");
            ref2.setColor("White");
            ref2.setHeight(5.5);
            ref2.setIsInsulated(false);
            ref2.setPrice(4200.00);

            String brand2 = ref2.getBrand();
            int capacity2 = ref2.getCapacity();
            String material2 = ref2.getMaterial();
            String color2 = ref2.getColor();
            double height2 = ref2.getHeight();
            boolean insulated2 = ref2.getIsInsulated();
            double price2 = ref2.getPrice();

            System.out.println("Brand: " + brand2);
            System.out.println("Capacity: " + capacity2 + " liters");
            System.out.println("Material: " + material2);
            System.out.println("Color: " + color2);
            System.out.println("Height: " + height2 + " feet");
            System.out.println("Insulated: " + insulated2);
            System.out.println("Price: ₹" + price2);
            System.out.println();

            WaterTank ref3 = new WaterTank();
            ref3.setBrand("Supreme");
            ref3.setCapacity(750);
            ref3.setMaterial("PVC");
            ref3.setColor("Blue");
            ref3.setHeight(4.8);
            ref3.setIsInsulated(true);
            ref3.setPrice(3600.00);

            String brand3 = ref3.getBrand();
            int capacity3 = ref3.getCapacity();
            String material3 = ref3.getMaterial();
            String color3 = ref3.getColor();
            double height3 = ref3.getHeight();
            boolean insulated3 = ref3.getIsInsulated();
            double price3 = ref3.getPrice();

            System.out.println("Brand: " + brand3);
            System.out.println("Capacity: " + capacity3 + " liters");
            System.out.println("Material: " + material3);
            System.out.println("Color: " + color3);
            System.out.println("Height: " + height3 + " feet");
            System.out.println("Insulated: " + insulated3);
            System.out.println("Price: ₹" + price3);
            System.out.println();

            WaterTank ref4 = new WaterTank();
            ref4.setBrand("Penguin");
            ref4.setCapacity(1500);
            ref4.setMaterial("LLDPE");
            ref4.setColor("Green");
            ref4.setHeight(6.0);
            ref4.setIsInsulated(false);
            ref4.setPrice(5300.00);

            String brand4 = ref4.getBrand();
            int capacity4 = ref4.getCapacity();
            String material4 = ref4.getMaterial();
            String color4 = ref4.getColor();
            double height4 = ref4.getHeight();
            boolean insulated4 = ref4.getIsInsulated();
            double price4 = ref4.getPrice();

            System.out.println("Brand: " + brand4);
            System.out.println("Capacity: " + capacity4 + " liters");
            System.out.println("Material: " + material4);
            System.out.println("Color: " + color4);
            System.out.println("Height: " + height4 + " feet");
            System.out.println("Insulated: " + insulated4);
            System.out.println("Price: ₹" + price4);
            System.out.println();

            WaterTank ref5 = new WaterTank();
            ref5.setBrand("Aquatech");
            ref5.setCapacity(2000);
            ref5.setMaterial("Plastic");
            ref5.setColor("Yellow");
            ref5.setHeight(6.8);
            ref5.setIsInsulated(true);
            ref5.setPrice(7100.00);

            String brand5 = ref5.getBrand();
            int capacity5 = ref5.getCapacity();
            String material5 = ref5.getMaterial();
            String color5 = ref5.getColor();
            double height5 = ref5.getHeight();
            boolean insulated5 = ref5.getIsInsulated();
            double price5 = ref5.getPrice();

            System.out.println("Brand: " + brand5);
            System.out.println("Capacity: " + capacity5 + " liters");
            System.out.println("Material: " + material5);
            System.out.println("Color: " + color5);
            System.out.println("Height: " + height5 + " feet");
            System.out.println("Insulated: " + insulated5);
            System.out.println("Price: ₹" + price5);
            System.out.println();
        }
    }



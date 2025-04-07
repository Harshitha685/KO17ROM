package org.xworkz.geyserapp;

import org.xworkz.geyserapp.geyser.Geyser;

public class GeyserRunner {

        public static void main(String[] args) {
            Geyser ref1 = new Geyser();
            ref1.setBrand("Bajaj");
            ref1.setCapacity(25);
            ref1.setPowerConsumption(2000);
            ref1.setIsInstant(false);
            ref1.setColor("White");
            ref1.setHeatingTime(15.5);
            ref1.setPrice(7499.99);

            String brand1 = ref1.getBrand();
            int capacity1 = ref1.getCapacity();
            int power1 = ref1.getPowerConsumption();
            boolean instant1 = ref1.getIsInstant();
            String color1 = ref1.getColor();
            double time1 = ref1.getHeatingTime();
            double price1 = ref1.getPrice();

            System.out.println("Geyser Brand         : " + brand1);
            System.out.println("Capacity (Ltrs)      : " + capacity1);
            System.out.println("Power Consumption(W) : " + power1);
            System.out.println("Is Instant           : " + instant1);
            System.out.println("Color                : " + color1);
            System.out.println("Heating Time (min)   : " + time1);
            System.out.println("Price (₹)            : " + price1);
            System.out.println();

            Geyser ref2 = new Geyser();
            ref2.setBrand("Venus");
            ref2.setCapacity(15);
            ref2.setPowerConsumption(1500);
            ref2.setIsInstant(true);
            ref2.setColor("Ivory");
            ref2.setHeatingTime(10.0);
            ref2.setPrice(5899.00);

            String brand2 = ref2.getBrand();
            int capacity2 = ref2.getCapacity();
            int power2 = ref2.getPowerConsumption();
            boolean instant2 = ref2.getIsInstant();
            String color2 = ref2.getColor();
            double time2 = ref2.getHeatingTime();
            double price2 = ref2.getPrice();

            System.out.println("Geyser Brand         : " + brand2);
            System.out.println("Capacity (Ltrs)      : " + capacity2);
            System.out.println("Power Consumption(W) : " + power2);
            System.out.println("Is Instant           : " + instant2);
            System.out.println("Color                : " + color2);
            System.out.println("Heating Time (min)   : " + time2);
            System.out.println("Price (₹)            : " + price2);
            System.out.println);

            Geyser ref3 = new Geyser();
            ref3.setBrand("AO Smith");
            ref3.setCapacity(10);
            ref3.setPowerConsumption(1200);
            ref3.setIsInstant(true);
            ref3.setColor("Grey");
            ref3.setHeatingTime(5.0);
            ref3.setPrice(4499.00);

            String brand3 = ref3.getBrand();
            int capacity3 = ref3.getCapacity();
            int power3 = ref3.getPowerConsumption();
            boolean instant3 = ref3.getIsInstant();
            String color3 = ref3.getColor();
            double time3 = ref3.getHeatingTime();
            double price3 = ref3.getPrice();

            System.out.println("Geyser Brand         : " + brand3);
            System.out.println("Capacity (Ltrs)      : " + capacity3);
            System.out.println("Power Consumption(W) : " + power3);
            System.out.println("Is Instant           : " + instant3);
            System.out.println("Color                : " + color3);
            System.out.println("Heating Time (min)   : " + time3);
            System.out.println("Price (₹)            : " + price3);
            System.out.println();

            Geyser ref4 = new Geyser();
            ref4.setBrand("Racold");
            ref4.setCapacity(20);
            ref4.setPowerConsumption(1800);
            ref4.setIsInstant(false);
            ref4.setColor("Blue");
            ref4.setHeatingTime(12.5);
            ref4.setPrice(6299.99);

            String brand4 = ref4.getBrand();
            int capacity4 = ref4.getCapacity();
            int power4 = ref4.getPowerConsumption();
            boolean instant4 = ref4.getIsInstant();
            String color4 = ref4.getColor();
            double time4 = ref4.getHeatingTime();
            double price4 = ref4.getPrice();

            System.out.println("Geyser Brand         : " + brand4);
            System.out.println("Capacity (Ltrs)      : " + capacity4);
            System.out.println("Power Consumption(W) : " + power4);
            System.out.println("Is Instant           : " + instant4);
            System.out.println("Color                : " + color4);
            System.out.println("Heating Time (min)   : " + time4);
            System.out.println("Price (₹)            : " + price4);
            System.out.println();

            Geyser ref5 = new Geyser();
            ref5.setBrand("Crompton");
            ref5.setCapacity(30);
            ref5.setPowerConsumption(2200);
            ref5.setIsInstant(false);
            ref5.setColor("Black");
            ref5.setHeatingTime(18.0);
            ref5.setPrice(7999.00);

            String brand5 = ref5.getBrand();
            int capacity5 = ref5.getCapacity();
            int power5 = ref5.getPowerConsumption();
            boolean instant5 = ref5.getIsInstant();
            String color5 = ref5.getColor();
            double time5 = ref5.getHeatingTime();
            double price5 = ref5.getPrice();

            System.out.println("Geyser Brand         : " + brand5);
            System.out.println("Capacity (Ltrs)      : " + capacity5);
            System.out.println("Power Consumption(W) : " + power5);
            System.out.println("Is Instant           : " + instant5);
            System.out.println("Color                : " + color5);
            System.out.println("Heating Time (min)   : " + time5);
            System.out.println("Price (₹)            : " + price5);
            System.out.println();
        }
    }



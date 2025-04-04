package com.dmart.supermarketapp.market;

public class SuperMarket {
    public String marketName;
    public String location;
    public String[] sections;

    public void displayInfo(){
        System.out.println("Market name is : " +marketName);
        System.out.println("Location : " +location);
        for(String section:sections) {
            System.out.println(section);
        }
    }
}

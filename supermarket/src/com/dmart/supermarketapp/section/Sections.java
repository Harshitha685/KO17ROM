package com.dmart.supermarketapp.section;

public class Sections {
    public String sectionName;
    public String sectionCode;
    public String[] products;

    public void displaySection1Info(){
        System.out.println("Name of the section : " +sectionName);
        System.out.println("Section code is : " +sectionCode);
        for( String product:products){
            System.out.println(product);
        }

    }
}

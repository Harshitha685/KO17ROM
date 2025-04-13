package com.xworkz.tasks.property;

public class PropertyRunner {
    public static void main(String[] args) {
        Property property = new Property();
        property.sellProperty();
        property.rentProperty();

        Apartment apartment = new Apartment();
        apartment.sellProperty();
        apartment.rentProperty();

        Property property1 = new Apartment();

        Apartment apartment1 = (Apartment) property1;
        System.out.println(apartment1);
    }
}

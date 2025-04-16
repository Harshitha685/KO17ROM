package com.xworkz.tasks.property;

public class PropertyRunner {
    public static void main(String[] args) {
        Property property = new Property();
        property.propertyType();
        property.propertyLocation();
        property.propertySize();
        property.propertyPrice();
        property.isAvailable();

        System.out.println("--------------------------");

        Property property2 = new Apartment();
        property2.propertyType();
        property2.propertyLocation();
        property2.propertySize();
        property2.propertyPrice();
        property2.isAvailable();

        System.out.println("--------------------------");

        Apartment apartment = new Apartment();
        apartment.apartmentName();
        apartment.numberOfBedrooms();
        apartment.floorNumber();
        apartment.parkingAvailable();
        apartment.amenities();

        System.out.println("--------------------------");

        Property property3 = new Apartment();
        Apartment apartment2 = (Apartment) property3;
        System.out.println(apartment2);
    }
}

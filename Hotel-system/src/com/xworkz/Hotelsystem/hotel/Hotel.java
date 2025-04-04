package com.xworkz.Hotelsystem.hotel;

import com.xworkz.Hotelsystem.menu.Menu;

public class Hotel {
    public int hotelId;
    public String location;
    public String branches[];
    public Menu menus[];

    public void displayHotelInfo(){
        System.out.println("Hotel Id : "+hotelId);
        System.out.println("Hotel Branches: ");
        for (String branch : branches) {
            System.out.println(branch);
        }
        System.out.println();
        System.out.println("location : "+location);
        for(Menu menu : menus){
            menu.displayMenuInfo();
        }

    }
}

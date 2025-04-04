package com.xworkz.Hotelsystem;

import com.xworkz.Hotelsystem.hotel.Hotel;
import com.xworkz.Hotelsystem.menu.Menu;

public class HotelRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        String hotelBranches[]  = {"Vijaynagar","Jaynagar","JPNagra"};
        String ingredientsForTea[] = {"Milk","Water","Sugar","Taj"};
        String ingredientsForPalavo[]  = {"vegetables","oil","Rice"};

        Hotel hotel1 = new Hotel();
        hotel1.hotelId=1;
        hotel1.branches = hotelBranches;
        hotel1.location = "Bangalore";

        Menu menus[] = new Menu[2];//size

        Menu menu1 = new Menu();//object creation
        menu1.menuId = 1;
        menu1.menuName = "Amrut Chaha";
        menu1.price=50.0;
        menu1.ingredients = ingredientsForTea;

        Menu menu2 = new Menu();
        menu2.menuId = 2;
        menu2.menuName = "Palavo";
        menu2.price=60.0;
        menu2.ingredients = ingredientsForPalavo;

        menus[0] = menu1;
        menus[1] = menu2;


        hotel1.menus=menus;
        hotel1.displayHotelInfo();
        System.out.println("Main ended");

    }
}

package com.xworkz.Hotelsystem.menu;

public class Menu {

    public int menuId;
    public String menuName;
    public String ingredients[];
    public double price;

    public  void displayMenuInfo(){
        System.out.println("Menu Id : " +this.menuId);
        System.out.println("Menu name : " +this.menuName);
        for(String ingredient : ingredients) {
            System.out.println(ingredient);
        }
        System.out.println("Menu price : " +price);

    }

}

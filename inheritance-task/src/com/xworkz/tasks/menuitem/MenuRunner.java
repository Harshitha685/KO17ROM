package com.xworkz.tasks.menuitem;
import com.xworkz.tasks.menuitem.MenuItem;
public class MenuRunner {
    public static void main(String[] args) {
        MenuItem menu = new MenuItem();
        menu.menuType();
        menu.numberOfItems();
        menu.cuisine();
        menu.isAvailable();
        menu.servingTime();

        System.out.println("--------------------------");

        MenuItem menu2 = new Desserts();
        menu2.menuType();
        menu2.numberOfItems();
        menu2.cuisine();
        menu2.isAvailable();
        menu2.servingTime();

        System.out.println("--------------------------");

        Desserts desserts = new Desserts();
        desserts.sweetName();
        desserts.sugarFreeOption();
        desserts.calories();
        desserts.servingStyle();
        desserts.price();

        System.out.println("--------------------------");

        MenuItem menu3 = new Desserts();
        Desserts desserts1 = (Desserts) menu3;
        System.out.println(desserts1);
    }
}

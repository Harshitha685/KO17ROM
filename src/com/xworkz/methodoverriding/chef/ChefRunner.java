package com.xworkz.methodoverriding.chef;

public class ChefRunner {
    public static void main(String[] args) {
        Chef chef = new Chef();
        chef.cook();
        chef.prepareIngredients();
        chef.cleanKitchen();
        chef.serveFood();
        System.out.println();

        Chef pastry1 = new PastryChef();
        pastry1.cook();
        pastry1.prepareIngredients();
        pastry1.cleanKitchen();
        pastry1.serveFood();
        System.out.println();

        PastryChef pastry = new PastryChef();
        pastry.cook();
        pastry.prepareIngredients();
        pastry.cleanKitchen();
        pastry.serveFood();
    }
}



package com.xworkz.tasks.food;

public class FoodRunner {
    public static void main(String[] args) {
        Food food = new Food();
        food.foodName();
        food.isHealthy();
        food.prepareFood();
        food.cookFood();
        food.serveFood();

        Food food2 = new Biryani();
        food2.foodName();
        food2.isHealthy();
        food2.prepareFood();
        food2.cookFood();
        food2.serveFood();

        Biryani biryani = new Biryani();
        biryani.addIngredients();
        biryani.displayFoodDetails();
        biryani.addRaita();
        biryani.addKurma();
        biryani.basmatiRice();

        Food food1 = new Biryani();
        Biryani biryani1 = (Biryani) food1;
        System.out.println(biryani1);
    }
}

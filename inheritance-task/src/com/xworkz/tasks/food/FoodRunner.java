package com.xworkz.tasks.food;

public class FoodRunner {
    public static void main(String[] args) {
        Food food = new Food();
        food.foodName();
        food.isHealthy();

        Biryani biryani = new Biryani();
        biryani.foodName();
        biryani.isHealthy();

        Food food1 = new Biryani();
        Biryani biryani1 = (Biryani) food1;
        System.out.println(biryani1);
    }
}

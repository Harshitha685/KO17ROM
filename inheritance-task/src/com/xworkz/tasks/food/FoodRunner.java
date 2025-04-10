package com.xworkz.tasks.food;

public class FoodRunner {
    public static void main(String[] args) {
        Food food = new Food();
        food.foodName();
        food.isHealthy();

        Biryani biryani = new Biryani();
        biryani.foodName();
        biryani.isHealthy();
    }
}

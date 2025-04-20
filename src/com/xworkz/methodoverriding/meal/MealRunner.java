package com.xworkz.methodoverriding.meal;

public class MealRunner {

        public static void main(String[] args) {
            Meal meal = new Meal();
            meal.prepare();
            meal.serve();
            meal.eat();
            meal.cleanUp();
            System.out.println();

            Meal dm = new DinnerMeal();
            dm.prepare();
            dm.serve();
            dm.eat();
            dm.cleanUp();
            System.out.println();

            DinnerMeal dinner = new DinnerMeal();
            dinner.prepare();
            dinner.serve();
            dinner.eat();
            dinner.cleanUp();
            dinner.lightCandles(); // Unique method
        }
    }



package com.xworkz.objectmethodtask.dish;

public class DishRunner {

        public static void main(String[] args) {

            DishDto dish = new DishDto();

            dish.setDishName("Paneer Butter Masala");
            dish.setCuisine("Indian");
            dish.setPrice(250.00);
            dish.setVegetarian(true);
            dish.setPreparationTime(30);

            System.out.println(dish);
        }
    }



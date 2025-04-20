package com.xworkz.methodoverriding.plant;

public class PlantRunner {
        public static void main(String[] args) {
            Plant plant = new Plant();
            plant.grow();
            plant.photosynthesize();
            plant.absorbWater();
            plant.reproduce();
            System.out.println();

            Plant pc = new Cactus();
            pc.grow();
            pc.photosynthesize();
            pc.absorbWater();
            pc.reproduce();
            System.out.println();

            Cactus cactus = new Cactus();
            cactus.grow();
            cactus.photosynthesize();
            cactus.absorbWater();
            cactus.reproduce();
            cactus.protectWithSpines();
        }
    }



package com.xworkz.methodoverriding.planet;

public class PlanetRunner {

        public static void main(String[] args) {


            Planet planet = new Planet();
            planet.name();
            planet.type();
            planet.size();
            planet.atmosphere();
            System.out.println();

            Planet earth1 = new Earth();
            earth1.name();
            earth1.type();
            earth1.size();
            earth1.atmosphere();
            System.out.println();

            Earth earth2 = new Earth();
            earth2.name();
            earth2.type();
            earth2.size();
            earth2.atmosphere();
            earth2.water();
            earth2.life();
    }
}

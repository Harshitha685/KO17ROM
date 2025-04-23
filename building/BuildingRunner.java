package com.xworkz.objectmethodtask.building;

public class BuildingRunner {

        public static void main(String[] args) {

            BuildingDto building = new BuildingDto();

            building.setBuildingName("Skyline Tower");
            building.setAddress("Bangalore, MG Road");
            building.setTotalFloors(25);
            building.setArea(12000.50);
            building.setHasParking(true);

            System.out.println(building);
        }
    }



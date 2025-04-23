package com.xworkz.objectmethodtask.building;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BuildingDto {

    private String buildingName;
    private String address;
    private int totalFloors;
    private double area; 
    private boolean hasParking;

    @Override
    public String toString() {
        return "BuildingDto = (" +
                "buildingName = " + this.buildingName + "," +
                "\naddress = " + this.address + "," +
                "\ntotalFloors = " + this.totalFloors + "," +
                "\narea = " + this.area + " sq.m," +
                "\nhasParking = " + this.hasParking + ")";
    }
}



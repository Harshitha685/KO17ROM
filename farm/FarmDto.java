package com.xworkz.objectmethodtask.farm;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FarmDto {

    private String farmName;
    private String location;
    private double areaInAcres;
    private String cropType;
    private boolean isOrganic;

    @Override
    public String toString() {
        return "FarmDto = (" +
                "farmName = " + this.farmName + "," +
                "\nlocation = " + this.location + "," +
                "\nareaInAcres = " + this.areaInAcres + " acres," +
                "\ncropType = " + this.cropType + "," +
                "\nisOrganic = " + this.isOrganic + ")";
    }
}



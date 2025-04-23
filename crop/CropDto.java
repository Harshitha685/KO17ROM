package com.xworkz.objectmethodtask.crop;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CropDto {

    private String cropName;
    private String season;
    private double yieldPerHectare;
    private String farmingMethod;
    private boolean isOrganic;

    @Override
    public String toString() {
        return "CropDto = (" +
                "cropName = " + this.cropName + "," +
                "\nseason = " + this.season + "," +
                "\nyieldPerHectare = " + this.yieldPerHectare + " tons," +
                "\nfarmingMethod = " + this.farmingMethod + "," +
                "\nisOrganic = " + this.isOrganic + ")";
    }
}



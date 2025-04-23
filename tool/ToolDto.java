package com.xworkz.objectmethodtask.tool;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ToolDto {

    private String toolName;
    private String toolType;
    private double weight;
    private boolean isElectric;
    private String brand;

    @Override
    public String toString() {
        return "ToolDto = (" +
                "toolName = " + this.toolName + "," +
                "\ntoolType = " + this.toolType + "," +
                "\nweight = " + this.weight + " kg," +
                "\nisElectric = " + this.isElectric + "," +
                "\nbrand = " + this.brand + ")";

}

}

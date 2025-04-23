package com.xworkz.objectmethodtask.design;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DesignDto {

    private String designName;
    private String designerName;
    private String designType;
    private double designPrice;
    private boolean isCustomDesign;

    @Override
    public String toString() {
        return "DesignDto = (" +
                "designName = " + this.designName + "," +
                "\ndesignerName = " + this.designerName + "," +
                "\ndesignType = " + this.designType + "," +
                "\ndesignPrice = " + this.designPrice + "," +
                "\nisCustomDesign = " + this.isCustomDesign + ")";
    }
}



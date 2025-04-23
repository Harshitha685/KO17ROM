package com.xworkz.objectmethodtask.constructionmaterial;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConstructionMaterialDto {

    private String materialName;
    private String materialType;
    private double pricePerUnit;
    private double quantity;
    private boolean isAvailable;

    @Override
    public String toString() {
        return "ConstructionMaterialDto = (" +
                "materialName = " + this.materialName + "," +
                "\nmaterialType = " + this.materialType + "," +
                "\npricePerUnit = ₹" + this.pricePerUnit + "," +
                "\nquantity = " + this.quantity + " units," +
                "\nisAvailable = " + this.isAvailable + ")";
    }
}



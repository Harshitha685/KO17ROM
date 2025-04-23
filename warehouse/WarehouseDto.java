package com.xworkz.objectmethodtask.warehouse;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WarehouseDto {

    private String warehouseName;
    private String location;
    private int capacity;
    private int currentStock;
    private boolean isOperational;

    @Override
    public String toString() {
        return "WarehouseDto = (" +
                "warehouseName = " + this.warehouseName + "," +
                "\nlocation = " + this.location + "," +
                "\ncapacity = " + this.capacity + " units," +
                "\ncurrentStock = " + this.currentStock + " units," +
                "\nisOperational = " + this.isOperational + ")";
    }
}



package com.xworkz.objectmethodtask.warehouse;

public class WarehouseRunner {

        public static void main(String[] args) {

            WarehouseDto warehouse = new WarehouseDto();

            warehouse.setWarehouseName("Central Warehouse");
            warehouse.setLocation("New York");
            warehouse.setCapacity(5000);
            warehouse.setCurrentStock(3200);
            warehouse.setOperational(true);

            System.out.println(warehouse);
        }
    }



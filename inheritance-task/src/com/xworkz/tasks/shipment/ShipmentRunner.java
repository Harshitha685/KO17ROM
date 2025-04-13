package com.xworkz.tasks.shipment;

public class ShipmentRunner {
    public static void main(String[] args) {
        Shipment shipment = new Shipment();
        shipment.trackShipment();
        shipment.printShipmentDetails();

        ExpressShipment expressShipment = new ExpressShipment();
        expressShipment.trackShipment();
        expressShipment.printShipmentDetails();

        Shipment shipment1 = new ExpressShipment();

        ExpressShipment expressShipment1 = (ExpressShipment) shipment1;
        System.out.println(expressShipment1);
    }
}

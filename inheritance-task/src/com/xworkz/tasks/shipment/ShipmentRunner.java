package com.xworkz.tasks.shipment;

public class ShipmentRunner {
    public static void main(String[] args) {
        Shipment shipment = new Shipment();
        shipment.shipmentType();
        shipment.shipmentWeight();
        shipment.shipmentDestination();
        shipment.shipmentCost();
        shipment.shipmentStatus();

        System.out.println("--------------------------");

        Shipment shipment2 = new ExpressShipment();
        shipment2.shipmentType();
        shipment2.shipmentWeight();
        shipment2.shipmentDestination();
        shipment2.shipmentCost();
        shipment2.shipmentStatus();

        System.out.println("--------------------------");

        ExpressShipment expressShipment = new ExpressShipment();
        expressShipment.expressDeliveryTime();
        expressShipment.expressShipmentCost();
        expressShipment.expressShipmentSpeed();
        expressShipment.expressTrackingAvailable();
        expressShipment.expressPriority();

        System.out.println("--------------------------");

        Shipment shipment3 = new ExpressShipment();
        ExpressShipment expressShipment2 = (ExpressShipment) shipment3;
        System.out.println(expressShipment2);
    }
}

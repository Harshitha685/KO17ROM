package com.xworkz.tasks.shipment;

public class ExpressShipment extends Shipment {
    public void expressDeliveryTime() {
        System.out.println("Delivery Time: 24 Hours");
    }

    public void expressShipmentCost() {
        System.out.println("Express Shipment Cost: ₹2500");
    }

    public void expressShipmentSpeed() {
        System.out.println("Speed: Fast");
    }

    public void expressTrackingAvailable() {
        System.out.println("Tracking Available: Yes");
    }

    public void expressPriority() {
        System.out.println("Priority: High");
    }
}

package com.xworkz.tasks.emergency;

public class EmergencyRunner {
    public static void main(String[] args) {
        Emergency emergency = new Emergency();
        emergency.logEmergencyDetails();
        emergency.isCritical();

        Ambulance ambulance = new Ambulance();
        ambulance.logEmergencyDetails();
        ambulance.isCritical();
    }
}

package com.xworkz.tasks.emergency;

public class EmergencyRunner {
    public static void main(String[] args) {
        Emergency emergency = new Emergency();
        emergency.logEmergencyDetails();
        emergency.isCritical();
        emergency.respondToEmergency();
        emergency.dispatchAmbulance();
        emergency.arriveAtScene();

        Emergency emergency2 = new Ambulance();
        emergency2.logEmergencyDetails();
        emergency2.isCritical();
        emergency2.respondToEmergency();
        emergency2.dispatchAmbulance();
        emergency2.arriveAtScene();

        Ambulance ambulance = new Ambulance();
        ambulance.provideMedicalAssistance();
        ambulance.transportToHospital();
        ambulance.cleanAmbulance();
        ambulance.emergency();
        ambulance.trafficFree();

        Emergency emergency1 = new Ambulance();

        Ambulance ambulance1 = (Ambulance) emergency1;
        System.out.println(ambulance1);
    }
}

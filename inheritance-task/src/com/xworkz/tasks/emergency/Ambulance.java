package com.xworkz.tasks.emergency;

public class Ambulance extends Emergency{


        public void provideMedicalAssistance() {
            System.out.println("Ambulance: Administering first aid and stabilizing the patient.");
        }

        public void transportToHospital() {
            System.out.println("Ambulance: Patient is being transported to the hospital.");
        }


        public void cleanAmbulance() {
            System.out.println("Ambulance: Cleaning the ambulance after use.");
        }

        public void emergency(){
            System.out.println("Ambulance: medical emergency.");
        }

        public void trafficFree(){
            System.out.println("Traffic free");
        }
    }



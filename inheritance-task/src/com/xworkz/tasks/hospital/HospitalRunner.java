package com.xworkz.tasks.hospital;

public class HospitalRunner {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.admitPatient();
        hospital.dischargePatient();
        hospital.assignRoom();
        hospital.provideTreatment();
        hospital.emergencyServices();

        Hospital hospital2 = new Apollo();
        hospital2.admitPatient();
        hospital2.dischargePatient();
        hospital2.assignRoom();
        hospital2.provideTreatment();
        hospital2.emergencyServices();

        Apollo apollo = new Apollo();
        apollo.scheduleAppointment();
        apollo.performSurgery();
        apollo.provideEmergencyCare();
        apollo.offerHealthCheckup();
        apollo.organizeMedicalCamp();

        Hospital hospital1 = new Apollo();
        Apollo apollo1 = (Apollo) hospital1;
        System.out.println(apollo1);
    }
}

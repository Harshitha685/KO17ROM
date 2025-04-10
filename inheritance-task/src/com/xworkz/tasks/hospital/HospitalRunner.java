package com.xworkz.tasks.hospital;

public class HospitalRunner {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.admitPatient();
        hospital.dischargePatient();


        Apollo apollo = new Apollo();
        apollo.admitPatient();
        apollo.dischargePatient();
    }
}

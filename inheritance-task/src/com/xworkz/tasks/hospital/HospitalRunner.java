package com.xworkz.tasks.hospital;

public class HospitalRunner {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.admitPatient();
        hospital.dischargePatient();


        Apollo apollo = new Apollo();
        apollo.admitPatient();
        apollo.dischargePatient();

        Hospital hospital1 = new Apollo();
        Apollo apollo1 = (Apollo) hospital1;
        System.out.println(apollo1);
    }
}

package com.xworkz.tasks.doctor;

import com.sun.org.apache.bcel.internal.generic.DCMPG;

public class DoctorRunner {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.prescribeMedicine();
        doctor.writePrescription();

        Surgeon surgeon = new Surgeon();
        surgeon.prescribeMedicine();
        surgeon.writePrescription();
    }
}

package com.xworkz.tasks.doctor;

import com.sun.org.apache.bcel.internal.generic.DCMPG;

import javax.print.Doc;

public class DoctorRunner {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.prescribeMedicine();
        doctor.writePrescription();

        Surgeon surgeon = new Surgeon();
        surgeon.prescribeMedicine();
        surgeon.writePrescription();

        Doctor doctor1 = new Surgeon();

        Surgeon surgeon1 = (Surgeon) doctor1;
        System.out.println(surgeon1);
    }
}

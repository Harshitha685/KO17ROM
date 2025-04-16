package com.xworkz.tasks.doctor;

import com.sun.org.apache.bcel.internal.generic.DCMPG;

import javax.print.Doc;

public class DoctorRunner {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.prescribeMedicine();
        doctor.writePrescription();
        doctor.diagnoseDisease();
        doctor.maintainRecords();
        doctor.giveFollowUpAdvice();

        Doctor doctor2 = new Surgeon();
        doctor2.prescribeMedicine();
        doctor2.writePrescription();
        doctor2.diagnoseDisease();
        doctor2.maintainRecords();
        doctor2.giveFollowUpAdvice();

        Surgeon surgeon = new Surgeon();
        surgeon.performSurgery();
        surgeon.sterilizeInstruments();
        surgeon.useAnesthesia();
        surgeon.monitorVitals();
        surgeon.handleEmergencyCases();

        Doctor doctor1 = new Surgeon();

        Surgeon surgeon1 = (Surgeon) doctor1;
        System.out.println(surgeon1);
    }
}

package com.xworkz.objectmethodtask.appointment;

public class AppointmentRunner {
        public static void main(String[] args) {

            AppointmentDto appointment = new AppointmentDto();

            appointment.setPatientName("Sanjana");
            appointment.setDoctorName("Dr. Prakash");
            appointment.setDate("2025-04-22");
            appointment.setTime("10:30 AM");
            appointment.setDepartment("Dermatology");

            System.out.println(appointment.toString());
        }
    }



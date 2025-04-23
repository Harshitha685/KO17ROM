package com.xworkz.objectmethodtask.technician;

public class TechnicianRunner {

        public static void main(String[] args) {

            TechnicianDto technician = new TechnicianDto();

            technician.setTechnicianName("James Smith");
            technician.setTechnicianSpecialty("Electrical Maintenance");
            technician.setExperienceInYears(8);
            technician.setCertification("Certified Electrician");
            technician.setAvailable(true);

            System.out.println(technician);
        }
    }



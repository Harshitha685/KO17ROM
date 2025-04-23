package com.xworkz.objectmethodtask.technician;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TechnicianDto {

    private String technicianName;
    private String technicianSpecialty;
    private int experienceInYears;
    private String certification;
    private boolean isAvailable;

    @Override
    public String toString() {
        return "TechnicianDto = (" +
                "technicianName = " + this.technicianName + "," +
                "\ntechnicianSpecialty = " + this.technicianSpecialty + "," +
                "\nexperienceInYears = " + this.experienceInYears + " years," +
                "\ncertification = " + this.certification + "," +
                "\nisAvailable = " + this.isAvailable + ")";
    }
}



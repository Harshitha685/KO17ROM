package com.xworkz.objectmethodtask.drivinglicense;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DrivingLicenseDto {

    private String name;
    private int age;
    private String licenseNumber;
    private String state;
    private boolean isValid;

    @Override
    public String toString() {
        return "DrivingLicenseDto = (name = " + this.name + "," +
                "\nage = " + this.age + "," +
                "\nlicense no = " + this.licenseNumber + "," +
                "\nstate = "+this.state+"," +
                "\nisValid = "+this.isValid+")";
    }
}

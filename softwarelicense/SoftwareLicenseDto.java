package com.xworkz.objectmethodtask.softwarelicense;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SoftwareLicenseDto {

    private String licenseKey;
    private String softwareName;
    private String issuedTo;
    private String expiryDate;
    private boolean isActive;

    @Override
    public String toString() {
        return "SoftwareLicenseDto = (" +
                "licenseKey = " + this.licenseKey + "," +
                "\nsoftwareName = " + this.softwareName + "," +
                "\nissuedTo = " + this.issuedTo + "," +
                "\nexpiryDate = " + this.expiryDate + "," +
                "\nisActive = " + this.isActive + ")";
    }
}



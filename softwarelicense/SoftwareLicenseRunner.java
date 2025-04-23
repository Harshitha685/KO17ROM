package com.xworkz.objectmethodtask.softwarelicense;

public class SoftwareLicenseRunner {

        public static void main(String[] args) {

            SoftwareLicenseDto license = new SoftwareLicenseDto();

            license.setLicenseKey("ABC12345XYZ");
            license.setSoftwareName("Microsoft Office 365");
            license.setIssuedTo("Harshitha");
            license.setExpiryDate("2026-04-22");
            license.setActive(true);

            System.out.println(license);
        }
    }



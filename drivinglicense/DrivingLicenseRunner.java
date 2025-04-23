package com.xworkz.objectmethodtask.drivinglicense;

public class DrivingLicenseRunner {
    public static void main(String[] args) {
        DrivingLicenseDto dto = new DrivingLicenseDto();
        dto.setName("Bhuvana");
        dto.setAge(34);
        dto.setLicenseNumber("rtyi5789");
        dto.setState("Karnataka");
        dto.setValid(true);
        System.out.println(dto.toString());
    }
}

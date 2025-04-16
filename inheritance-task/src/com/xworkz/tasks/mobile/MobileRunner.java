package com.xworkz.tasks.mobile;

public class MobileRunner {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.brand();
        mobile.model();
        mobile.batteryCapacity();
        mobile.isTouchScreen();
        mobile.supportsInternet();

        System.out.println("--------------------------");

        Mobile mobile2 = new SmartPhone();
        mobile2.brand();
        mobile2.model();
        mobile2.batteryCapacity();
        mobile2.isTouchScreen();
        mobile2.supportsInternet();

        System.out.println("--------------------------");

        SmartPhone phone = new SmartPhone();
        phone.operatingSystem();
        phone.cameraQuality();
        phone.storage();
        phone.fingerprintSensor();
        phone.supports5G();

        System.out.println("--------------------------");

        Mobile mobile3 = new SmartPhone();
        SmartPhone phone2 = (SmartPhone) mobile3;
        System.out.println(phone2);
    }
}

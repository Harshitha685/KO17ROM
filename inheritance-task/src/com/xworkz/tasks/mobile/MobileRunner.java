package com.xworkz.tasks.mobile;

public class MobileRunner {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.installApp();
        mobile.uninstallApp();

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.installApp();
        smartPhone.uninstallApp();

        Mobile mobile1 = new SmartPhone();

        SmartPhone smartPhone1 = (SmartPhone) mobile1;
        System.out.println(smartPhone1);
    }
}

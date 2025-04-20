package com.xworkz.methodoverriding.router;

public class RouterRunner {
        public static void main(String[] args) {
            Router basicRouter = new Router();
            basicRouter.powerOn();
            basicRouter.connect();
            basicRouter.configureSettings();
            basicRouter.powerOff();
            System.out.println();

            Router wir = new WifiRouter();
            wir.powerOn();
            wir.connect();
            wir.configureSettings();
            wir.powerOff();
            System.out.println();

            WifiRouter wifi = new WifiRouter();
            wifi.powerOn();
            wifi.connect();
            wifi.configureSettings();
            wifi.powerOff();
            wifi.showConnectedDevices();  // Child's unique method
        }
    }



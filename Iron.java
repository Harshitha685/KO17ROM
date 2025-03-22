class Iron {

    static boolean isPoweredOn = false;
    static int currentTemperature;
    static int minTemperature = 5;   
    static int maxTemperature = 8;   
    static int temperatureStep = 1;   
	
    public static void powerButton() {
        if (isPoweredOn == false) {
            isPoweredOn = true;
            currentTemperature = minTemperature;
            System.out.println("Iron is now ON...");
            System.out.println("Default temperature set to: " + currentTemperature + "°C");
        } else {
            isPoweredOn = false;
            System.out.println("Iron is now OFF...");
        }
    }

    public static void increaseTemp() {
        if (isPoweredOn) {
            if (currentTemperature + temperatureStep <= maxTemperature) {
                currentTemperature += temperatureStep;
                System.out.println("Temperature increased to: " + currentTemperature + "°C");
            } else {
                System.out.println("Maximum temperature reached!");
            }
        } else {
            System.out.println("Turn on the Iron first!");
        }
    }

    public static void decreaseTemp() {
        if (isPoweredOn) {
            if (currentTemperature - temperatureStep >= minTemperature) {
                currentTemperature -= temperatureStep;
                System.out.println("Temperature decreased to: " + currentTemperature + "°C");
            } else {
                System.out.println("Minimum temperature reached!");
            }
        } else {
            System.out.println("Turn on the Iron first!");
        }
    }
}

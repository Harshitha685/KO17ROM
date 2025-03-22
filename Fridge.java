class Fridge {

    static boolean isPoweredOn = false;
    static int currentCoolingLevel;
    static int maxCoolingLevel = 4;
    static int minCoolingLevel = 1;

    public static void powerButton() {
        if (isPoweredOn == false) {
            isPoweredOn = true;
            currentCoolingLevel = 3; // Default cooling level
            System.out.println("Fridge is now ON...");
        } else {
            isPoweredOn = false;
            System.out.println("Fridge is now OFF...");
        }
    }

    public static void increaseCooling() {
        if (isPoweredOn == true) {
            if (currentCoolingLevel < maxCoolingLevel) {
                currentCoolingLevel = currentCoolingLevel + 1 ;
                System.out.println("Cooling level increased to: " + currentCoolingLevel);
            } else {
                System.out.println("Maximum cooling level reached!");
            }
        } else {
            System.out.println("Turn on the Fridge first!");
        }
    }

    public static void decreaseCooling() {
        if (isPoweredOn == true) {
            if (currentCoolingLevel > minCoolingLevel) {
                currentCoolingLevel = currentCoolingLevel - 1 ;
                System.out.println("Cooling level decreased to: " + currentCoolingLevel);
            } else {
                System.out.println("Minimum cooling level reached!");
            }
        } else {
            System.out.println("Turn on the Fridge first!");
        }
    }
}

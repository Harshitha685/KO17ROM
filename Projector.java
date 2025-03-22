class Projector {

    static boolean isPoweredOn = false;
    static int brightnessLevel;
    static int maxBrightness = 5;
    static int minBrightness = 1;

    public static void powerButton() {
        if (isPoweredOn == false) {
            isPoweredOn = true;
            brightnessLevel = 5; // default brightness when turned on
            System.out.println("Projector is now ON...");
        } else {
            isPoweredOn = false;
            System.out.println("Projector is now OFF...");
        }
    }

    public static void increaseBrightness() {
        if (isPoweredOn == true) {
            if (brightnessLevel < maxBrightness) {
                brightnessLevel = brightnessLevel + 1;
                System.out.println("Current Brightness Level: " + brightnessLevel);
            } else {
                System.out.println("Maximum brightness reached!");
            }
        } else {
            System.out.println("Please turn on the Projector first!");
        }
    }

    public static void decreaseBrightness() {
        if (isPoweredOn == true) {
            if (brightnessLevel > minBrightness) {
                brightnessLevel = brightnessLevel - 1;
                System.out.println("Current Brightness Level: " + brightnessLevel);
            } else {
                System.out.println("Minimum brightness reached!");
            }
        } else {
            System.out.println("Please turn on the Projector first!");
        }
    }
}

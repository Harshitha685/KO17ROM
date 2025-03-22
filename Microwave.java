class MicroWave {

    static boolean isPoweredOn = false;
    static int currentTime;
    static int maxTime = 6; 
    static int minTime ;

    public static void powerButton() {
        if (isPoweredOn == false) {
            isPoweredOn = true;
            System.out.println("Microwave is On...");
        } else {
            isPoweredOn = false;
            System.out.println("Microwave is Off...");
        }
    }

    public static void increaseTime() {
        if (isPoweredOn == true) {
            if (currentTime < maxTime) {
                currentTime = currentTime + 1;
                System.out.println("Current Timer: " + currentTime + " min");
            } else {
                System.out.println("Maximum time reached!");
            }
        } else {
            System.out.println("Turn on the Microwave first!");
        }
    }

    public static void decreaseTime() {
        if (isPoweredOn == true) {
            if (currentTime > minTime) {
                currentTime = currentTime - 1;
                System.out.println("Current Timer: " + currentTime + " min");
            } else {
                System.out.println("Minimum time reached!");
            }
        } else {
            System.out.println("Turn on the Microwave first!");
        }
    }
}

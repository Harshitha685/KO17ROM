class Radio {

    static boolean isPoweredOn = false;
    static int volumeLevel = 5;
    static int minVolume;
    static int maxVolume = 6;

    public static void powerButton() {
        if (isPoweredOn == false) {
            isPoweredOn = true;
            System.out.println("Radio is now ON...");
            System.out.println("Current volume: " + volumeLevel);
        } else {
            isPoweredOn = false;
            System.out.println("Radio is now OFF...");
        }
    }

    public static void increaseVolume() {
        if (isPoweredOn) {
            if (volumeLevel < maxVolume) {
                volumeLevel = volumeLevel + 1;
                System.out.println("Volume increased to: " + volumeLevel);
            } else {
                System.out.println("Maximum volume reached!");
            }
        } else {
            System.out.println("Turn on the Radio first!");
        }
    }

    public static void decreaseVolume() {
        if (isPoweredOn) {
            if (volumeLevel > minVolume) {
                volumeLevel = volumeLevel - 1;
                System.out.println("Volume decreased to: " + volumeLevel);
            } else {
                System.out.println("Minimum volume reached!");
            }
        } else {
            System.out.println("Turn on the Radio first!");
        }
    }
}

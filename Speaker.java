class Speaker {

    static boolean isPoweredOn = false;
    static int currentVolume;
    static int maxVolume = 10;
    static int minVolume;

    public static void powerButton() {
        if (isPoweredOn == false) {
            isPoweredOn = true;
            System.out.println("Speaker is On...");
        } else if (isPoweredOn == true) {
            isPoweredOn = false;
            System.out.println("Speaker is Off...");
        }
    }

    public static void increaseVolume() {
        if (isPoweredOn == true) {
            if (currentVolume < maxVolume) {
                currentVolume = currentVolume + 1;
                System.out.println("Current Volume: " + currentVolume);
            } else {
                System.out.println("Max volume reached");
            }
        } else {
            System.out.println("Please turn on the Speaker first");
        }
    }

    public static void decreaseVolume() {
        if (isPoweredOn == true) {
            if (currentVolume > minVolume) {
                currentVolume = currentVolume - 1;
                System.out.println("Current Volume: " + currentVolume);
            } else {
                System.out.println("Min volume reached");
            }
        } else {
            System.out.println("Please turn on the Speaker first");
        }
    }
}

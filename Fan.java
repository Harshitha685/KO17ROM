class Fan {

    static boolean isPoweredOn = false;
    static int currentSpeed;
    static int maxSpeed = 5;
    static int minSpeed ;

    public static void powerButton() {
        if (isPoweredOn == false) {
            isPoweredOn = true;
            currentSpeed = 1; 
            System.out.println("Fan is now ON...");
        } else {
            isPoweredOn = false;
            currentSpeed = 0;
            System.out.println("Fan is now OFF...");
        }
    }

    public static void increaseSpeed() {
        if (isPoweredOn == true) {
            if (currentSpeed < maxSpeed) {
                currentSpeed = currentSpeed + 1;
                System.out.println("Fan speed increased to: " + currentSpeed);
            } else {
                System.out.println("Maximum speed reached!");
            }
        } else {
            System.out.println("Turn on the Fan first!");
        }
    }

    public static void decreaseSpeed() {
        if (isPoweredOn == true) {
            if (currentSpeed > minSpeed) {
                currentSpeed = currentSpeed - 1;
                System.out.println("Fan speed decreased to: " + currentSpeed);
            } else {
                System.out.println("Fan is already at minimum speed!");
            }
        } else {
            System.out.println("Turn on the Fan first!");
        }
    }
}

class TubeLight {

    String intensity;
    int watts;
    String lightTone;
    boolean isLED;

    TubeLight() {
        System.out.println("A new tube light is added!");
    }

    TubeLight(String intensity, int watts, String lightTone, boolean isLED) {
        System.out.println("A new tube light is added!");
        this.intensity = intensity;
        this.watts = watts;
        this.lightTone = lightTone;
        this.isLED = isLED;
    }
}


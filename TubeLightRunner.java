class TubeLightRunner {

public static void main(String tube[]) {

    // 1
    TubeLight t1 = new TubeLight();
    t1.intensity = "High";
    t1.watts = 18;
    t1.lightTone = "Cool White";
    t1.isLED = true;
    System.out.println("Intensity  : " + t1.intensity);
    System.out.println("Watts      : " + t1.watts);
    System.out.println("Light Tone : " + t1.lightTone);
    System.out.println("Is LED     : " + t1.isLED);
    System.out.println();

    t1 = new TubeLight("High", 18, "Cool White", true);
    System.out.println("Intensity  : " + t1.intensity);
    System.out.println("Watts      : " + t1.watts);
    System.out.println("Light Tone : " + t1.lightTone);
    System.out.println("Is LED     : " + t1.isLED);
    System.out.println();

    // 2
    TubeLight t2 = new TubeLight();
    t2.intensity = "Medium";
    t2.watts = 20;
    t2.lightTone = "Warm White";
    t2.isLED = false;
    System.out.println("Intensity  : " + t2.intensity);
    System.out.println("Watts      : " + t2.watts);
    System.out.println("Light Tone : " + t2.lightTone);
    System.out.println("Is LED     : " + t2.isLED);
    System.out.println();

    t2 = new TubeLight("Medium", 20, "Warm White", false);
    System.out.println("Intensity  : " + t2.intensity);
    System.out.println("Watts      : " + t2.watts);
    System.out.println("Light Tone : " + t2.lightTone);
    System.out.println("Is LED     : " + t2.isLED);
    System.out.println();

    // 3
    TubeLight t3 = new TubeLight();
    t3.intensity = "Low";
    t3.watts = 15;
    t3.lightTone = "Daylight";
    t3.isLED = true;
    System.out.println("Intensity  : " + t3.intensity);
    System.out.println("Watts      : " + t3.watts);
    System.out.println("Light Tone : " + t3.lightTone);
    System.out.println("Is LED     : " + t3.isLED);
    System.out.println();

    t3 = new TubeLight("Low", 15, "Daylight", true);
    System.out.println("Intensity  : " + t3.intensity);
    System.out.println("Watts      : " + t3.watts);
    System.out.println("Light Tone : " + t3.lightTone);
    System.out.println("Is LED     : " + t3.isLED);
    System.out.println();

    // 4
    TubeLight t4 = new TubeLight();
    t4.intensity = "Bright";
    t4.watts = 22;
    t4.lightTone = "Cool Blue";
    t4.isLED = false;
    System.out.println("Intensity  : " + t4.intensity);
    System.out.println("Watts      : " + t4.watts);
    System.out.println("Light Tone : " + t4.lightTone);
    System.out.println("Is LED     : " + t4.isLED);
    System.out.println();

    t4 = new TubeLight("Bright", 22, "Cool Blue", false);
    System.out.println("Intensity  : " + t4.intensity);
    System.out.println("Watts      : " + t4.watts);
    System.out.println("Light Tone : " + t4.lightTone);
    System.out.println("Is LED     : " + t4.isLED);
    System.out.println();

    // 5
    TubeLight t5 = new TubeLight();
    t5.intensity = "Dim";
    t5.watts = 10;
    t5.lightTone = "Soft Yellow";
    t5.isLED = true;
    System.out.println("Intensity  : " + t5.intensity);
    System.out.println("Watts      : " + t5.watts);
    System.out.println("Light Tone : " + t5.lightTone);
    System.out.println("Is LED     : " + t5.isLED);
    System.out.println();

    t5 = new TubeLight("Dim", 10, "Soft Yellow", true);
    System.out.println("Intensity  : " + t5.intensity);
    System.out.println("Watts      : " + t5.watts);
    System.out.println("Light Tone : " + t5.lightTone);
    System.out.println("Is LED     : " + t5.isLED);
    System.out.println();

    // 6
    TubeLight t6 = new TubeLight();
    t6.intensity = "Ultra Bright";
    t6.watts = 24;
    t6.lightTone = "Crystal White";
    t6.isLED = true;
    System.out.println("Intensity  : " + t6.intensity);
    System.out.println("Watts      : " + t6.watts);
    System.out.println("Light Tone : " + t6.lightTone);
    System.out.println("Is LED     : " + t6.isLED);
    System.out.println();

    t6 = new TubeLight("Ultra Bright", 24, "Crystal White", true);
    System.out.println("Intensity  : " + t6.intensity);
    System.out.println("Watts      : " + t6.watts);
    System.out.println("Light Tone : " + t6.lightTone);
    System.out.println("Is LED     : " + t6.isLED);
    System.out.println();

    // 7
    TubeLight t7 = new TubeLight();
    t7.intensity = "Eco";
    t7.watts = 12;
    t7.lightTone = "Neutral White";
    t7.isLED = false;
    System.out.println("Intensity  : " + t7.intensity);
    System.out.println("Watts      : " + t7.watts);
    System.out.println("Light Tone : " + t7.lightTone);
    System.out.println("Is LED     : " + t7.isLED);
    System.out.println();

    t7 = new TubeLight("Eco", 12, "Neutral White", false);
    System.out.println("Intensity  : " + t7.intensity);
    System.out.println("Watts      : " + t7.watts);
    System.out.println("Light Tone : " + t7.lightTone);
    System.out.println("Is LED     : " + t7.isLED);
    System.out.println();
    }
}

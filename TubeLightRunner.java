class TubeLightRunner {

public static void main(String tube[]) {

    // 1
    TubeLight t1 = new TubeLight();
    t1.brand = "Philips";
    t1.watts = 20;
    t1.color = "Cool White";
    t1.isLED = true;
    System.out.println("Brand : " + t1.brand);
    System.out.println("Watts : " + t1.watts);
    System.out.println("Color : " + t1.color);
    System.out.println("Is LED : " + t1.isLED);
    System.out.println();
	
    t1 = new TubeLight(t1.brand, t1.watts, t1.color, t1.isLED);
	System.out.println("Brand : " + t1.brand);
    System.out.println("Watts : " + t1.watts);
    System.out.println("Color : " + t1.color);
    System.out.println("Is LED : " + t1.isLED);
    System.out.println();

    // 2
    TubeLight t2 = new TubeLight();
    t2.brand = "Syska";
    t2.watts = 18;
    t2.color = "Warm White";
    t2.isLED = true;
    System.out.println("Brand : " + t2.brand);
    System.out.println("Watts : " + t2.watts);
    System.out.println("Color : " + t2.color);
    System.out.println("Is LED : " + t2.isLED);
    System.out.println();
	
    t2 = new TubeLight(t2.brand, t2.watts, t2.color, t2.isLED);
	System.out.println("Brand : " + t2.brand);
    System.out.println("Watts : " + t2.watts);
    System.out.println("Color : " + t2.color);
    System.out.println("Is LED : " + t2.isLED);
    System.out.println();

    // 3
    TubeLight t3 = new TubeLight();
    t3.brand = "Eveready";
    t3.watts = 22;
    t3.color = "Daylight";
    t3.isLED = false;
    System.out.println("Brand : " + t3.brand);
    System.out.println("Watts : " + t3.watts);
    System.out.println("Color : " + t3.color);
    System.out.println("Is LED : " + t3.isLED);
    System.out.println();
	
    t3 = new TubeLight(t3.brand, t3.watts, t3.color, t3.isLED);
	System.out.println("Brand : " + t3.brand);
    System.out.println("Watts : " + t3.watts);
    System.out.println("Color : " + t3.color);
    System.out.println("Is LED : " + t3.isLED);
    System.out.println();

    // 4
    TubeLight t4 = new TubeLight();
    t4.brand = "Wipro";
    t4.watts = 24;
    t4.color = "Natural White";
    t4.isLED = true;
    System.out.println("Brand : " + t4.brand);
    System.out.println("Watts : " + t4.watts);
    System.out.println("Color : " + t4.color);
    System.out.println("Is LED : " + t4.isLED);
    System.out.println();
	
    t4 = new TubeLight(t4.brand, t4.watts, t4.color, t4.isLED);
	System.out.println("Brand : " + t4.brand);
    System.out.println("Watts : " + t4.watts);
    System.out.println("Color : " + t4.color);
    System.out.println("Is LED : " + t4.isLED);
    System.out.println();

    // 5
    TubeLight t5 = new TubeLight();
    t5.brand = "Crompton";
    t5.watts = 16;
    t5.color = "Soft White";
    t5.isLED = false;
    System.out.println("Brand : " + t5.brand);
    System.out.println("Watts : " + t5.watts);
    System.out.println("Color : " + t5.color);
    System.out.println("Is LED : " + t5.isLED);
    System.out.println();
	
    t5 = new TubeLight(t5.brand, t5.watts, t5.color, t5.isLED);
	System.out.println("Brand : " + t5.brand);
    System.out.println("Watts : " + t5.watts);
    System.out.println("Color : " + t5.color);
    System.out.println("Is LED : " + t5.isLED);
    System.out.println();

    // 6
    TubeLight t6 = new TubeLight();
    t6.brand = "Havells";
    t6.watts = 25;
    t6.color = "Cool Daylight";
    t6.isLED = true;
    System.out.println("Brand : " + t6.brand);
    System.out.println("Watts : " + t6.watts);
    System.out.println("Color : " + t6.color);
    System.out.println("Is LED : " + t6.isLED);
    System.out.println();
	
    t6 = new TubeLight(t6.brand, t6.watts, t6.color, t6.isLED);
	System.out.println("Brand : " + t6.brand);
    System.out.println("Watts : " + t6.watts);
    System.out.println("Color : " + t6.color);
    System.out.println("Is LED : " + t6.isLED);
    System.out.println();

    // 7
    TubeLight t7 = new TubeLight();
    t7.brand = "Bajaj";
    t7.watts = 15;
    t7.color = "Yellow";
    t7.isLED = false;
    System.out.println("Brand : " + t7.brand);
    System.out.println("Watts : " + t7.watts);
    System.out.println("Color : " + t7.color);
    System.out.println("Is LED : " + t7.isLED);
    System.out.println();
	
    t7 = new TubeLight(t7.brand, t7.watts, t7.color, t7.isLED);
	System.out.println("Brand : " + t7.brand);
    System.out.println("Watts : " + t7.watts);
    System.out.println("Color : " + t7.color);
    System.out.println("Is LED : " + t7.isLED);
    System.out.println();
    }
}

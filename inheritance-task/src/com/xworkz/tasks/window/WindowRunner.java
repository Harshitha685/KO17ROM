package com.xworkz.tasks.window;

public class WindowRunner {
    public static void main(String[] args) {
        Window window = new Window();
        window.windowType();
        window.windowMaterial();
        window.windowSize();
        window.windowColor();
        window.windowPosition();

        System.out.println("--------------------------");

        Window window2 = new Glass();
        window2.windowType();
        window2.windowMaterial();
        window2.windowSize();
        window2.windowColor();
        window2.windowPosition();

        System.out.println("--------------------------");

        Glass glass = new Glass();
        glass.glassType();
        glass.glassThickness();
        glass.glassTransparency();
        glass.glassSafety();
        glass.glassBrand();

        System.out.println("--------------------------");

        Window window3 = new Glass();
        Glass glass2 = (Glass) window3;
        System.out.println(glass2);
    }
}

package com.xworkz.tasks.window;

public class WindowRunner {

    public static void main(String[] args) {
        Window window = new Window();
        window.openWindow();
        window.closeWindow();

        Glass glass = new Glass();
        glass.openWindow();
        glass.closeWindow();
    }
}

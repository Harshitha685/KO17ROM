package com.xworkz.tasks.app;

public class AppRunner {
    public static void main(String[] args) {
        App app = new App();
        app.appName();
        app.appDetails();

        MusicApp musicApp = new MusicApp();
        musicApp.appName();
        musicApp.appDetails();

        App app1 = new MusicApp();

        MusicApp musicApp1 = (MusicApp) app1;
        System.out.println(musicApp1);
    }
}

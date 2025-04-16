package com.xworkz.tasks.app;

public class AppRunner {
    public static void main(String[] args) {
        App app = new App();
        app.appName();
        app.appDetails();
        app.open();
        app.close();
        app.update();

        App app2 = new MusicApp();
        app2.appName();
        app2.appDetails();
        app2.open();
        app2.close();
        app2.update();

        MusicApp musicApp = new MusicApp();
        musicApp.playSong();
        musicApp.pauseSong();
        musicApp.createPlaylist();
        musicApp.likeSong();
        musicApp.downloadSong();

        App app1 = new MusicApp();

        MusicApp musicApp1 = (MusicApp) app1;
        System.out.println(musicApp1);
    }
}

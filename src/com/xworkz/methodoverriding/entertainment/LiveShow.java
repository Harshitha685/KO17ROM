package com.xworkz.methodoverriding.entertainment;

public class LiveShow extends Entertainment {

    @Override
    public void start() {
        System.out.println("Starting the live show with an opening act.");
    }

    @Override
    public void perform() {
        System.out.println("Performing live music and acts.");
    }

    @Override
    public void pause() {
        System.out.println("Intermission for refreshments.");
    }

    @Override
    public void end() {
        System.out.println("Ending the live show with a final performance.");
    }

    public void meetAndGreet() {
        System.out.println("Meet and greet session with artists.");
    }
}



package com.xworkz.methodoverriding.software;

public class Game extends Software {

    @Override
    public void install() {
        System.out.println("Installing the game.");
    }

    @Override
    public void uninstall() {
        System.out.println("Uninstalling the game.");
    }

    @Override
    public void update() {
        System.out.println("Game: Updating the game.");
    }

    @Override
    public void run() {
        System.out.println("Running the game.");
    }

    public void play() {
        System.out.println("Playing the game.");
    }
}



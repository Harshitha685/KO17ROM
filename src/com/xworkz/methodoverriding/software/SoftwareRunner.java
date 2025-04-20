package com.xworkz.methodoverriding.software;

public class SoftwareRunner {
        public static void main(String[] args) {
            Software software = new Software();
            software.install();
            software.uninstall();
            software.update();
            software.run();
            System.out.println();

            Software gs = new Game();
            gs.install();
            gs.uninstall();
            gs.update();
            gs.run();
            System.out.println();

            Game game = new Game();
            game.install();
            game.uninstall();
            game.update();
            game.run();
            game.play();
        }
    }



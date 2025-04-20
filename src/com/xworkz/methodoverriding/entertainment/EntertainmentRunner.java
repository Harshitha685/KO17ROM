package com.xworkz.methodoverriding.entertainment;

public class EntertainmentRunner {

        public static void main(String[] args) {
            Entertainment entertainment = new Entertainment();
            entertainment.start();
            entertainment.perform();
            entertainment.pause();
            entertainment.end();
            System.out.println();

            Entertainment le = new LiveShow();
            le.start();
            le.pause();
            le.perform();
            le.end();
            System.out.println();

            LiveShow live = new LiveShow();
            live.start();
            live.perform();
            live.pause();
            live.end();
            live.meetAndGreet();
        }
    }



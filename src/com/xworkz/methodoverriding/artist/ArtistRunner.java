package com.xworkz.methodoverriding.artist;

public class ArtistRunner {
        public static void main(String[] args) {

            Artist artist = new Artist();
            artist.artForm();
            artist.perform();
            artist.practice();
            artist.tools();
            System.out.println();

            Artist musician1 = new Musician();
            musician1.artForm();
            musician1.perform();
            musician1.practice();
            musician1.tools();
            System.out.println();

            Musician musician2 = new Musician();
            musician2.artForm();
            musician2.perform();
            musician2.practice();
            musician2.tools();
            musician2.genre();
            musician2.compose();
            musician2.collaborate();
        }
    }



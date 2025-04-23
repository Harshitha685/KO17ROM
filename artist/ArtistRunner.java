package com.xworkz.objectmethodtask.artist;

public class ArtistRunner {

        public static void main(String[] args) {

            ArtistDto artist = new ArtistDto();

            artist.setArtistName("Leonardo da Vinci");
            artist.setArtStyle("Renaissance");
            artist.setYearsOfExperience(40);
            artist.setMediumUsed("Oil Painting");
            artist.setFamous(true);

            System.out.println(artist);
        }
    }



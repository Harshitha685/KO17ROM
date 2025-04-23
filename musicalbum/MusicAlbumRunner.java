package com.xworkz.objectmethodtask.musicalbum;

public class MusicAlbumRunner {

        public static void main(String[] args) {

            MusicAlbumDto album = new MusicAlbumDto();

            album.setAlbumName("Fearless");
            album.setArtistName("Taylor Swift");
            album.setReleaseYear(2008);
            album.setGenre("Country-Pop");
            album.setTrackCount(14);

            System.out.println(album);
        }
    }



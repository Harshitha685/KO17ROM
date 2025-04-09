package com.xworkz.spotifyapp.login;

import com.xworkz.spotifyapp.spotify.SpotifyDto;

public class SpotifyLogIn {
    SpotifyDto dto;

    public boolean tuneIn(SpotifyDto dto) {
        this.dto = dto;
        boolean isLogged = false;

        boolean verified = verifyMelodyDetails(dto);
        if (verified) {
            isLogged = true;
            System.out.println(" Login to your music world successful!");
        } else {
            System.out.println(" Login failed... Please remix your details and try again.");
        }

        return isLogged;
    }

    public boolean verifyMelodyDetails(SpotifyDto dto) {
        boolean isValid = false;

        boolean artistValid = false;
        boolean emailValid = false;
        boolean keyValid = false;
        boolean reKeyValid = false;
        boolean playlistValid = false;
        boolean regionValid = false;

        if (dto.getArtistName() != null && dto.getArtistName().length() >= 3) {
            artistValid = true;
        } else {
            System.out.println(" Invalid Artist Name");
        }

        if (dto.getEmail() != null && dto.getEmail().contains("@")) {
            emailValid = true;
        } else {
            System.out.println(" Invalid Email Address");
        }

        if (dto.getTrackKey() != null && dto.getTrackKey().length() >= 8) {
            keyValid = true;
        } else {
            System.out.println(" Track Key is too weak");
        }

        if (dto.getReEnterKey() != null && dto.getReEnterKey().equals(dto.getTrackKey())) {
            reKeyValid = true;
        } else {
            System.out.println(" Track Keys don't match");
        }

        if (String.valueOf(dto.getPlaylistId()).length() == 10) {
            playlistValid = true;
        } else {
            System.out.println("🎚 Invalid Playlist ID");
        }

        if (dto.getRegion() != null && !dto.getRegion().isEmpty()) {
            regionValid = true;
        } else {
            System.out.println(" Region is not set");
        }

        if (artistValid && emailValid && keyValid && reKeyValid && playlistValid && regionValid) {
            isValid = true;
        }

        return isValid;
    }

    public void getUserDetails(){
        System.out.println("Artist name : "+this.dto.getArtistName());
        System.out.println("Email : "+this.dto.getEmail());
        System.out.println("track key : "+this.dto.getTrackKey());
        System.out.println("reenter key : "+this.dto.getReEnterKey());
        System.out.println("Playlist : "+this.dto.getPlaylistId());
        System.out.println("Region : "+this.dto.getRegion());
    }
}
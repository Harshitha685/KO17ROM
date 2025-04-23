package com.xworkz.objectmethodtask.musicalbum;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MusicAlbumDto {

    private String albumName;
    private String artistName;
    private int releaseYear;
    private String genre;
    private int trackCount;

    @Override
    public String toString() {
        return "MusicAlbumDto = (" +
                "albumName = " + this.albumName + "," +
                "\nartistName = " + this.artistName + "," +
                "\nreleaseYear = " + this.releaseYear + "," +
                "\ngenre = " + this.genre + "," +
                "\ntrackCount = " + this.trackCount + ")";
    }
}



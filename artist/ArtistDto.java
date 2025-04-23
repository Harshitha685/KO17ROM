package com.xworkz.objectmethodtask.artist;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ArtistDto {

    private String artistName;
    private String artStyle;
    private int yearsOfExperience;
    private String mediumUsed;
    private boolean isFamous;

    @Override
    public String toString() {
        return "ArtistDto = (" +
                "artistName = " + this.artistName + "," +
                "\nartStyle = " + this.artStyle + "," +
                "\nyearsOfExperience = " + this.yearsOfExperience + " years," +
                "\nmediumUsed = " + this.mediumUsed + "," +
                "\nisFamous = " + this.isFamous + ")";
    }
}



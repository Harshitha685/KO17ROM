package com.xworkz.objectmethodtask.exhibition;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExhibitionDto {

    private String exhibitionName;
    private String location;
    private String date;
    private String theme;
    private boolean isFreeEntry;

    @Override
    public String toString() {
        return "ExhibitionDto = (" +
                "exhibitionName = " + this.exhibitionName + "," +
                "\nlocation = " + this.location + "," +
                "\ndate = " + this.date + "," +
                "\ntheme = " + this.theme + "," +
                "\nisFreeEntry = " + this.isFreeEntry + ")";
    }
}



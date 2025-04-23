package com.xworkz.objectmethodtask.cinemahall;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CinemaHallDto {

    private String hallName;
    private String location;
    private int seatingCapacity;
    private boolean is3DEnabled;
    private String[] availableMovies;

    @Override
    public String toString() {
        String movies = String.join(", ", availableMovies);
        return "CinemaHallDto = (" +
                "hallName = " + this.hallName + "," +
                "\nlocation = " + this.location + "," +
                "\nseatingCapacity = " + this.seatingCapacity + "," +
                "\nis3DEnabled = " + this.is3DEnabled + "," +
                "\navailableMovies = " + movies + ")";
    }
}



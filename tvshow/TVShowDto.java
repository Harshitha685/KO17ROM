package com.xworkz.objectmethodtask.tvshow;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TVShowDto {

    private String showName;
    private String genre;
    private int seasonsCount;
    private String premiereDate;
    private boolean isOngoing;

    @Override
    public String toString() {
        return "TVShowDto = (" +
                "showName = " + this.showName + "," +
                "\ngenre = " + this.genre + "," +
                "\nseasonsCount = " + this.seasonsCount + "," +
                "\npremiereDate = " + this.premiereDate + "," +
                "\nisOngoing = " + this.isOngoing + ")";
    }
}



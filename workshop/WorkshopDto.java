package com.xworkz.objectmethodtask.workshop;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WorkshopDto {

    private String workshopName;
    private String instructorName;
    private int durationInDays;
    private String topicCovered;
    private boolean isOnline;

    @Override
    public String toString() {
        return "WorkshopDto = (" +
                "workshopName = " + this.workshopName + "," +
                "\ninstructorName = " + this.instructorName + "," +
                "\ndurationInDays = " + this.durationInDays + " days," +
                "\ntopicCovered = " + this.topicCovered + "," +
                "\nisOnline = " + this.isOnline + ")";
    }
}



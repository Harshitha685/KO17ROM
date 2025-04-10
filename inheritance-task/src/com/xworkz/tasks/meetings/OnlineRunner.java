package com.xworkz.tasks.meetings;

public class OnlineRunner {
    public static void main(String[] args) {
        Meetings meetings = new Meetings();
        meetings.meetingName();
        meetings.meetingType();

        OnlineMeetings onlineMeetings = new OnlineMeetings();
        onlineMeetings.meetingName();
        onlineMeetings.meetingType();
    }
}

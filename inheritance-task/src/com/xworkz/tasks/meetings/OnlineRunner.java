package com.xworkz.tasks.meetings;

public class OnlineRunner {
    public static void main(String[] args) {
        Meetings meetings = new Meetings();
        meetings.meetingType();
        meetings.meetingTime();
        meetings.participants();
        meetings.duration();
        meetings.location();

        System.out.println("--------------------------");

        Meetings meetings2 = new OnlineMeetings();
        meetings2.meetingType();
        meetings2.meetingTime();
        meetings2.participants();
        meetings2.duration();
        meetings2.location();

        System.out.println("--------------------------");

        OnlineMeetings online = new OnlineMeetings();
        online.platformUsed();
        online.meetingLink();
        online.screenSharing();
        online.recordingStatus();
        online.internetRequired();

        System.out.println("--------------------------");

        Meetings meetings3 = new OnlineMeetings();
        OnlineMeetings online1 = (OnlineMeetings) meetings3;
        System.out.println(online1);
    }
}

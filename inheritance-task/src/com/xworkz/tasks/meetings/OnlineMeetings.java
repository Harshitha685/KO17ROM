package com.xworkz.tasks.meetings;

public class OnlineMeetings extends Meetings {
    public void platformUsed() {
        System.out.println("Platform: Zoom");
    }

    public void meetingLink() {
        System.out.println("Link: https://zoom.us/abc123");
    }

    public void screenSharing() {
        System.out.println("Screen sharing enabled");
    }

    public void recordingStatus() {
        System.out.println("Recording started");
    }

    public void internetRequired() {
        System.out.println("Internet required: Yes");
    }
}

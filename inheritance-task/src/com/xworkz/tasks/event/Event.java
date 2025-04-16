package com.xworkz.tasks.event;

public class Event {
    public void scheduleEvent(){
        System.out.println("Event is scheduled from tomorrow");
    }

    public void sendInvitations(){
        System.out.println("Invitations are sent");
    }
    public void organizeEvent() {
        System.out.println("Event: Organizing the event and preparing logistics.");
    }

    public void registerAttendees() {
        System.out.println("Event: Registering attendees for the event.");
    }

    public void closeEvent() {
        System.out.println("Event: Closing the event and gathering feedback.");
    }
}

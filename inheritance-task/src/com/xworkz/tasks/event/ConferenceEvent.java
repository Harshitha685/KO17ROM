package com.xworkz.tasks.event;

public class ConferenceEvent extends Event {
    public void conductEvent() {
        System.out.println("ConferenceEvent: Conducting the conference, ensuring sessions run on time.");
    }

    public void networkEvent() {
        System.out.println("ConferenceEvent: Organizing networking sessions for attendees to interact.");
    }

    public void scheduleSessions() {
        System.out.println("ConferenceEvent: Scheduling keynote speeches, panel discussions, and workshops.");
    }

    public void manageEvent() {
        System.out.println("ConferenceEvent: Managing the tasks");
    }

    public void eventRegistered()

    {
        System.out.println("ConferenceEvent:is registered");
    }
}

package com.xworkz.tasks.event;

public class EventRunner
{
    public static void main(String[] args) {
        Event event = new Event();
        event.scheduleEvent();
        event.sendInvitations();

        ConferenceEvent conferenceEvent = new ConferenceEvent();
        conferenceEvent.scheduleEvent();
        conferenceEvent.sendInvitations();
    }
}

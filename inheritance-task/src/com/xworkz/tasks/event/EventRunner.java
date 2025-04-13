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

        Event event1 = new ConferenceEvent();

        ConferenceEvent conferenceEvent1 = (ConferenceEvent) event1;
        System.out.println(conferenceEvent1);
    }
}

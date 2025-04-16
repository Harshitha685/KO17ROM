package com.xworkz.tasks.event;

public class EventRunner
{
    public static void main(String[] args) {
        Event event = new Event();
        event.scheduleEvent();
        event.sendInvitations();
        event.organizeEvent();
        event.registerAttendees();
        event.closeEvent();

        Event event2 = new ConferenceEvent();
        event2.scheduleEvent();
        event2.sendInvitations();
        event2.organizeEvent();
        event2.registerAttendees();
        event2.closeEvent();

        ConferenceEvent conferenceEvent = new ConferenceEvent();
        conferenceEvent.conductEvent();
        conferenceEvent.networkEvent();
        conferenceEvent.scheduleSessions();
        conferenceEvent.eventRegistered();
        conferenceEvent.manageEvent();

        Event event1 = new ConferenceEvent();

        ConferenceEvent conferenceEvent1 = (ConferenceEvent) event1;
        System.out.println(conferenceEvent1);
    }
}

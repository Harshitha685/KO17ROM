package com.xworkz.tasks.transport;

public class TransportRunner {
    public static void main(String[] args) {
        Transport transport = new Transport();
        transport.transportType();
        transport.transportMode();
        transport.transportSpeed();
        transport.transportFare();
        transport.transportDistance();

        System.out.println("--------------------------");

        Transport transport2 = new Flight();
        transport2.transportType();
        transport2.transportMode();
        transport2.transportSpeed();
        transport2.transportFare();
        transport2.transportDistance();

        System.out.println("--------------------------");

        Flight flight = new Flight();
        flight.flightType();
        flight.flightAirline();
        flight.flightDuration();
        flight.flightFare();
        flight.flightSeatClass();

        System.out.println("--------------------------");

        Transport transport3 = new Flight();
        Flight flight2 = (Flight) transport3;
        System.out.println(flight2);
    }
}

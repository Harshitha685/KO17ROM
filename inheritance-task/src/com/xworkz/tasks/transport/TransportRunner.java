package com.xworkz.tasks.transport;

public class TransportRunner {
    public static void main(String[] args) {
        Transport transport = new Transport();
        transport.displayFlightDetails();
        transport.getTransportInfo();

        Flight flight = new Flight();
        flight.getTransportInfo();
        flight.displayFlightDetails();

        Transport transport1 = new Flight();

        Flight flight1 = (Flight) transport1;
        System.out.println(flight1);
    }
}

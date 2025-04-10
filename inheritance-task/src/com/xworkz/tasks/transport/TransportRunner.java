package com.xworkz.tasks.transport;

public class TransportRunner {
    public static void main(String[] args) {
        Transport transport = new Transport();
        transport.displayFlightDetails();
        transport.getTransportInfo();

        Flight flight = new Flight();
        flight.getTransportInfo();
        flight.displayFlightDetails();
    }
}

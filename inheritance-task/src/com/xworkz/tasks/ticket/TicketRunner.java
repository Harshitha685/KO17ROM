package com.xworkz.tasks.ticket;

public class TicketRunner {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        ticket.ticketDetails();
        ticket.isProviding();

        Online online = new Online();
        online.ticketDetails();
        online.isProviding();

        Ticket ticket1 = new Online();

        Online online1 = (Online) ticket1;
        System.out.println(online1);
    }
}

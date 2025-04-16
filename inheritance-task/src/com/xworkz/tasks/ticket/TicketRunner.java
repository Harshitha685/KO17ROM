package com.xworkz.tasks.ticket;

public class TicketRunner {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        ticket.ticketType();
        ticket.ticketPrice();
        ticket.ticketDate();
        ticket.ticketTime();
        ticket.ticketStatus();

        System.out.println("--------------------------");

        Ticket ticket2 = new Online();
        ticket2.ticketType();
        ticket2.ticketPrice();
        ticket2.ticketDate();
        ticket2.ticketTime();
        ticket2.ticketStatus();

        System.out.println("--------------------------");

       Online onlineTicket = new Online();
        onlineTicket.websiteName();
        onlineTicket.paymentStatus();
        onlineTicket.ticketDownloadLink();
        onlineTicket.isEticket();
        onlineTicket.showLocation();

        System.out.println("--------------------------");

        Ticket ticket3 = new Online();
        Online onlineTicket2 = (Online) ticket3;
        System.out.println(onlineTicket2);
    }
}

package com.rgoewedky.learning.structural.facade;

public class BookingFacade {

    private static int totalTickets = 5;

    public String bookTicket() {
        if (totalTickets <= 0) {
            return "No tickets are available";
        }

        System.out.println("Tickets are available. Booking");
        System.out.println("Doing Payment");
        System.out.println("Payment Done");
        System.out.println("Collecting Ticket");
        String ticketNumber = "ticket-" + totalTickets;

        System.out.println("Ticket Collected");
        totalTickets--;
        return ticketNumber;
    }
}

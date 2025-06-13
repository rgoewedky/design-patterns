package com.rgoewedky.learning.structural.facade;

import com.rgoewedky.Runner;

public class FacadeRunner extends Runner {
    private static final String name = "FACADE";

    public FacadeRunner() {
        super(name);
    }

    @Override
    protected void run() {
        /* w/o facade
         *
         * bookTicket
         *
         *
         * 1. check availability of ticket - booking service
         * 2. do payment - payment service
         * 3. collect ticket - booking service
         *
         * here client needs to call multiple services to fulfill the request
         *
         * */


        /*
         *
         * with facade
         *
         *
         * 1. bookTicket
         *
         * here client simply calls bookTicket and facade layer taker care of calling
         * sub services logic
         * */

        BookingFacade bookingFacade = new BookingFacade();
        System.out.println(bookingFacade.bookTicket());

    }
}

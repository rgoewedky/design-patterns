package com.rgoewedky.strategy;

import com.rgoewedky.Runner;

public class StrategyRunner extends Runner {

    private static final String name = "STRATEGY";

    public StrategyRunner() {
        super(name);
    }

    @Override
    public void run() {

        /*
        Payment payment = new Payment();

        // set credit card payment strategy
        payment.setPaymentStrategy(new CreditCardPaymentStrategy());

        // do the payment
        payment.pay(100);

        payment.setPaymentStrategy(new GPayPaymentStrategy());

        payment.pay(120);

        payment.setPaymentStrategy(new PhonePePaymentStrategy());

        payment.pay(130); // should print `Paying amount 130 using PHONEPE`

        payment.setPaymentStrategy(new CredPaymentStrategy());

        payment.pay(150); // should print `Paying amount 150 using CRED`

         */
    }
}

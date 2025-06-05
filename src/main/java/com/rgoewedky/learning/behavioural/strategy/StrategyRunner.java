package com.rgoewedky.learning.behavioural.strategy;

import com.rgoewedky.Runner;

public class StrategyRunner extends Runner {

    private static final String name = "STRATEGY";

    public StrategyRunner() {
        super(name);
    }

    @Override
    public void run() {

        Cart cart = new Cart();

        // set credit card payment strategy
        cart.setPaymentStrategy(new CreditCardPaymentStrategy());

        // do the payment
        cart.pay(100);

        cart.setPaymentStrategy(new GPayPaymentStrategy());

        cart.pay(120);

        cart.setPaymentStrategy(new PhonePePaymentStrategy());

        cart.pay(130); // should print `Paying amount 130 using PHONEPE`

        cart.setPaymentStrategy(new CredPaymentStrategy());

        cart.pay(150); // should print `Paying amount 150 using CRED`
    }
}

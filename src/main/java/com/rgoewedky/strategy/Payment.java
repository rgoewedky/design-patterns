package com.rgoewedky.strategy;

public class Payment {

    private IPaymentStrategy paymentStrategy;

    public Payment() {

    }

    public Payment(IPaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setPaymentStrategy(IPaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(int amount) {
        this.paymentStrategy.pay(amount);
    }

}

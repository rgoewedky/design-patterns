package com.rgoewedky.learning.behavioural.strategy;

public class Cart {

    private IPaymentStrategy paymentStrategy;

    public Cart() {

    }

    public Cart(IPaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setPaymentStrategy(IPaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(int amount) {
        this.paymentStrategy.pay(amount);
    }

}

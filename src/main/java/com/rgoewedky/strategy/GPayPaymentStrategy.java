package com.rgoewedky.strategy;

public class GPayPaymentStrategy implements IPaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paying amount " + amount + " using " + PaymentStrategyEnum.GPAY);
    }
}

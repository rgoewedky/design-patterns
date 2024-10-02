package com.rgoewedky.strategy;

public class CreditCardPaymentStrategy implements IPaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paying amount " + amount + " using " + PaymentStrategyEnum.CREDIT_CARD);
    }
}

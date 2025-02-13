package com.rgoewedky.strategy;

public class DebitCardPaymentStrategy implements IPaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paying amount " + amount + " using " + PaymentStrategyEnum.DEBIT_CARD);
    }
}

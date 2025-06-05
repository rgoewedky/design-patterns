package com.rgoewedky.learning.behavioural.strategy;

public class PhonePePaymentStrategy implements IPaymentStrategy{

    @Override
    public void pay(int amount) {
        System.out.println("Paying amount " + amount + " using " + PaymentStrategyEnum.PHONEPE);
    }
}

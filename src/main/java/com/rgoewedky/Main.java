package com.rgoewedky;

import com.rgoewedky.behavioural.strategy.StrategyRunner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Design Patterns");

        Runner runner = new StrategyRunner();
        runner.run();
    }
}
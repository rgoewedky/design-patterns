package com.rgoewedky;

public abstract class Runner {
    public Runner(String name) {
        System.out.println("=======================");
        System.out.println("Pattern: "+ name);
        System.out.println("=======================");
    }
    protected abstract void run();
}

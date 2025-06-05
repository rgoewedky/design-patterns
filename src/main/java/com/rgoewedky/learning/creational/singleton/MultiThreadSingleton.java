package com.rgoewedky.learning.creational.singleton;

public class MultiThreadSingleton {

    private static volatile MultiThreadSingleton instance;

    private MultiThreadSingleton() {
        System.out.println("A new thread-safe singleton instance is created");
    }

    public static MultiThreadSingleton getInstance() {
        if (instance == null) { // 1. this check is to ensure performance w/o synchronize overhead
            synchronized (MultiThreadSingleton.class) {
                if(instance == null) { // 2. this check is to ensure only one instance is created
                    instance = new MultiThreadSingleton();
                }
            }
        }
        return instance;
    }
}

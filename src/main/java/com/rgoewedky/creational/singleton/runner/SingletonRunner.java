package com.rgoewedky.creational.singleton.runner;

import com.rgoewedky.Runner;
import com.rgoewedky.creational.singleton.Singleton;

public class SingletonRunner extends Runner {
    private static final String name = "SINGLETON";

    public SingletonRunner() {
        super(name);
    }

    @Override
    public void run() {
        // Basic singleton in single thread
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println("Two instance are pointing to same object: " + instance1.equals(instance2));
    }
}

package com.rgoewedky.creational.singleton;

import com.rgoewedky.Runner;

public class SingletonRunner implements Runner {
    public SingletonRunner() {
        System.out.println("=======================");
        System.out.println("Pattern: Singleton");
        System.out.println("=======================");
    }

    @Override
    public void run() {
        // Basic singleton in single thread
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println("Two instance are pointing to same object: "+instance1.equals(instance2));

        // Singleton with multithreading
        Runnable task = () -> {
            Singleton instance = Singleton.getInstance();
            System.out.println(Thread.currentThread().getName() + " - Instance HashCode: " + instance.hashCode());
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);
        Thread t4 = new Thread(task);
        Thread t5 = new Thread(task);
        Thread t6 = new Thread(task);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();

    }
}

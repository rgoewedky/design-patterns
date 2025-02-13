package com.rgoewedky.creational.singleton.runner;

import com.rgoewedky.Runner;
import com.rgoewedky.creational.singleton.MultiThreadSingleton;

public class MultiThreadSingletonRunner extends Runner {
    private static final String name = "MULTI_THREAD_SINGLETON";

    public MultiThreadSingletonRunner() {
        super(name);
    }

    @Override
    public void run() {
        // Singleton with multithreading
        Runnable task = () -> {
            // make this singleton multithreaded
            MultiThreadSingleton instance = MultiThreadSingleton.getInstance();
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

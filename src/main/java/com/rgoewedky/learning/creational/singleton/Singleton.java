package com.rgoewedky.creational.singleton;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
        System.out.println("A new instance is created");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}





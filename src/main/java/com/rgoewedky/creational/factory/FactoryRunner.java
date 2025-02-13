package com.rgoewedky.creational.factory;

import com.rgoewedky.Runner;

public class FactoryRunner extends Runner {
    private static final String name = "FACTORY";

    public FactoryRunner() {
        super(name);
    }

    @Override
    public void run() {
        Factory factory = new Factory();
        try {

            System.out.println(factory.getDocumentByType("word"));
        }catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}

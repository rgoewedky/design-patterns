package com.rgoewedky.learning.creational.factory;

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
            Document document = factory.getDocumentByType("pdf");
            System.out.println("Document is of Type: "+ document.type);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}

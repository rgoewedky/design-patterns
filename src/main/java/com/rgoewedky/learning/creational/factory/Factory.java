package com.rgoewedky.creational.factory;

import java.util.HashMap;
import java.util.Map;

public class Factory {
    private static final Map<String, Class<? extends Document>> documentMap = new HashMap<>();

    static {
        registerDocument("pdf", PdfDocument.class);
        registerDocument("word", WordDocument.class);
        registerDocument("excel", ExcelDocument.class);
    }

    public static void registerDocument(String type, Class<? extends Document> documentClass) {
        documentMap.put(type, documentClass);
    }

    public Document getDocumentByType(String type) {
        Class<? extends Document> documentClass = documentMap.get(type);
        if (documentClass != null) {
            try {
                return documentClass.getDeclaredConstructor().newInstance();
            } catch (Exception e) {
                throw new IllegalArgumentException("Error creating document of type: " + type, e);
            }
        } else {
            throw new IllegalArgumentException("This document type is not available in factory");
        }
    }
}


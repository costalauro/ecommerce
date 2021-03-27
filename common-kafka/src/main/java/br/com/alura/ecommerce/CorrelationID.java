package br.com.alura.ecommerce;

import java.util.UUID;

public class CorrelationID {

    private final String id;

    CorrelationID(String title){
        id = title + "(" + UUID.randomUUID().toString() + ")";
    }

    @Override
    public String toString() {
        return "CorrelationID{" +
                "id='" + id + '\'' +
                '}';
    }

    public CorrelationID continueWith(String title) {
        return  new CorrelationID(id + "-" + title);
    }
}

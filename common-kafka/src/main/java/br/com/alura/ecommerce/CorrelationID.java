package br.com.alura.ecommerce;

import java.util.UUID;

public class CorrelationID {

    private final String id;

    CorrelationID(){
        id = UUID.randomUUID().toString();
    }

    @Override
    public String toString() {
        return "CorrelationID{" +
                "id='" + id + '\'' +
                '}';
    }
}

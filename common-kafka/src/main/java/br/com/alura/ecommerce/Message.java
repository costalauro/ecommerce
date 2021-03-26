package br.com.alura.ecommerce;

public class Message<T> {

    private final CorrelationID id;
    private final T payload;

    Message(CorrelationID id, T Payload){
        this.id = id;
        this.payload = Payload;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", payload=" + payload +
                '}';
    }

    public T getPayload() {
        return payload;
    }

    public CorrelationID getId() {
        return id;
    }
}

package com.iblog.pattern.observe;

public class Order {
    public String id;
    public Status status;

    public enum Status {
        RECEIVED,
        AWAIT_PAYMENT,
        PAYMENT_RECEIVED,
        PROCESSING,
        EXCEPTION,
        SHIPPED,
        DELIVERED
    }
}

package com.iblog.pattern.observe;

public class Event {
    public final Order order;
    public final Order.Status preStatus;
    public final String message;

    public Event(Order order, Order.Status preStatus, String message) {
        this.order = order;
        this.preStatus = preStatus;
        this.message = message;
    }
}

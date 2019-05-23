package com.iblog.pattern.observe;

import java.util.ArrayList;
import java.util.List;

public class OrderUpdateManager {
    private final List<Observer> observers = new ArrayList<>();
    private final Notifier notifier;

    public OrderUpdateManager() {
        this.notifier = new Notifier(observers);
    }

    public void register(Observer observer) {
        synchronized (observers) {
            observers.add(observer);
        }
    }

    public void unregister(Observer observer) {
        synchronized (observers) {
            observers.remove(observer);
        }
    }

    public void awaitpaidOrder(Order order) {
        notifier.notify(order, Order.Status.AWAIT_PAYMENT, "paid order");
    }

    public void receivedOrder(Order order) {
        notifier.notify(order, Order.Status.RECEIVED, "await payment");
    }

    public void paidOrder(Order order) {
        notifier.notify(order, Order.Status.PAYMENT_RECEIVED, "will process order");
    }

    public void delivered(Order order) {
        notifier.notify(order, Order.Status.SHIPPED, "delivered");
    }
}

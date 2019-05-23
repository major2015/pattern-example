package com.iblog.pattern.observe;

import java.util.List;

public class Notifier {
    private final List<Observer> observers;

    public Notifier(List<Observer> observers) {
        this.observers = observers;
    }

    public void notify(Order order, Order.Status preStatus, String subject) {
        for (Observer o : observers) {
            o.observe(new Event(order, preStatus, subject));
        }
    }
}

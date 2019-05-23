package com.iblog.pattern.observe;

public class DeliveredObserver implements Observer {
    @Override
    public void observe(Event event) {
        if (event.preStatus != Order.Status.SHIPPED) {
            return;
        }
        System.out.println("order is delivered, notify use to check the package");
    }
}

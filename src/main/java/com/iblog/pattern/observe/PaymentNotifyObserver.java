package com.iblog.pattern.observe;

public class PaymentNotifyObserver implements Observer {
    @Override
    public void observe(Event event) {
        if (event.preStatus != Order.Status.RECEIVED) {
            return;
        }
        System.out.println("notify the order owner to pay for order");
    }
}

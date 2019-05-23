package com.iblog.pattern.observe;

public class ReceivedPaymentObserver implements Observer {
    @Override
    public void observe(Event event) {
        if (event.preStatus != Order.Status.PAYMENT_RECEIVED) {
            return;
        }
        System.out.println("received the payment of order, notify to process the order");
    }
}

package com.iblog.pattern.observe;

public class PaidFinalsObserver implements Observer {
    @Override
    public void observe(Event event) {
        if (event.preStatus != Order.Status.AWAIT_PAYMENT) {
            return;
        }
        System.out.println("user paid for order, notify finals to check bill");
    }
}

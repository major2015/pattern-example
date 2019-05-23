package com.iblog.pattern.observe;

public class PaidFinalsObserver implements Observer {
    @Override
    public void observe(Event event) {
        System.out.println("user paid for order, notify finals to calculate te money");
    }
}

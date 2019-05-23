package com.iblog.pattern.observe;

import java.util.List;

public class OrderUpdateManager {
    private final Notifier notifier;

    public OrderUpdateManager(Notifier notifier) {
        this.notifier = notifier;
    }


}

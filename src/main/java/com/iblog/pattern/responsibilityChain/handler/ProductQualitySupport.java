package com.iblog.pattern.responsibilityChain.handler;

import com.iblog.pattern.responsibilityChain.Category;
import com.iblog.pattern.responsibilityChain.ServiceExchange;

public class ProductQualitySupport implements ServiceHandler {
    private final ServiceHandler next;

    public ProductQualitySupport(ServiceHandler next) {
        this.next = next;
    }

    @Override
    public void handle(ServiceExchange exchange) {
        if (exchange.getService().getCategory() == Category.PRODUCT_QUALITY) {
            exchange.getSolution().setSolved(true);
            exchange.getSolution().setSulvedBy(this.getClass().getSimpleName());
            return;
        }
        if (next != null) {
            next.handle(exchange);
        } else {
            throw new IllegalArgumentException("No handler found for " + exchange.getService().getId());
        }
    }
}

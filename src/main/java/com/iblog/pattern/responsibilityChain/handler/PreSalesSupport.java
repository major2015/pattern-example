package com.iblog.pattern.responsibilityChain.handler;

import com.iblog.pattern.responsibilityChain.Category;
import com.iblog.pattern.responsibilityChain.ServiceExchange;

public class PreSalesSupport implements ServiceHandler {
    private final ServiceHandler next;

    public PreSalesSupport(ServiceHandler next) {
        this.next = next;;
    }

    @Override
    public void handle(ServiceExchange exchange) {
        if (exchange.getService().getCategory() == Category.PRE_SALES_PRODUCT_CONSULTATION) {
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

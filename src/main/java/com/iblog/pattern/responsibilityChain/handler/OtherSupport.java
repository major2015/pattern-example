package com.iblog.pattern.responsibilityChain.handler;

import com.iblog.pattern.responsibilityChain.Category;
import com.iblog.pattern.responsibilityChain.ServiceExchange;

/**
 * End of responsibility chain.
 */
public class OtherSupport implements ServiceHandler {

    @Override
    public void handle(ServiceExchange exchange) {
        if (exchange.getService().getCategory() == Category.OTHER) {
            exchange.getSolution().setSolved(true);
            exchange.getSolution().setSulvedBy(this.getClass().getSimpleName());
        } else {
            throw new IllegalArgumentException("No handler found for " + exchange.getService().getId());
        }
    }
}

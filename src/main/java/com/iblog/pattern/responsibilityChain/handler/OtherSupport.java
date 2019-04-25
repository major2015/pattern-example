package com.iblog.pattern.responsibilityChain.handler;

import com.iblog.pattern.responsibilityChain.ServiceExchange;

/**
 * End of responsibility chain.
 */
public class OtherSupport implements ServiceHandler {

    @Override
    public void handle(ServiceExchange exchange) {
        // handle other categories exclude null
        if (exchange.getService().getCategory() == null) {
            throw new IllegalArgumentException("Invalid Service "
                    + exchange.getService().getId()
                    + " that missing category");
        }
        exchange.getSolution().setSolved(true);
        exchange.getSolution().setSulvedBy(this.getClass().getSimpleName());
    }
}

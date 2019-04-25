package com.iblog.pattern.responsibilityChain.handler;

import com.iblog.pattern.responsibilityChain.ServiceExchange;

/**
 * The support endpoint.
 */
public class ServiceSupport implements ServiceHandler {
    private final ServiceHandler handler;

    public ServiceSupport(ServiceHandler handler) {
        this.handler = handler;
    }

    @Override
    public void handle(ServiceExchange exchange) {
        this.handler.handle(exchange);
    }
}

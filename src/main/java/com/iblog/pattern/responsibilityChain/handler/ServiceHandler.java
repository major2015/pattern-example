package com.iblog.pattern.responsibilityChain.handler;

import com.iblog.pattern.responsibilityChain.ServiceExchange;

/**
 * The interface that handle ServiceExchange
 */
public interface ServiceHandler {
    void handle(ServiceExchange exchange);
}

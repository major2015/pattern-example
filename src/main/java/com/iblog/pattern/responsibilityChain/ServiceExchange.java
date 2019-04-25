package com.iblog.pattern.responsibilityChain;

/**
 * Wrapper the builder of service and solution in this class.
 */
public class ServiceExchange {
    private final Service service;
    private final Solution.Builder solution;

    public ServiceExchange(Service service, Solution.Builder solution) {
        this.service = service;
        this.solution = solution;
    }

    public Service getService() {
        return service;
    }

    public Solution.Builder getSolution() {
        return solution;
    }
}

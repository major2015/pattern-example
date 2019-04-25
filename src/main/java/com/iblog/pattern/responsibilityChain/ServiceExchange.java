package com.iblog.pattern.responsibilityChain;

public class ServiceExchange {
    private Service service;
    private Solution solution;

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Solution getSolution() {
        return solution;
    }

    public void setSolution(Solution solution) {
        this.solution = solution;
    }
}

package com.iblog.pattern.mediator;

public abstract class Flight {
    private String flightNumber;
    private IControl control;

    public Flight(String flightNumber, IControl control) {
        this.flightNumber = flightNumber;
        this.control = control;
    }

    public abstract boolean loading();

    public IControl getControl() {
        return control;
    }

    public String getFlightNumber() {
        return flightNumber;
    }
}

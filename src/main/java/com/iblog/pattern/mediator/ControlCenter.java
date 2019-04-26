package com.iblog.pattern.mediator;

import java.util.HashMap;
import java.util.Map;

public class ControlCenter implements IControl {
    private Map<Integer, Runway> runways = new HashMap<>();

    @Override
    public int loading() {
        Runway runway = runways.values().stream()
                .filter(r -> !r.isOccupied())
                .findAny()
                .orElse(null);
        if (runway != null) {
            return runway.getNumber();
        } else {
            // No idle runway.
            return -1;
        }
    }

    @Override
    public void add(Runway runway) {
        runways.put(runway.getNumber(), runway);
    }
}

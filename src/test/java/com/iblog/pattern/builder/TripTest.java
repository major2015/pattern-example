package com.iblog.pattern.builder;

import org.junit.Test;

import static org.junit.Assert.*;

public class TripTest {

    @Test
    public void testTripBuilder() {
        Trip.Builder builder = new Trip.Builder();
        builder.setId("1")
                .setOwner("lance")
                .setDeparture("wuhan")
                .setDestination("shanghai");
        Trip trip = builder.build();

        assertEquals("1", trip.getId());
        assertEquals("lance", trip.getOwner());
        assertEquals("wuhan", trip.getDeparture());
        assertEquals("shanghai", trip.getDestination());
        assertEquals(0, trip.getAmount());
        assertNull(trip.getCreatedBy());
    }

}
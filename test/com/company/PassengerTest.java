package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {
    private Location startLocation;
    private Location endLocation;

    @BeforeEach
    void setUp() {
        startLocation = new Location(1,2);
        endLocation = new Location(5, 6);
    }

    @Test
    void pickupAndDestinationShouldAllowDifferentLocations() {
        assertDoesNotThrow(() -> {
            Passenger p = new Passenger(startLocation, endLocation);
        });
    }

    @Test
    void pickupAndDestinationShouldNotAllowSameLocation() {
        Exception e = assertThrows(InvalidDestinationException.class, () -> {
            Passenger p = new Passenger(startLocation, startLocation);
        });
        assertEquals(e.getMessage(), "Pickup and destination cannot be the same location");
    }
}
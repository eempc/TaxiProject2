package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocationTest {

    @Test
    void coordsShouldNotBeNegative() {
        assertThrows(Exception.class, () -> {
            Location l = new Location(-1, -2);
        });
    }
}
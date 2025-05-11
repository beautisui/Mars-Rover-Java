package com.tw.step.models;

import org.junit.jupiter.api.Test;
import static com.tw.step.models.Direction.*;
import static org.junit.jupiter.api.Assertions.*;

class RoverTest {
    @Test
    void shouldTurnLeftFromNorth() {
        Rover rover = new Rover(0, 0, Direction.NORTH);
        rover.turnLeft();
        assertEquals(WEST, rover.getDirection());
    }
}
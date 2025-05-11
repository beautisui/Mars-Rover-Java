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

    @Test
    void shouldTurnRightToEast() {
        Rover rover = new Rover(0, 0, Direction.NORTH);
        rover.turnRight();
        assertEquals(EAST, rover.getDirection());
    }

    @Test
    void shouldTurnRightFromWest() {
        Rover rover = new Rover(0, 0, Direction.WEST);
        rover.turnRight();
        assertEquals(NORTH, rover.getDirection());
    }

    @Test
    void shouldTurnRightFromEast() {
        Rover rover = new Rover(0, 0, Direction.EAST);
        rover.turnRight();
        assertEquals(SOUTH, rover.getDirection());
    }
}
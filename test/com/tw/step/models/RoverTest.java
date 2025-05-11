package com.tw.step.models;

import org.junit.jupiter.api.Test;

import static com.tw.step.models.Direction.*;
import static org.junit.jupiter.api.Assertions.*;

class RoverTest {
    @Test
    void shouldTurnLeftFromNorth() {
        Rover rover = new Rover(0, 0, Direction.NORTH);
        rover.turnLeft();
        assertEquals(Direction.WEST, rover.getDirection());
    }

    @Test
    void shouldTurnRightFromNorth() {
        Rover rover = new Rover(0, 0, Direction.NORTH);
        rover.turnRight();
        assertEquals(Direction.EAST, rover.getDirection());
    }

    @Test
    void shouldMoveForwardWhenFacingNorth() {
        Rover rover = new Rover(0, 0, Direction.NORTH);
        rover.moveForward();
        assertEquals(0, rover.getX());
        assertEquals(1, rover.getY());
    }

    @Test
    void shouldMoveForwardWhenFacingEast() {
        Rover rover = new Rover(0, 0, Direction.EAST);
        rover.moveForward();
        assertEquals(1, rover.getX());
        assertEquals(0, rover.getY());
    }

    @Test
    void shouldMoveForwardWhenFacingSouth() {
        Rover rover = new Rover(0, 1, Direction.SOUTH);
        rover.moveForward();
        assertEquals(0, rover.getX());
        assertEquals(0, rover.getY());
    }

    @Test
    void shouldMoveForwardWhenFacingWest() {
        Rover rover = new Rover(1, 0, Direction.WEST);
        rover.moveForward();
        assertEquals(0, rover.getX());
        assertEquals(0, rover.getY());
    }


    @Test
    void shouldFollowInstructions() {
        Rover rover = new Rover(1, 2, Direction.NORTH);
        rover.processInstructions("LMLMLMLMM");
        assertEquals(1, rover.getX());
        assertEquals(3, rover.getY());
        assertEquals(Direction.NORTH, rover.getDirection());
    }
}
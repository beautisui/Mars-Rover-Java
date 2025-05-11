package com.tw.step.models;

public class Rover {
    private final int x;
    private final int y;
    private final Direction direction;

    public Rover(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void turnLeft() {
    }

    public Direction getDirection() {
        return Direction.WEST;
    }
}

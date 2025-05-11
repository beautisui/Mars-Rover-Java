package com.tw.step.models;

public enum Direction {
    EAST, WEST, NORTH, SOUTH;

    public Direction turnLeft() {
        switch (this) {
            case NORTH:
                return WEST;
            case EAST:
                return NORTH;
            case SOUTH:
                return EAST;
            case WEST:
                return SOUTH;
        }
        return this;
    }


    public Direction turnRight() {
        switch (this) {
            case NORTH:
                return EAST;
            case EAST:
                return SOUTH;
            case SOUTH:
                return WEST;
            case WEST:
                return NORTH;
        }
        return this;
    }
}

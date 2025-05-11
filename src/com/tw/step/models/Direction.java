package com.tw.step.models;

public enum Direction {
    NORTH, EAST, SOUTH, WEST;

    public Direction turnLeft() {
        switch (this) {
            case NORTH: return WEST;
            case EAST: return NORTH;
            case SOUTH: return EAST;
            case WEST: return SOUTH;
            default: throw new IllegalStateException("Unexpected value: " + this);
        }
    }

    public Direction turnRight() {
        switch (this) {
            case NORTH: return EAST;
            case EAST: return SOUTH;
            case SOUTH: return WEST;
            case WEST: return NORTH;
            default: throw new IllegalStateException("Unexpected value: " + this);
        }
    }

    public Position move(Position position) {
        switch (this) {
            case NORTH: return new Position(position.getX(), position.getY() + 1);
            case SOUTH: return new Position(position.getX(), position.getY() - 1);
            case EAST: return new Position(position.getX() + 1, position.getY());
            case WEST: return new Position(position.getX() - 1, position.getY());
            default: throw new IllegalStateException("Unexpected value: " + this);
        }
    }
}

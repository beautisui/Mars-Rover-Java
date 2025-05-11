package com.tw.step.models;

public class Rover {
    private int x;
    private int y;
    private Direction direction;

    public Rover(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void turnLeft() {
        this.direction = this.direction.turnLeft();
    }

    public void turnRight() {
        this.direction = this.direction.turnRight();
    }

    public Direction getDirection() {
        return this.direction;
    }


    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void moveForward() {
        Position newPosition = direction.move(new Position(this.x, this.y));
        this.x = newPosition.getX();
        this.y = newPosition.getY();
    }

}

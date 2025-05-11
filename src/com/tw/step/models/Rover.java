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

    public void processInstructions(String instructions) {
        for (char instruction : instructions.toCharArray()) {
            if (instruction == 'L') {
                turnLeft();
            } else if (instruction == 'R') {
                turnRight();
            } else if(instruction == 'M') {
                moveForward();
            }
        }
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public void moveForward() {
        Position newPosition = direction.move(new Position(x, y));
        this.x = newPosition.getX();
        this.y = newPosition.getY();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Direction getDirection() {
        return direction;
    }
}


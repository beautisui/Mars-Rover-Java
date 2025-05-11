package com.tw.step;

import com.tw.step.models.Direction;
import com.tw.step.models.Rover;

public class Main {
    public static void main(String[] args) {
        Direction direction = Direction.valueOf("NORTH");

        Rover rover = new Rover(1, 2, direction);
        rover.processInstructions("LMLMLMLMM");

        System.out.println(rover.getX() + " " + rover.getY() + " " + rover.getDirection());
    }
}


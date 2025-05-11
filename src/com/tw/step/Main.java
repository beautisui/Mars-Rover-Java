package com.tw.step;

import com.tw.step.models.Direction;
import com.tw.step.models.Rover;

import java.io.Console;

public class Main {
    public static void main(String[] args) {
        Console console = System.console();

        if (console == null) {
            System.err.println("Console not available.");
            return;
        }

        String xStr = console.readLine("Enter initial X coordinate: ");
        int x = Integer.parseInt(xStr);

        String yStr = console.readLine("Enter initial Y coordinate: ");
        int y = Integer.parseInt(yStr);

        String dirStr = console.readLine("Enter initial direction (NORTH, EAST, SOUTH, WEST): ").toUpperCase();
        Direction direction = Direction.valueOf(dirStr);

        Rover rover = new Rover(x, y, direction);

        String instructions = console.readLine("Enter movement instructions (e.g., LMLMLMLMM): ");
        rover.processInstructions(instructions);

        System.out.println("Final Position: " + rover.getX() + " " + rover.getY() + " " + rover.getDirection());
    }

}

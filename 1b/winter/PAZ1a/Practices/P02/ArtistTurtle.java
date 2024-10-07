package sk.upjs.paz;

import sk.upjs.jpaz2.JPAZUtilities;
import sk.upjs.jpaz2.Turtle;

import java.awt.*;

public class ArtistTurtle extends Turtle {

    public void popArt(int dotCount) {
        // Create the variables
        double width = 120;
        double height = 90;

        double initX;
        double initY;
        double initDir;

        int randomCounter;
        double randomSize;
        double x;
        double y;


        // Save initial position & direction
        initX = this.getX();
        initY = this.getY();
        initDir = this.getDirection();

        // Create the Border
        for (int i = 0; i < 2; i++) {
            this.turn(90);
            this.step(width);
            this.turn(90);
            this.step(height);
        }

        // Make Random Chaos Happen
        for (int i = 0; i < dotCount; i++) {
            // Select the fill color
            randomCounter = (int) Math.round(Math.random()); // Generate a number between 0 & 1

            if (randomCounter == 0) {
                this.setFillColor(Color.RED); // If random number is 0, set color to Red
            } else {
                this.setFillColor(Color.BLUE); // Else, set color to Blue
            }

            // Generate size for the dot between 2 & 7
            randomSize = 2 + Math.random() * 5;

            // Generate x & y coordinates for the turtle to teleport to
            x = initX + randomSize + Math.random() * (width - randomSize * 2);
            y = initY + randomSize + Math.random() * (height - randomSize * 2);

            // Teleport turtle to x & y a make a dot
            this.setPosition(x, y);
            this.dot(randomSize);
            JPAZUtilities.delay(50);

        }
        // Return turtle to initial position & rotation
        this.setPosition(initX, initY);
        this.setDirection(initDir);
    }
}
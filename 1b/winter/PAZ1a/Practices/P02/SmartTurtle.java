package sk.upjs.paz;

import sk.upjs.jpaz2.JPAZUtilities;
import sk.upjs.jpaz2.Turtle;

import java.awt.*;

public class SmartTurtle extends Turtle {

    // put new methods here


    public void chain(int beadCount, double beadRadius) {
        this.setFillColor(Color.BLUE);
        this.penUp();
        for (int i = 0; i < beadCount; i++) {
            this.dot(beadRadius);
            this.step(beadRadius * 2);
        }
    }

    public void ngon(int n, double sideLength) {
        for (int i = 0; i < n; i++) {
            this.step(sideLength);
            this.turn((double) 360 / n);
        }
    }

    public void dashedLine(int n, double segmentLength) {
        for (int i = 0; i < n; i++) {
            this.step(segmentLength / 4);
            this.penUp();
            this.step(segmentLength / 2);
            this.penDown();
            this.step(segmentLength / 4);
        }
    }

    public void isosceles(double legLength, double angle) {
        double baseX = this.getX();
        double baseY = this.getY();
        double x;
        double y;

        this.turn(-angle / 2);
        this.step(legLength);

        x = this.getX();
        y = this.getY();

        this.step(-legLength);
        this.turn(angle);
        this.step(legLength);
        this.moveTo(x, y);

        this.moveTo(baseX, baseY);
        this.turn(-angle / 2);
    }

    public void mill(int n, double length) {
        this.setPenColor(Color.YELLOW);
        for (int i = 0; i < n; i++) {
            this.isosceles(length, 45);
            this.turn((double) 360 / n);
        }
    }

    public void rgbChain(int beadCount, double beadRadius) {
        this.penUp();

        for (int i = 0; i < beadCount; i++) {
            if (i % 3 == 0) {
                this.setFillColor(Color.RED);
            }
            if (i % 3 == 2) {
                this.setFillColor(Color.GREEN);
            }
            if (i % 3 == 1) {
                this.setFillColor(Color.BLUE);
            }

            this.dot(beadRadius);
            this.step(beadRadius * 2);


            this.penDown();
        }
    }

    public void circleWalk(int stepCount, double radius) {
        double x = this.getX();
        double y = this.getY();
        double dir = this.getDirection();

        for (int i = 0; i < stepCount; i++) {
            this.turn(Math.random() * 360);
            this.penUp();
            this.step(5);

            if (this.distanceTo(x, y) >= radius) {
                this.step(-5);
                this.penDown();
            } else {
                this.step(-5);
                this.penDown();
                this.step(5);
            }
        }

        this.setPosition(x, y);
        this.setDirection(dir);
    }

    public void tripleCircleWalk(int stepCount, double radius) {
        double x = this.getX();
        double y = this.getY();
        double dir = this.getDirection();

        for (int i = 0; i < stepCount; i++) {
            if (this.distanceTo(x, y) < radius / 3) {
                this.penUp();
            } else if (this.distanceTo(x, y) >= radius / 3 && this.distanceTo(x, y) < 2 * radius / 3) {
                this.penDown();
                this.setPenColor(Color.BLUE);
            } else {
                this.penDown();
                this.setPenColor(Color.RED);
            }

            this.turn(Math.random() * 360);
            this.step(5);

            if (this.distanceTo(x, y) >= radius) {
                this.step(-5);
            }

        }

        this.setPosition(x, y);
        this.setDirection(dir);
    }

    public void squareWalk(int stepCount, double sideLength) {
        this.setPenColor(Color.RED);
        double x = this.getX();
        double y = this.getY();
        double dir = this.getDirection();

        for (int i = 0; i < stepCount; i++) {
            if ((this.getX() >= x + sideLength || this.getX() <= x - sideLength) || (this.getY() >= y + sideLength || this.getY() <= y - sideLength)) {
                this.step(-5);
            }

            this.turn(Math.random() * 360);
            this.step(5);
        }

        this.setPosition(x, y);
        this.setDirection(dir);
    }

    public void circleWalkWithStepCount(int stepCount, double radius) {
        double x = this.getX();
        double y = this.getY();
        double dir = this.getDirection();

        int counter = 0;

        for (int i = 0; i < stepCount; i++) {
            if (counter < 100) {
                this.setPenColor(Color.RED);
            } else if (counter > 100 && counter < 182) {
                this.setPenColor(Color.BLUE);
            } else if (counter > 182 && counter < 304) {
                this.setPenColor(Color.BLACK);
            } else if (counter > 304) {
                this.setPenColor(Color.RED);
                counter = 0;
            }

            this.turn(Math.random() * 360);
            this.step(5);

            if (this.distanceTo(x, y) >= radius) {
                this.step(-5);
            }

            counter++;
        }

        this.setPosition(x, y);
        this.setDirection(dir);
    }

    public void spiral(int lineCount, double initialLength, double angle) {
        double stepLength = initialLength;

        for (int i = 0; i < lineCount; i++) {
            this.step(stepLength);
            JPAZUtilities.delay(50);
            this.turn(angle);
            stepLength = stepLength - 2;
        }
    }

    public void wagon(double width, Color color) {
        this.setFillColor(Color.RED);

        this.openPolygon();
        for (int i = 0; i < 2; i++) {
            this.step(width / 2);
            this.turn(90);
            this.step(width);
        }
        this.closePolygon();
    }
}

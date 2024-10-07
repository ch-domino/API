package sk.upjs.paz;

import sk.upjs.jpaz2.*;

import java.awt.*;

public class SmartTurtle extends Turtle {

    public void square(double a) {
        for (int i = 0; i < 4; i++) {
            this.step(a);
            this.turn(90);
        }
    }

    public void triangle(double a) {
        this.turn(30);
        for (int i = 0; i < 3; i++) {
            this.step(a);
            this.turn(120);
        }
        this.turn(-30);
    }

    public void rgbTriangle(double a) {
        this.setPenWidth(2);

        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                this.setPenColor(Color.RED);
            } else if (i == 1) {
                this.setPenColor(Color.GREEN);
            } else {
                this.setPenColor(Color.BLUE);
            }

            this.step(a);
            this.turn(120);
        }
    }

    public void house(double a) {
        this.square(a);
        this.step(a);
        this.triangle(a);
    }

    public void dashDotDash(double length) {
        this.step(length / 4);
        this.penUp();
        this.step(length / 4);
        this.dot(length / 8);
        this.step(length / 4);
        this.penDown();
        this.step(length / 4);
    }

    public void sun(double radius) {
        this.setPenColor(Color.ORANGE);

        for (int i = 0; i < 36; i++) {
            this.step(radius);
            this.step(-radius);
            this.turn(10);
        }

        this.setPenColor(Color.YELLOW);
        this.dot(radius / 2);
        this.turn(180);

    }

    public void pinwheel(double size) {
        for (int i = 0; i < 8; i++) {
            this.step(size);
            this.turn(45);
            this.step(10);
            this.step(-10);
            this.turn(-45);
            this.step(-size);
            this.turn(45);
        }
    }

    public void cross(double size) {
        this.setPenWidth(2);
        this.setPenColor(Color.RED);
        this.turn(-90);

        for (int i = 0; i < 4; i++) {
            this.step(size);
            this.turn(90);
            this.step(size);
            this.turn(90);
            this.step(size);
            this.turn(-90);
        }

        this.turn(90);
    }

    public void squareDrawing(double size) {
        this.setPenColor(Color.BLUE);

        for (int i = 0; i < 10; i++) {
            this.square(size);
            this.turn(90);
            this.step((size / 3) * 2);
            this.turn(-50);
        }

        this.turn(50);
        this.step(-(size / 3) * 2);
        this.turn(-90);

    }

    public void diamond(double angle, double sideLength) {
        this.setPenColor(Color.RED);
        this.turn(-angle / 2);

        this.step(sideLength);
        this.turn(angle);
        this.step(sideLength);
        this.turn(180 - angle);
        this.step(sideLength);
        this.turn(angle);
        this.step(sideLength);
        this.turn(180 - angle);

        this.turn(angle / 2);
    }

    public void mitsubishi(double angle, double sideLength) {
        for (int i = 0; i < 3; i++) {
            this.diamond(angle, sideLength);
            this.turn(120);
        }
    }

    public void grid(double unitSize) {
        this.setPosition(10, 10 + unitSize);
        for (int i = 1; i < 9; i++) {
            for (int j = 0; j < 8; j++) {
                this.step(-unitSize);
                this.square(unitSize);
            }
            this.setPosition(10 + i * unitSize, 10 + unitSize);
        }
    }

    public void star4(double sideLength, double angle) {
        this.setPenColor(Color.YELLOW);
        this.setPenWidth(2);

        for (int i = 0; i < 4; i++) {
            this.step(sideLength);
            this.turn(360 - angle);
            this.step(sideLength);
            this.turn(180 - angle);
        }
    }

    public void leaf(double length) {
        for (int i = 0; i < length; i++) {
        }
    }
}

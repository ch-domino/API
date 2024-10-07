package sk.upjs.paz;

import sk.upjs.jpaz2.Turtle;

import java.awt.*;

public class SmartTurtle extends Turtle {

    public void mystery() {
        for (int i = 0; i < 256; i++) {
            Color c = new Color(i, 100, 100);
            this.setPenColor(c);
            this.setPosition(i, 0);
            this.moveTo(i, 150);
        }
    }

    public void setRandomColor() {
        int r = (int) (Math.random() * 256);
        int g = (int) (Math.random() * 256);
        int b = (int) (Math.random() * 256);
        Color c = new Color(r, g, b);
        this.setPenColor(c);
        this.setFillColor(c);
    }

    public void concentricCircles(double radius) {
        int ktoryKruh = 1;
        while (radius > 0.5) {
            // this.setRandomColor();
            // nastavujem postupne farby
            if (ktoryKruh % 3 == 0) {
                this.setFillColor(Color.GRAY);
            }
            if (ktoryKruh % 3 == 1) {
                this.setFillColor(Color.RED);
            }
            if (ktoryKruh % 3 == 2) {
                this.setFillColor(Color.BLUE);
            }
            this.dot(radius);
            radius = radius * 0.8;
            ktoryKruh = ktoryKruh + 1;
            // ktoryKruh++;
        }
    }

    // takto to nerobit kvoli netypickemu cyklu for, ale ide to
    public void concentricCircles2(double radius) {
        for (int i = 0; true; i++) {
            if (radius < 0.5) {
                break;
            }
            // this.setRandomColor();
            // nastavujem postupne farby
            if (i % 3 == 0) {
                this.setFillColor(Color.GRAY);
            }
            if (i % 3 == 1) {
                this.setFillColor(Color.RED);
            }
            if (i % 3 == 2) {
                this.setFillColor(Color.BLUE);
            }
            this.dot(radius);
            radius = radius * 0.8;
        }
    }

}

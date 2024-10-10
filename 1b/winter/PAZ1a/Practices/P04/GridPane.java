package sk.upjs.paz;

import sk.upjs.jpaz2.Turtle;
import sk.upjs.jpaz2.WinPane;

import java.awt.*;
import java.awt.event.MouseEvent;

public class GridPane extends WinPane {

    private int numberOfDots = 0;

    public void drawGrid() {
        Turtle drawing = new Turtle();
        this.add(drawing);
        drawing.setDirection(90);
        for (int j = 1; j <= this.getHeight() / 50; j++) {
            drawing.setPosition(0, 50 * j);
            drawing.step(this.getWidth() - (this.getWidth() % 50));
        }
        drawing.setDirection(180);
        for (int i = 1; i <= this.getWidth() / 50; i++) {
            drawing.setPosition(50 * i, 0);
            drawing.step(this.getHeight() - (this.getHeight() % 50));
        }
        this.remove(drawing);
    }

    public void drawDot(int column, int row, Color dotColor) {
        Turtle dotter = new Turtle();
        this.add(dotter);
        dotter.setPosition((50 * column) + 25, (50 * row) + 25);
        dotter.setFillColor(dotColor);
        dotter.dot(20);
        this.remove(dotter);
    }

    protected void onMouseClicked(int x, int y, MouseEvent detail) {
        super.onMouseClicked(x, y, detail);
        if (numberOfDots % 2 == 1) {
            this.drawDot(x / 50, y / 50, Color.RED);
        } else {
            this.drawDot(x / 50, y / 50, Color.BLUE);
        }

        this.numberOfDots++;
    }
}

package sk.upjs.paz;

import sk.upjs.jpaz2.*;

public class SmartTurtle extends Turtle {

	// put new methods here

    public void centeredSquare(double sideLength) {
        this.penUp();
        this.step(-sideLength/2);
        this.turn(-90);
        this.step(sideLength/2);
        this.turn(90);
        this.penDown();

        for(int i=0;i<4;i++){
            this.step(sideLength);
            this.turn(90);
        }

        this.penUp();
        this.step(sideLength/2);
        this.turn(90);
        this.step(sideLength/2);
        this.turn(-90);
        this.penDown();
    }
}

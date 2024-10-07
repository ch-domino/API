package sk.upjs.paz;

import sk.upjs.jpaz2.ObjectInspector;
import sk.upjs.jpaz2.WinPane;

import java.awt.*;

public class Launcher {

    public static void main(String[] args) {
        // create new "sandbox" - a place where turtles can live
        WinPane sandbox = new WinPane();

        // create new turtle and add it to the "sandbox"
        SmartTurtle franklin = new SmartTurtle();
        sandbox.add(franklin);

        ArtistTurtle michelangelo = new ArtistTurtle();
        sandbox.add(michelangelo);

        // create new object inspector
        ObjectInspector oi = new ObjectInspector();
        // ask the inspector to inspect "franklin" and "sandbox"
        oi.inspect(franklin);
        oi.inspect(michelangelo);
        oi.inspect(sandbox);

        // you can put other initialization commands here

        // Mill animation
//        franklin.center();
//        for (int i = 0; i < 1000; i++) {
//            sandbox.clear();
//            franklin.turn(1);
//            franklin.mill(6, 100);
//            JPAZUtilities.delay(50);
//      }

        franklin.wagon(50, Color.RED);
    }
}
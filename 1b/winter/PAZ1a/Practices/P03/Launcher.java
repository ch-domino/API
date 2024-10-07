package sk.upjs.paz;

import sk.upjs.jpaz2.ObjectInspector;
import sk.upjs.jpaz2.WinPane;

public class Launcher {

    public static void main(String[] args) {
        WinPane sandbox = new WinPane();

        SmartTurtle franklin = new SmartTurtle();
        sandbox.add(franklin);

        ObjectInspector oi = new ObjectInspector();
        oi.inspect(franklin);
        oi.inspect(sandbox);

        ScientificTurtle euler = new ScientificTurtle();
        oi.inspect(euler);
    }
}
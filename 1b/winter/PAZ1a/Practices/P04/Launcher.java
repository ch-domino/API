package sk.upjs.paz;

public class Launcher {

    public static void main(String[] args) {
        // create new "sandbox" - a place where turtles can live
//        AnimatedWinPane sandbox = new AnimatedWinPane();

        // create new turtle and add it to the "sandbox"
//        SmartTurtle franklin = new SmartTurtle();
//        sandbox.add(franklin);

        // create new object inspector
//        ObjectInspector oi = new ObjectInspector();
        // ask the inspector to inspect "franklin" and "sandbox"
//        oi.inspect(franklin);
//        oi.inspect(sandbox);

        // you can put other initialization commands here
        GridPane grid = new GridPane();
        grid.setHeight(611);
        grid.setWidth(611);
        grid.drawGrid();

    }
}
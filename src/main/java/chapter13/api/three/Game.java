package chapter13.api.three;

import java.util.Arrays;
import java.util.List;

public class Game {
    public static void main(String[] args) {

        List<Resizable> resizableShapes = Arrays.asList(new Square(), new Rectangle(), new Ellipse());
        Utils.paint(resizableShapes);
    }
}

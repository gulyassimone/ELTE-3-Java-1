import hu.elte.geometry.Circle;
import hu.elte.geometry.Point;
import hu.elte.image.Canvas;

import java.awt.Color;
import java.io.IOException;

public class Circles {

    public static void main(String[] args) throws IOException {
        Circle[] circles = createCircles(args);

        try (Canvas canvas = new Canvas(200, 200)) {
            canvas.draw(circles[0], Color.MAGENTA);
            canvas.saveToPng("korok.png");
        }
    }

    private static Circle[] createCircles(String[] args) {
        Circle dummyCircle = new Circle(new Point(100, 100), 50);
        return new Circle[] { dummyCircle };
    }

}
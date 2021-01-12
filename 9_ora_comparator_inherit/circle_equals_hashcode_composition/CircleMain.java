import hu.elte.geometry.Circle;
import hu.elte.geometry.Point;

import java.util.HashSet;
import java.util.Set;

public class CircleMain {

    public static void main(String[] args) {
        ColoredCircle redCircle1 = new ColoredCircle(new Point(2, 3), 5, Color.RED);
        ColoredCircle redCircle2 = new ColoredCircle(new Point(2, 3), 5, Color.RED);
        Set<ColoredCircle> circles = new HashSet<>();
        circles.add(redCircle1);
        circles.add(redCircle2);
        System.out.println("Circles (there should be only one due to the deduplication: " + circles);
    }
}
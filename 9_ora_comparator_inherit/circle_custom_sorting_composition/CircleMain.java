import hu.elte.geometry.Circle;
import hu.elte.geometry.Point;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CircleMain {

    public static void main(String[] args) {
        ColoredCircle circle1 = new ColoredCircle(new Point(-2, 0), 5, Color.RED);
        ColoredCircle circle2 = new ColoredCircle(new Point(0, -1), 1, Color.RED);
        ColoredCircle circle3 = new ColoredCircle(new Point(-1, 1), 3, Color.RED);
        List<ColoredCircle> circles = new ArrayList<>();
        circles.add(circle1);
        circles.add(circle2);
        circles.add(circle3);
        System.out.println("Circles without sorting:");
        for (ColoredCircle circle : circles) {
            System.out.println(circle);
        }
        Collections.sort(circles);
        System.out.println("Circles sorted by radius:");
        for (ColoredCircle circle : circles) {
            System.out.println(circle);
        }
        Collections.sort(circles, new XComparator());
        System.out.println("Circles sorted by x:");
        for (ColoredCircle circle : circles) {
            System.out.println(circle);
        }
        Collections.sort(circles, new YComparator());
        System.out.println("Circles sorted by y:");
        for (ColoredCircle circle : circles) {
            System.out.println(circle);
        }
    }
}
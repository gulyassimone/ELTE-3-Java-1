import hu.elte.geometry.Circle;
import hu.elte.geometry.Point;

public class CircleMain {

    public static void main(String[] args) {
        Circle circle = new ColoredCircle(new Point(2, 3), 5, Color.RED);
        System.out.println("ColoredCircle.tosString: " + circle);
    }
}
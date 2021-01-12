import hu.elte.geometry.Circle;
import hu.elte.geometry.Point;

public class ColoredCircle {

    private final Circle circle;
    private final Color color;

    public ColoredCircle(double x, double y, double radius, Color color) {
        this(new Point(x, y), radius, color);
    }

    public ColoredCircle(Point center, double radius, Color color) {
        this(new Circle(center, radius), color);
    }

    public ColoredCircle(Circle circle, Color color) {
        this.circle = circle;
        this.color = color;
    }

    @Override
    public String toString() {
        return circle.toString() + " with color " + color;
    }
}

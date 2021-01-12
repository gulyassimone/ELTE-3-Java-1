import hu.elte.geometry.Circle;
import hu.elte.geometry.Point;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (o == null || !o.getClass().equals(getClass())) {
            return false;
        }
        ColoredCircle other = (ColoredCircle) o;
        return Objects.equals(circle, other.circle) && Objects.equals(color, other.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(circle, color);
    }

    @Override
    public String toString() {
        return circle.toString() + " with color " + color;
    }
}

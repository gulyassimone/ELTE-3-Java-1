import hu.elte.geometry.Circle;
import hu.elte.geometry.Point;

public class ColoredCircle extends Circle {

    private final Color color;

    public ColoredCircle(Point center, double radius, Color color) {
        super(center, radius);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + " with color " + color;
    }
}

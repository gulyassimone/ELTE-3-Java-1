package hu.elte.geometry;

import java.util.Objects;

public class Circle {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }
 
    public boolean intersects(Circle other) {
        return Point.getDistance(center, other.center) <= radius + other.radius;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (o == null || !o.getClass().equals(getClass())) {
            return false;
        }
        Circle other = (Circle) o;
        return Objects.equals(center, other.center) && radius == other.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(center, radius);
    }

    @Override
    public String toString() {
        return "Circle { center=" + center + ", radius=" + radius + "}";
    }
}
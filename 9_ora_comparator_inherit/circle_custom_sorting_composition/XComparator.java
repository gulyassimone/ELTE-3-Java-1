import hu.elte.geometry.Circle;

import java.util.Comparator;

public class XComparator implements Comparator<ColoredCircle> {

    public int compare(ColoredCircle coloredCircle1, ColoredCircle coloredCircle2) {
        double x1 = coloredCircle1.getCircle().getCenter().getX();
        double x2 = coloredCircle2.getCircle().getCenter().getX();
        return Double.compare(x1, x2);
    }

}
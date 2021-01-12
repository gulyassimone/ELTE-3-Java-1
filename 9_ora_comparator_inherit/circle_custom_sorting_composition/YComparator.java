import hu.elte.geometry.Circle;

import java.util.Comparator;

public class YComparator implements Comparator<ColoredCircle> {

    public int compare(ColoredCircle coloredCircle1, ColoredCircle coloredCircle2) {
        double y1 = coloredCircle1.getCircle().getCenter().getY();
        double y2 = coloredCircle2.getCircle().getCenter().getY();
        return Double.compare(y1, y2);
    }

}
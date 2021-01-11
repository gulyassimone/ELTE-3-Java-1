import hu.elte.geometry.Circle;
import hu.elte.geometry.Point;
import hu.elte.image.Canvas;

import java.awt.Color;
import java.io.IOException;

public class Circles {

    public static void main(String[] args) throws IOException {
        Circle[] circles = createCircles(args);

        try (Canvas canvas = new Canvas(200, 200)) {
            for(Circle circle : circles){

                canvas.draw(circle, Color.MAGENTA);
                canvas.saveToPng("korok.png");
            }
        }
    }

    private static Circle[] createCircles(String[] args) {
        int nCircles = Integer.parseInt(args[0]);
        if(args.length != nCircles * 3 + 1){
            throw new IllegalArgumentException("..");//RODO meainingfull messege
        }
        Circle[] circles = new Circle[nCircles];

        for(int i = 0; i < nCircles; ++i){
            int x = Integer.parseInt(args[ 1 + 3 * i ]);
            int y = Integer.parseInt(args[ 2 + 3 * i ]);
            int radius = Integer.parseInt(args[ 3 + 3 * i ]);
            circles[i] = new Circle(new Point(x,y), radius);
        }
        return circles;
    }

}
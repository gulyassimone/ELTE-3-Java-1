class Main{
    public static void main(String[] args){
        Point point1 = new Point();
        point1.setX(5);
        point1.setY(3);
        System.out.println("point1 eredetileg: " + point1);
        point1.move(1,1);
        System.out.println("point1 eredetileg: " + point1);

        Point point2 = new Point(6,4);
        System.out.println("point1 eredetileg: " + point2);
        point2.move(-1,-1);
        System.out.println("point1 eredetileg: " + point2);
    }
}
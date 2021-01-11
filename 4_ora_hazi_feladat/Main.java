public class Main {

  public static void main(String[] args)  {
    if(args.length!=6){
      throw new IllegalArgumentException(" Nem megfelelő számű bemeneti paraméter. 6 paramétert várunk, helyette: " + args.length + " kaptunk");
    }
    Point point1 = new Point(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
    Point point2 = new Point(Integer.parseInt(args[2]),Integer.parseInt(args[3]));
    Point point3 = new Point(Integer.parseInt(args[4]),Integer.parseInt(args[5]));
         
    
    System.out.println(point1.avg(point2, point3));
  }


}
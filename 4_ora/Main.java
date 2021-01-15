
import java.util.Arrays;
public class Main {

  public static void main(String[] args) {
    int[] array = new int[10]; //max kapacitas, legnagyobb poyitiv intnel tobbet nem lehet megadni
    //Integer.MAX_INT
    //Integer.MIN_INT
    System.out.println(array[4]);
    System.out.println(args);

    int[] array1 = new int[10];
    Arrays.fill(array1,13);
    System.out.println(array1);
  }
}
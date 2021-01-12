import car.Car;
import car.util.Color;

import java.io.File;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarsMain {

    public static void main(String[] args){
        List<Car> cars = loadCars(args[0]);
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    private static List<Car> loadCars(String path) {
        List<Car> cars = new ArrayList<>(); 
        Scanner scanner = new Scanner(new File(path));

        while(tmp = scanner.next){
          cars.add(tmp);
        }
        String plate=scanner.next();
        scanner.next(); //Forint
        
        // TODO: implement reading of Car records from file
        // cars.add(new Car(...));
        cars.add(new Car("ABC-123", Color.RED, 120));
        return cars;
    }

}
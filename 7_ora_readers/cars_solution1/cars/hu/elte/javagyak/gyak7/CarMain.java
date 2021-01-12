package hu.elte.javagyak.gyak7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CarMain {

    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            throw new IllegalArgumentException("one argument pointing to an input file is expected, got " + args.length + " argument(s)");
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            String line;
            reader.readLine(); // skip the CSV header
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String vehicleIdentificationNumber = parts[0];
                String licencePlateNumber = parts[1];
                int year = Integer.parseInt(parts[2]);
                Color color = Color.valueOf(parts[3]);
                float averageFuelConsumption = Float.parseFloat(parts[4]);
                System.out.println(new Car(vehicleIdentificationNumber, licencePlateNumber, year, color, averageFuelConsumption));
            }
        }
    }
}
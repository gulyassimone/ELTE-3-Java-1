package car;

import car.util.Color;

public class Car {

    private static int counter = 0;

    private final String licencePlate;
    private final Color color;
    private final int maxSpeed;

    public Car(String licencePlate, Color color, int maxSpeed) {
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.licencePlate = licencePlate;
        counter++;
    }

    public boolean isFasterThan(Car other){
        return maxSpeed > other.maxSpeed;
    }

    @Override
    public String toString() {
        return String.format("Car{licencePlate=%s, color=%s, maxSpeed=%d}", licencePlate, color, maxSpeed);
    }

    // this method only exists to demonstrate static fields and methods
    // it should have been better done by getting the size of the collection containing Car instances
    public static int numberOfCreatedCars() {
        return counter;
    }
}
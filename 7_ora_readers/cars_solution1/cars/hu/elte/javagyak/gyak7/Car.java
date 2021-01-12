package hu.elte.javagyak.gyak7;

public class Car {

    private final String vehicleIdentificationNumber;
    private final String licencePlateNumber;
    private final int year;
    private final Color color;
    private final float averageFuelConsumption;

    public Car(String vehicleIdentificationNumber, String licencePlateNumber, int year, Color color, float averageFuelConsumption) {
        this.vehicleIdentificationNumber = vehicleIdentificationNumber;
        this.licencePlateNumber = licencePlateNumber;
        this.year = year;
        this.color = color;
        this.averageFuelConsumption = averageFuelConsumption;
    }

    public String getVehicleIdentificationNumber() {
        return vehicleIdentificationNumber;
    }

    public String getLicencePlateNumber() {
        return licencePlateNumber;
    }

    public int getYear() {
        return year;
    }

    public Color getColor() {
        return color;
    }

    public float getAverageFuelConsumption() {
        return averageFuelConsumption;
    }

    @Override
    public String toString() {
        return "Car { VIN: " + vehicleIdentificationNumber + ", licencePlateNumber: " + licencePlateNumber + ", year: " + year + ", color: " + color + ", averageFuelConsumption: " + averageFuelConsumption + " }";
    }
}
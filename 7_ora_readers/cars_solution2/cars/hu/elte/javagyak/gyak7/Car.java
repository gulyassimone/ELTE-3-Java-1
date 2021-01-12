package hu.elte.javagyak.gyak7;

public class Car {

    private final String vehicleIdentificationNumber;
    private final String licencePlateNumber;
    private final int year;
    private final Color color;
    private final float averageFuelConsumption;

    public Car(String vehicleIdentificationNumber, String licencePlateNumber, int year, Color color, float averageFuelConsumption) {
        if (!vehicleIdentificationNumber.matches("[A-Z0-9]{17}")) {
            throw new IllegalArgumentException("invalid VIN: \"" + vehicleIdentificationNumber + "\", it must be composed of 17 characters each of which is an upper-case letter in English alphaber or a digit");
        }
        if (!licencePlateNumber.matches("[A-Z]{3}-[0-9]{3}")) {
           throw new IllegalArgumentException("invalid licence plate number: \"" + licencePlateNumber + "\", it must be composed of 3 upper case letters from the English alphabet, one dash character and 3 digits");
        }
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
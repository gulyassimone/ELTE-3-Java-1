package circles_from_array_orig.tvstation.main.geometry;

class Car {

    private static int counter = 0;

    private int maxSpeed;

    public Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        counter++;
    }

    public boolean isFasterThan(Car other){
        return maxSpeed > other.maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed=" + maxSpeed +
                '}';
    }
}
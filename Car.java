public class Car {
    protected String brand;
    protected String model;
    private static int numCars = 0;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        numCars++;
    }

    public static int getNumCars() {
        return numCars;
    }
}

package cars;

/**
 * The {@code Car} class represents a generic car with basic attributes.
 * It provides information such as model, fuel consumption, speed, and price.
 */
public class Car {
    private String model;
    private double fuelConsumption; // in liters per 100 km
    private double speed; // in km/h
    private double price; // in dollars

    /**
     * Constructs a car with the specified attributes.
     *
     * @param model            the model of the car
     * @param fuelConsumption the fuel consumption of the car in liters per 100 km
     * @param speed            the speed of the car in km/h
     * @param price            the price of the car in dollars
     */
    public Car(String model, double fuelConsumption, double speed, double price) {
        this.model = model;
        this.fuelConsumption = fuelConsumption;
        this.speed = speed;
        this.price = price;
    }

    /**
     * Gets the model of the car.
     *
     * @return the model of the car
     */
    public String getModel() {
        return model;
    }

    /**
     * Gets the fuel consumption of the car in liters per 100 km.
     *
     * @return the fuel consumption of the car
     */
    public double getFuelConsumption() {
        return fuelConsumption;
    }

    /**
     * Gets the speed of the car in km/h.
     *
     * @return the speed of the car
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * Gets the price of the car in dollars.
     *
     * @return the price of the car
     */
    public double getPrice() {
        return price;
    }

    /**
     * Returns a string representation of the car.
     *
     * @return a string representation of the car
     */
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", fuelConsumption=" + fuelConsumption +
                ", speed=" + speed +
                ", price=" + price +
                '}';
    }
}

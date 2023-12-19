import cars.Car;
import cars.ElectricCar;
import cars.SUV;
import cars.Sedan;

public class Main {
    public static void main(String[] args) {
        TaxiFleet taxiFleet = new TaxiFleet(new Car[]{
                new ElectricCar("Tesla-V1", 25.5, 100, 40000),
                new SUV("SomeSUV", 15, 100, 30000),
                new Sedan("Mitsubishi Lancer", 10, 150, 20000)
        });

        System.out.println("Fleet cost: " + taxiFleet.calculateFleetCost() + " $");
        System.out.println("Car with speed range (40-120) is found: " + taxiFleet.findCarBySpeedRange(40, 120));
        System.out.println("Current array of cars consists of:");
        for (Car car: taxiFleet.getCars()){
            System.out.println(car);
        }
        taxiFleet.sortByFuelConsumption();
        System.out.println("----Sorted by fuel consumption----");
        for (Car car: taxiFleet.getCars()){
            System.out.println(car);
        }
    }
}
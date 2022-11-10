package HomeWork_7.Company;

import HomeWork_7.Company.Details.Engine;
import HomeWork_7.Company.Professions.Driver;
import HomeWork_7.Company.Vehicles.Car;

public class Main {

    public static void main(String[] args) {

        Driver driver = new Driver("Alks", "Ziznev", 15);
        Engine engine = new Engine(100,200);
        Car car = new Car("Mazda", "121", 1020, driver, engine);

        car.setDriver(driver);

        car.start();
        car.stop();
        System.out.println();
        car.turnLeft();
        car.turnRight();
        System.out.println();

        System.out.print(car);
    }
}

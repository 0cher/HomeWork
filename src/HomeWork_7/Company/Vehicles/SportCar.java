package HomeWork_7.Company.Vehicles;

import HomeWork_7.Company.Details.Engine;
import HomeWork_7.Company.Professions.Driver;

public class SportCar extends Car{

    int maxSpeed;

    public SportCar(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public SportCar(String carBrand, String CarModel, double weight, Driver driver, Engine engine, int maxSpeed) {
        super(carBrand, CarModel, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}

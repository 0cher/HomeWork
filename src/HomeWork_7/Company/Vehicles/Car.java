package HomeWork_7.Company.Vehicles;

import HomeWork_7.Company.Details.Engine;
import HomeWork_7.Company.Professions.Driver;
public class Car {
    String CarBrand;
    private String CarModel;
    private double weight;
    private Driver driver;
    private Engine engine;

  public Car(){
    }

    public Car(String carBrand, String CarModel, double weight, Driver driver, Engine engine) {
        CarBrand = carBrand;
        this.CarModel = CarModel;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car status: \n" +
                "Car Brand: " + CarBrand + '\n' +
                "Car Model: " + CarModel + '\n' +
                "Weight: " + weight + " kg"+'\n' +
                "Driver: " + driver.getName() + " "+ driver.getSurname() + '\n' +
                "Engine power: " + engine.getPower() + '\n';
    }
    public void start() {
        System.out.println("Start");
    }
    public void stop() {
        System.out.println("Stop");
    }
    public void turnRight() {
        System.out.println("Поворот направо");
    }
    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public String getCarBrand() {
        return CarBrand;
    }
    public void setCarBrand(String carBrand) {
        CarBrand = carBrand;
    }

    public String getModelClass() {
        return CarModel;
    }

    public void setModelClass(String modelClass) {
        this.CarModel = modelClass;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}

package HomeWork_7.Company.Vehicles;

import HomeWork_7.Company.Details.Engine;
import HomeWork_7.Company.Professions.Driver;

public class Lorry extends Car {

    private int vehicleLoad;

    public Lorry(int vehicleLoad) {
        super();
        this.vehicleLoad = vehicleLoad;
    }

    public Lorry(String carBrand, String modelClass, double weight, Driver driver, Engine engine, int vehicleLoad) {
        super(carBrand, modelClass, weight, driver, engine);
        this.vehicleLoad = vehicleLoad;
    }

    public int getVehicleLoad() {
        return vehicleLoad;
    }

    public void setVehicleLoad(int vehicleLoad) {
        this.vehicleLoad = vehicleLoad;
    }
}

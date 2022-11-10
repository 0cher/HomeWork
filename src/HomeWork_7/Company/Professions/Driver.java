package HomeWork_7.Company.Professions;

public class Driver {

    String Name;
    String surname;

    int driverExperience;

    Driver(){
    }
    public Driver(String name, String surname, int driverExperience) {
        Name = name;
        this.surname = surname;
        this.driverExperience = driverExperience;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDriverExperience() {
        return driverExperience;
    }

    public void setDriverExperience(int driverExperience) {
        this.driverExperience = driverExperience;
    }
}

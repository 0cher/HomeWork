package HomeWork_7.VeterinaryClinic;

public class Dog extends Animal{

    @Override
    public void makeNoise() {
        System.out.println("Гав");
    }
    public Dog() {
    }
    public Dog(String name, int age) {
        super(name, age);
    }

}

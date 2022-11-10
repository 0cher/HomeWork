package HomeWork_7.VeterinaryClinic;

public class Rat extends Animal{

    @Override
    public void makeNoise() {
        System.out.println(".......");
    }
    public Rat() {
    }
    public Rat(String name, int age) {
        super(name, age);
    }
}

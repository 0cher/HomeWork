package HomeWork_7.VeterinaryClinic;

public class Cat extends Animal{

    @Override
    public void makeNoise() {
        System.out.println("Мяу");
    }
    public Cat() {
    }
    public Cat(String name, int age) {
        super(name, age);
    }

}

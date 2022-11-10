package HomeWork_7.VeterinaryClinic;

public class Main {

    public static void main(String[] args) {

        Animal[] animals = new Animal[3];

        animals[0] = new Dog("Хари", 7);
        animals[1] = new Cat("Мура",2);
        animals[2] = new Rat("Журка",2);


        for (Animal animal : animals) {
            System.out.print(animal.getName() + " говорит ");
            animal.makeNoise();
        }
    }
}

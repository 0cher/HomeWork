package HomeWork_7.InterfaceTool;

public class Tuba implements Instrument {

    int diameter;

    public Tuba(int diameter) {
        this.diameter = diameter;
    }
    public int getDiameter() {
        return diameter;
    }
    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
    @Override
    public void play() {
        System.out.println("Играет труба.");
    }
    @Override
    public String toString() {
        return "Диаметр трубы " +
                 diameter +" сантиметров.";
    }
}

package HomeWork_7.InterfaceTool;

public class Drum implements Instrument{
    private String size;

    public Drum (String size) {
        this.size = size;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    @Override
    public void play() {
        System.out.println("Играет барабан.");
    }
    @Override
    public String toString() {
        return "Размер барабана " +
                 size+".";
    }
}

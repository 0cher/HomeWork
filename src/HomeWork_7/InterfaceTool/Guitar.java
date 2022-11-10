package HomeWork_7.InterfaceTool;

public class Guitar implements Instrument{

    private int numberOfStrings;

    public Guitar(){

    }
    public Guitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }
    @Override
    public void play(){
        System.out.println("Играет гитара.");    }

    @Override
    public String toString() {
        return "Гитара " +
                 numberOfStrings +
                " струнная.";
    }
}

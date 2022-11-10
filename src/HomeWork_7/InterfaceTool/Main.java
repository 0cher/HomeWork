package HomeWork_7.InterfaceTool;

public class Main {
    public static void main(String[] args) {

        Instrument [] instruments = new Instrument[3];
        instruments[0] = new Guitar(6);
        instruments[1] = new Drum("50");
        instruments[2] = new Tuba(20);


        for(int i=0;i<instruments.length;i++){
        instruments[i].play();
        System.out.println(instruments[i]);
            System.out.println();}

    }

}

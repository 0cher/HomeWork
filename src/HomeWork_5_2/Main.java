package HomeWork_5_2;

public class Main {
    public static void main(String[] args) {

        IntArray intArray = new IntArray();
        intArray.setMax(100);
        intArray.setMin(1);

        intArray.array(20,10,30);

        int [] arr = intArray.createArray();
        intArray.fillArrayRandom(arr);

        intArray.arraySort(-1, arr);
        intArray.arraySort(2, arr);

    }
}

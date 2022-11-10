package HomeWork_5_2;

import java.util.Arrays;
import java.util.Collections;

public class IntArray {

    private int [] arr = new int[10];
    private int max, min;

    IntArray(){
    }
    public int[] createArray() {
        return new int[10];
    }
    public void fillArrayRandom(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()* (max-min))+min;
        }
    }
   void array (int... array) {

        System.out.println(Arrays.toString(array));
    }
    void arraySort (int number, int[] array) {
            if (number>=1){
                Arrays.sort(array);
                System.out.println("Массив отсортирован по возрастанию: "
                        +Arrays.toString(array));
            }
            else { Integer[] IntegerArray =
                    Arrays.stream(array).boxed().toArray(Integer[]::new);
                Arrays.sort(IntegerArray, Collections.reverseOrder());
                System.out.println("Массив отсортирован по убыванию: "
                        +Arrays.toString(IntegerArray));
            }
        }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
    public int[] getArr() {
        return arr;
    }
    public int getMax() {
        return max;
    }
    public void setMax(int max) {
        this.max = max;
    }
    public int getMin() {
        return min;
    }
    public void setMin(int min) {
        this.min = min;
    }
}

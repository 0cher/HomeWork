//Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в строку.
//Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью
package HomeWork_3;
import java.util.Arrays;

public class Task_1 {
    public static void main(String[] args) {

        int max, min;
        max = 99;
        min = 10;

        int [] array = new int[4];
        for (int i =0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (max-min)) + min;
            System.out.print(array[i] + " ");
        }
        String a;
        a = "";
        boolean sorted = true;
        for (int i=1; i<array.length; i++) {
            if (array[i-1]>array[i]) {
               sorted = false;
                a = "Массив не отсортирован";
               break;
               } else a = "Массив отсортирован";
            }
//            if (sorted==true) {
//                a = "Массив отсортирован";
//            }else a = "Массив не отсортирован";
            System.out.println(a);

            if (sorted==false) {
                Arrays.sort(array);
                for ( int i = 0; i< array.length; i++) {
                    System.out.print(array[i] + " ");
                }
                a = "Массив отсортирован";
                System.out.println(a);
            }
         //System.out.println(Arrays.toString(array));
    }
}

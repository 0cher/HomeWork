//Создайте массив из N случайных целых чисел из отрезка [A;B], числа N, A и B вводятся с клавиатуры.
//Определите какой элемент является в этом массиве максимальным и сообщите его индекс
package HomeWork_3;
import java.util.Arrays;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max, min, array, MaxN, MaxI;
        MaxI = 0;
//      MaxN = 0;

        System.out.print("Введите максимальное число: ");
        max = scan.nextInt();
        System.out.print("Введите минимальное число: ");
        min = scan.nextInt();
        while (min>max) {
            System.out.println("Минимальный число не может быть больше максимального");
            System.out.print("Введите новое значение минимального числа: ");
            min = scan.nextInt();
        }
        array = (int) (Math.random() * (max+1-min)) + min;
        if (array<0){
            array = -(array);
        }
        int[] arr = new int[array];
        System.out.println("Сгенерированный размер массива: " + arr.length);

        for (int i = 0; i<array; i++){
            arr[i] = (int) (Math.random()* (max+1-min)) +min;
        }
//        for (int i =0; i<arr.length; i++) {    //максимальное число в массиве
//            if (arr[i] > MaxN) {
//                MaxN = arr[i];
//            }
//        }
        for (int i =0; i<arr.length; i++) {    //индекс максимального числа в массиве
            if (arr[i]>arr[MaxI]){
                MaxI = i;
            }
        }
//      System.out.println("Максимальное число в массиве: " + MaxN);
        System.out.println("Индекс максимального числа в массиве: " + MaxI + "\n"+"Максимальное число в массиве: " + arr[MaxI]);
        System.out.println("Элементы массива: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Элементы массива: " + Arrays.toString(arr));
    }
}

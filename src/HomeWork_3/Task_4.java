//Создайте массив из N случайных целых чисел из отрезка [A;B], числа N, A и B вводятся с клавиатуры.
//Выведите массив на экран, после чего отсортируйте его с помощью сортировки «пузырьком»
//и выведите уже отсортированный массив
package HomeWork_3;
import java.util.Arrays;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max, min, array;

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

        for (int i = 0; i<array; i++) {
            arr[i] = (int) (Math.random() * (max+1-min)) + min;
        }
        System.out.println("Элементы массива: " + Arrays.toString(arr));

        for (int j=0; j<arr.length; j++){

            for (int i=0; i<arr.length-1; i++) {

                if (arr[i]>arr[i+1]) {
                    int t = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = t;
                }
            }
        }
        System.out.println("Отсортированный массив: " + Arrays.toString(arr));
    }
}

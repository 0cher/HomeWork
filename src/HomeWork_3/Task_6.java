//Создайте массив из N случайных целых чисел из отрезка [A;B], числа N, A и B вводятся с клавиатуры.
//Выведите массив на экран, после чего инвертируйте его и выведите уже отсортированный массив
package HomeWork_3;

import methodClass.checkNumber;

import java.util.Arrays;
import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max, min, array;
        checkNumber checkInt = new checkNumber();

        System.out.print("Введите максимальное число: ");
        checkInt.getNumber("Введите максимальное число: ");
        max=checkInt.number;

        System.out.print("Введите минимальное число: ");
        checkInt.getNumber("Введите минимальное число: ");
        min=checkInt.number;

        while (min>max) {
            System.out.println("Минимальный число не может быть больше максимального");
            System.out.print("Введите минимальное число: ");
            checkInt.getNumber("Введите минимальное число: ");
            min = checkInt.number;
        }

//        while (min>max) {
//            System.out.println("Минимальный число не может быть больше максимального");
//            System.out.print("Введите новое значение минимального числа: ");
//            min = scan.nextInt();
//        }
        array = (int) (Math.random() * (max+1-min)) + min;
        if (array<0){
            array = -(array);
        }
        int[] arr = new int[array];
        System.out.println("Сгенерированный размер массива: " + arr.length);

        for (int i=0; i<arr.length; i++){
            arr[i] = (int) (Math.random()*(max-checkInt.min))+checkInt.min;
        }
        Arrays.sort(arr);
        System.out.println("Сортировка массива: " + Arrays.toString(arr));

        for (int i=0; i<arr.length/2;i++){
            int t = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = t;
        }
        System.out.println("Реверс массива: " + Arrays.toString(arr));
    }
}

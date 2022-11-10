//Создать и проинициализировать массив из 20 элементов. Ввести с клавиатуры число n и найти, есть ли оно в массиве, и,
//если есть, вывести его индекс на экран. Использовать линейный поиск
package HomeWork_3;
import java.util.Arrays;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n, max, min;
        String a;
        int [] arr = new int[20];
        max = 10;
        min = 1;
        System.out.print("Введите число для поиска в массиве: ");
        n = scan.nextInt();

        for (int i=0; i<arr.length; i++) {
            arr[i] = (int) (Math.random()* (max-min))+min;
        }

        int index = -1;
        for (int i=0; i<arr.length; i++){
            if (arr[i] == n) {
                index = i;
                break;
            }
        }
        if (index>=0) {
            a = "Индекс числа " + n + ": " + index;
        } else a = "Число " + n + " нет в массиве";

        System.out.println(a);
        System.out.println(Arrays.toString(arr));
    }

}

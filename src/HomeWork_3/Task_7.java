//Создайте массив из N случайных целых чисел из отрезка [A;B], числа N, A и B вводятся с клавиатуры.
//Вывести массив на экран, после чего ввести с клавиатуры число k, найти индекс этого числа в массиве сперва линейным поиском,
//потом двоичным и вывести на экран этот индекс, если число есть в массиве, и количество «шагов»,
//которое каждый алгоритм потратил на выполнение задачи.
package HomeWork_3;
import methodClass.checkNumber;
import java.util.Arrays;
import java.util.Scanner;
public class Task_7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int max, min, k, array,searchLinear,searchBinary,lowIndex,highIndex;
        checkNumber checkInt = new checkNumber();
        String a;
        searchLinear=0;
        searchBinary=0;

        System.out.print("Введите максимальное число: ");
        checkInt.max = scan.nextInt();
        max = checkInt.max;
        System.out.print("Введите минимальное число: ");
        checkInt.min = scan.nextInt();
        checkInt.getMin();
        min = checkInt.min;

//            while (min>max) {
//            System.out.println("Минимальный число не может быть больше максимального");
//            System.out.print("Введите новое значение минимального числа: ");
//            min = scan.nextInt();
//        }

//        System.out.print("Введите число для поиска в массиве: ");
//        k = scan.nextInt();

        array = (int) (Math.random() * (max-min)) + min;
        if (array<0){
            array = -(array);
        }
        int[] arr = new int[array];
        System.out.println("Сгенерированный размер массива: " + arr.length);
        for (int i=0; i<arr.length; i++){
            arr[i] = (int) (Math.random()* (max-min))+min;
        }
        Arrays.sort(arr);
        System.out.println("Массив: "+ Arrays.toString(arr));
        System.out.print("Введите число для поиска в массиве: ");
        k = scan.nextInt();

        int index = -1;
        for (int i=0; i<arr.length; i++) {
            searchLinear++;
            if (arr[i]==k){
                index=i;
                break;
            }
        }
        lowIndex = 0;
        highIndex = arr.length-1;
        while (lowIndex<=highIndex)  {
            int midlIndex = (lowIndex+highIndex)/2;
            searchBinary++;
            if (k==arr[midlIndex]) {
                index=midlIndex;
                break;
            } else if (k<arr[midlIndex]) {
                highIndex = midlIndex-1;
            } else if (k>arr[midlIndex]) {
                lowIndex = midlIndex+1;
            }
        }
        if (index>=0) {
            a = "Индекс числа " + k + ": " + index;
        } else a = "Число " + k + " нет в массиве";
        System.out.println(a);
        System.out.println("Количество циклов линейный поиск: "+searchLinear);
        System.out.println("Количество циклов двоичный поиск: "+searchBinary);
    }
}

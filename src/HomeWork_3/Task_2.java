//Попросить пользователя ввести с клавиатуры сперва размер массива, потом нижний диапазон значений и верхний.
//После чего создать массив размером, который ввел пользователь и заполнить его случайными числами из диапазона,
//введенного пользователем. Если пользователь ввел неверные значения (отрицательный размер массива,
//нижняя граница диапазона больше верхнего и т.д.) попросить его ввести значение ещё раз и перезаписать старое значение новым.
//Вывести массив на экран (Для этого удобнее пользоваться не println, а print)
package HomeWork_3;
import java.util.Arrays;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int max, min, array;

        System.out.print("Введите размер массива: ");
        array = scan.nextInt();
        while (array<=0) {
            System.out.println("Размер массива не может быть меньше или равно нулю");
            System.out.print("Введите новое значение массива: ");
            array = scan.nextInt();
        }
        System.out.print("Введите максимальное число для создания массива: ");
        max = scan.nextInt();

        System.out.print("Введите минимальное число для создания массива: ");
        min = scan.nextInt();
        while (min>max) {
            System.out.println("Минимальный число не может быть больше максимального");
            System.out.print("Введите новое значение массива: ");
            min = scan.nextInt();
        }

        int[] arr = new int[array];
        for (int i =0; i<array; i++) {
            arr[i] = (int) (Math.random() * (max+1-min)) + min;
        }
        System.out.println(Arrays.toString(arr));
    }
}

package methodClass;

import java.util.Scanner;
public class checkMinToMax {

    public int max, min;
    Scanner scan = new Scanner(System.in);

    public int getMin () {while (min>max) {
        System.out.println("Минимальный число не может быть больше максимального");
        System.out.print("Введите новое значение минимального числа: ");
        min = scan.nextInt();
        }
    return min;
    //return max;
   }
}

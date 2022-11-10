package methodClass;

import java.util.Scanner;
public class checkNumber {
   public int number, min, max, step;
    Scanner scan = new Scanner(System.in);
     public void getNumber(String s) { while (true){
            //step++;

         try {
            number = Integer.parseInt(scan.next());
            step = 0;
            break;
        } catch (NumberFormatException e) {
            System.out.println("Данные введены не верно." +
                    " Введите повторно.");
            System.out.print(s);

            }
        }
     }


    public int getMin () {while (min>max) {
        System.out.println("Минимальный число не может быть больше максимального");
        System.out.print("Введите новое значение минимального числа: ");
        min = scan.nextInt();
    }
        return min;
        //return max;
    }
}

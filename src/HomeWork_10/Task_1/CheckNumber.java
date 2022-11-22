package HomeWork_10.Task_1;

import java.util.Scanner;
class CheckNumber {
    int action;
    Scanner scan = new Scanner(System.in);
   void getNumber(String s) { while (true){
         try {
            action = Integer.parseInt(scan.next());
            break;
        } catch (NumberFormatException e) {
            System.out.println("Данные введены не верно." +
                    " Введите повторно.");
            System.out.print(s);
            }
        }
     }
}


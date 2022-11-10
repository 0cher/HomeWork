//С клавиатуры вводится любая строка. Если она пустая, выводится сообщение с просьбой повторить ввод.
//Далее с клавиатуры вводятся два символа (a и b), после чего нужно вывести строку,
//в которой все символы a нужно заменить на символы b. Пример: срока – «Java 11»,
//символы «1» и «H», результат «Java HH»
package HomeWork_3_String;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a;
        char c,b;
        System.out.print("Введите строку: ");
        a = scan.nextLine();
        while (a=="") {
            System.out.println("Строка не может быть пустой.");
            System.out.print("Введите повторно строку: ");
            a = scan.nextLine();
        }
        System.out.print("Символ который нужно заменить?: ");
        c = scan.next().charAt(0);
        System.out.print("На какой символ нужно заменить?: ");
        b = scan.next().charAt(0);

        char[] charArr = a.toCharArray();


        for (int i=0; i<charArr.length; i++) {
            if (charArr[i]==c){
                charArr[i]=b;
            }
        }

        String string = String.valueOf(charArr);
        System.out.println(string);

    }
}

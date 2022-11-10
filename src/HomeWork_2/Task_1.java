//Создать программу, проверяющую и сообщающую на экран, является ли целое число,
//записанное в переменную n, чётным либо нечётным
package HomeWork_2;

import methodClass.EvenOdd;

import java.util.Scanner;

public class Task_1 {
    
    public static void main(String[] args) {

        EvenOdd evenOdd = new EvenOdd();
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        evenOdd.n = scan.nextInt();

        System.out.println("Число " + evenOdd.n + evenOdd.getA() + ".");


//    String a = "";
//    if (n%2==0) {
//        //System.out.println("Число "+ n + " четное");
//        a = " четное";
//    }
//    else {
//        //System.out.println("Число "+n + " нечетное");
//        a = " нечетное";
//    }
//        System.out.println("Число " + n + a+".");
    }
}

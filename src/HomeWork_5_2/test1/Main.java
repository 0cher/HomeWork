package HomeWork_5_2.test1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IntArray massiv=new IntArray();
        int min;
        int max;

        System.out.println("Введите минимальное число в массиве: ");
        Scanner scan=new Scanner(System.in);
        min=scan.nextInt();
        System.out.println("Введите максимальное число в массиве: ");
        max=scan.nextInt();


        for (int i = 0; i < massiv.Lenght(); i++) {
            massiv.setArray((int) ((Math.random() * (max - min)) + min),i);

        }
        System.out.println("Массив1: ");
        massiv.Print();

        massiv.Sort(-1);
        System.out.println();
        massiv.Print();

        IntArray massiv1=new IntArray(5);
        System.out.println();
        System.out.println("Массив 2: ");

        for (int i = 0; i < massiv1.Lenght(); i++) {
            massiv1.setArray((int) ((Math.random() * (max - min)) + min),i);}
        massiv1.Print();
        massiv1.Sort(2);
        System.out.println();
        massiv1.Print();

        int[] massiv2=new int[7];
        System.out.println();
        System.out.println("Массив 3: ");

        for (int i = 0; i < massiv2.length; i++) {
            massiv2[i]=((int) ((Math.random() * (max - min)) + min));}
        IntArray mas=new IntArray(massiv2);
        mas.Print();
        mas.Sort(0);
        System.out.println();
        mas.Print();


    }

}

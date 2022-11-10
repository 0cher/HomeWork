//Распечатать все числа от 1 до 100, которые делятся на 5 без остатка. Используем цикл do-while.
package HomeWork_2_Cycle;

public class Task_2 {
    public static void main(String[] args) {

        int i = 1;
        int a = 100;
        do {
            if (i % 5 == 0) {
                System.out.println(i);
            }
            i = (int) (Math.random() * (101+1-99)) + 99;
        }
        while (i<=a);
    }
}

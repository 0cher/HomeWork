//Арифметические действия над числами пронумерованы следующим образом:
//1 — сложение, 2 — вычитание, 3 — умножение, 4 — деление.
//Дан номер действия N (целое число в диапазоне 1–4) и вещественные числа A и B (В не равно 0).
//Выполнить над числами указанное действие и вывести результат.

package HomeWork_2;

public class Task_5 {

    public static void main(String[] args) {

    int a, b, n, res;

    a = 10;
    b = 5;
    n = 2; //1 — сложение, 2 — вычитание, 3 — умножение, 4 — деление.
    res = 0;

        switch (n) {

            case 1:
                res = a+b;
                break;
            case 2:
                res = a-b;
                break;
            case 3:
                res = a*b;
                break;
            case 4:
                res = a/b;
        }
        System.out.println(res);

    }
}


//Даны три числа, каждое в своей переменной. Найти сумму двух наибольших из них

package HomeWork_2;

public class Task_3 {

    public static void main(String[] args) {

        int a,b,c, sum;

        a=1;
        b=2;
        c=3;
        sum = 0;

        if (a>=b & c>=b){
            sum = a+c;
        } else if (b>=a & c>=a) {
            sum = b+c;
        } else if (b>=c & a>=c) {
            sum = b+a;
        }

        System.out.println("Сумму наибольших чисел равна: " +sum);

    }

}

//Даны два целых числа A и B (A < B). Вывести в порядке убывания все целые числа,
//расположенные между A и B (не включая числа A и B), а также количество N этих чисел
package HomeWork_2_Cycle;

public class Task_4 {
    public static void main(String[] args) {

        int a,b;

        a=0;
        b=20;

        int [] arr = new int[b-a+1];
        for (int i=0; i<arr.length; i++){
            arr[i] = a;
            a++;
        }
        for (int i=arr.length-2; i>0; i--) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Количество символов: " +(arr.length-2));
    }
}

//Распечатать произвольное количество строк: “Task1”. “Task2”. …. Используем цикл while

package HomeWork_2_Cycle;

public class Task_1 {
    public static void main(String[] args) {

        String task= "Task";
        int n = 25;
        int t = 1;

        while (0<n) {
            System.out.println(task+t);
            t++;
            n--;
        }
    }
}

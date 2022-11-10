//Начальный вклад в банке равен 1000 руб. Через каждый месяц размер вклада увеличивается на P процентов
//от имеющейся суммы (P — вещественное число, 0<P< 25). По данному P определить, через сколько месяцев размер
//вклада превысит 1100 руб., и вывести найденное количество месяцев K (целое число)
//и итоговый размер вклада S (вещественное число).
package HomeWork_2_Cycle;
import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {


        int  ebit, time, percent;
        time=0;
        double deposit, p=0, total;
        Scanner scan = new Scanner(System.in);
        System.out.print("Сумма вклада: ");
        deposit = scan.nextInt();
        System.out.print("Ежемесячная % ставка: ");
        percent = scan.nextInt();
        System.out.print("Желаемый доход: ");
        ebit = scan.nextInt();
        total = ebit+deposit;

        while (deposit<total) {
            time++;
            double a = deposit/100*percent;
            if (deposit>=total) {
                break;
            } else if (deposit<total) {
                deposit=deposit+a;
            }
        }
        System.out.println("Необходимый срок депозита: "+time+" месяца(ев).");
        String result = String.format("%.2f",deposit);
        System.out.println("Общая сумма выплаты: "+result);
    }
}

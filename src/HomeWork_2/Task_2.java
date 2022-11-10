
//Создать программу, в которой проинициализировать переменную типа int,
//после чего вывести на экран день недели, соответствующий этому числу (1 – понедельник, 3 – среда и тд),
//если такого дня нет, вывести надпись, что такого дня нет. Сделать реализацию через if-else и через switch

package HomeWork_2;

public class Task_2 {

    public static void main(String[] args) {

        int n = 8;
        String a, b = "";

        if (n==1) {
            a = "monday";
        } else if (n==2) {
            a = "tuesday";
        } else if (n==3) {
            a = "wednesday";
        }
        else if (n==4) {
            a = "thursday";
        }
        else if (n==5) {
            a = "friday";
        }
        else if (n==6) {
            a = "saturday";
        }
        else if (n==7) {
            a = "sunday";
        }
        else {
            a = "error";
        }

        System.out.println("День недели: " + a + ".");


        switch (n) {
            case 1:
                a = "monday";
                break;
            case 2:
                a = "tuesday";
                break;
            case 3:
                a = "wednesday";
                break;
            case 4:
                a = "thursday";
                break;
            case 5:
                a = "friday";
                break;
            case 6:
                a = "saturday";
                break;
            case 7:
                a = "sunday";
                break;
            default:
                a = "error..";

        }

        System.out.println("День недели: " + a + ".");


    }
}

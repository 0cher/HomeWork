//Даны два целых числа: D (день) и M (месяц), определяющие правильную дату. Вывести знак Зодиака,
//соответствующий этой дате: «Водолей» (20.1–18.2), «Рыбы» (19.2–20.3), «Овен» (21.3–19.4),
//«Телец» (20.4–20.5), «Близнецы» (21.5–21.6), (22.6-22.7), «Лев» (23.7–22.8), «Дева» (23.8–22.9),
//«Весы» (23.9–22.10), «Скорпион» (23.10–22.11), «Стрелец» (23.11–21.12), «Козерог» (22.12–19.1).

        package HomeWork_2;

import methodClass.zodiacSigns;

import java.util.Scanner;

public class Task_7 {

    public static void main(String[] args) {


        int day, month;
        zodiacSigns zodiac = new zodiacSigns();
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите дату месяца: ");
        zodiac.day = scan.nextInt();

        System.out.print("Введите месяца: ");
        zodiac.month = scan.nextInt();

        System.out.println("Знак зодиака: "+zodiac.getA());

        //String a = "";

//        if (day>=20 & day<=31 & month==1 | day>=1 & day<=18 & month==2){
//            a = "Водолей";
//        } else if(day>=19 & day<=29 & month==2 | day>=1 & day<=20 & month==3){
//            a = "Рыбы";
//        } else if (day>=21 & day<=31 & month==3 | day>=1 & day<=19 & month==4) {
//            a = "Овен";
//        } else if (day>=20 & day<=30 & month==4 | day>=1 & day<=20 & month==5) {
//            a = "Телец";
//        }else if (day>=21 & day<=31 & month==5 | day>=1 & day<=21 & month==6) {
//            a = "Близнецы";
//        }else if (day>=22 & day<=31 & month==6 | day>=1 & day<=22 & month==7) {
//            a = "Рак";
//        }else if (day>=23 & day<=30 & month==7 | day>=1 & day<=22 & month==8) {
//            a = "Лев";
//        }else if (day>=23 & day<=31 & month==8 | day>=1 & day<=22 & month==9) {
//            a = "Дева";
//        }else if (day>=23 & day<=30 & month==9 | day>=1 & day<=22 & month==10) {
//            a = "Весы";
//        }else if (day>=23 & day<=31 & month==10 | day>=1 & day<=22 & month==11) {
//            a = "Скорпион";
//        }else if (day>=23 & day<=31 & month==11 | day>=1 & day<=21 & month==12) {
//            a = "Стрелец";
//        }else if (day>=23 & day<=31 & month==12 | day>=1 & day<=19 & month==1) {
//            a = "Козерог";
//        } else {
//            a = "Не верные данные";
//        }

        //System.out.println(a);

    }

}

package HomeWork_8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_5 {

    public static void main(String[] args) {

        String textDate = "1022/12/01 12:10";

        String strPattern = "^(\\d{1,4})[/|\s](\\d{1,2})[/|\s](\\d{1,2})\s(\\d{1,2})[:|\s](\\d{1,2})";

        Pattern pattern = Pattern.compile(strPattern);
        Matcher matcher = pattern.matcher(textDate);

        boolean check = false;
        while (matcher.find()){

            if (Integer.parseInt(matcher.group(1))<=2022&&Integer.parseInt(matcher.group(2))<=12&&
                    Integer.parseInt(matcher.group(3))<=30&&Integer.parseInt(matcher.group(4))<=24&&
                    Integer.parseInt(matcher.group(5))<=60){
                check = true;
                System.out.println(matcher.matches());
            }
        }
        if (!check){
            System.out.println(false);
        }
//     ________________________________________________________________________________________________________________________________________________________________________________

        String strPattern_2 = "^(0{0,3}\\d\\d?\\d?|[01]?\\d\\d\\d|20[01]\\d|202[0-2])[/|\s]((0?\\d)|(1[0-2]))[/|\s](0?[1-9]|[12]\\d|3[01])\s(((0?\\d)|(1\\d)|(2[0-4])):[0-5]\\d)";
        //System.out.println(Pattern.matches(strPattern_2,textDate));
        Pattern pattern_2 = Pattern.compile(strPattern_2);
        Matcher matcher_2 = pattern_2.matcher(textDate);

        System.out.println(matcher_2.matches());



    }
}

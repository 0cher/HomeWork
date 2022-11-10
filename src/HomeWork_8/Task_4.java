package HomeWork_8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_4 {
    public static void main(String[] args) {

        String str = "ab abab abab abababab abea";
        String strPattern = "[ab]\\w+";

        Pattern pattern = Pattern.compile(strPattern);
        Matcher matcher = pattern.matcher(str);
        System.out.println("вариант нр.1");

        while (matcher.find()){
            System.out.println(matcher.group());
        }

        System.out.println();
        String strPattern2 = "ab+";

        Pattern pattern2 = Pattern.compile(strPattern2);
        Matcher matcher2 = pattern2.matcher(str);

        System.out.println("вариант нр.2");

        while (matcher2.find()){
            System.out.println(matcher2.group());
        }
    }
}

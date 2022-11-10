package HomeWork_8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_2 {

    public static void main(String[] args) {

        String strPattern = ".+\\.com";
        String strText1 = "hello.com";
        String strText2 = "hello.net";

        Pattern pattern = Pattern.compile(strPattern);
        Matcher matcher1 = pattern.matcher(strText1);
        Matcher matcher2 = pattern.matcher(strText2);

        System.out.println(matcher1.matches());
        System.out.println(matcher2.matches());


    }
}

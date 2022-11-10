package HomeWork_8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_3 {

    public static void main(String[] args) {

        String str = "ahb acb aeb aeeb adcb axeb";
        String strPattern = "a.b";

        Pattern pattern = Pattern.compile(strPattern);
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}

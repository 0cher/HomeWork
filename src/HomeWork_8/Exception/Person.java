package HomeWork_8.Exception;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {
    private int age;
    private String name;
    private String surname;
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public void setAgeNameSurname (String ageNameSurname) throws IncorrectInfoException{
        String patternNameSurname = "([\\wа-яА-Я]{0,100}),?\s([\\wа-яА-Я]{0,100}),?\s.+";
        Pattern patternNS = Pattern.compile(patternNameSurname);
        Matcher matcherNS = patternNS.matcher(ageNameSurname);
        if (!matcherNS.matches()){
            throw new IncorrectInfoException("Имя или фамилия введены не корректно");
        }
        String patternAge = ".*\s([0-9][0-9]?)";
        Pattern patternA = Pattern.compile(patternAge);
        Matcher matcherA = patternA.matcher(ageNameSurname);
        if (!matcherA.matches()){
            throw new IncorrectInfoException("не корректный возраст");
        }
        if (matcherNS.matches()&&matcherA.matches()){
            this.name = matcherNS.group(1).substring(0,1).toUpperCase()+
                    matcherNS.group(1).substring(1);
            this.surname =matcherNS.group(2).substring(0,1).toUpperCase()+
                    matcherNS.group(2).substring(1);
            this.age = Integer.parseInt(matcherA.group(1));
        }
    }
}

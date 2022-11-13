package HomeWork_8.Exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        Scanner scan = new Scanner(System.in);
        Person person = new Person();

        try {
            System.out.print("Введите Ваше имя, фамилия и ваш возраст: ");
            person.setAgeNameSurname(scan.nextLine());

        }catch (IncorrectInfoException e){
                      // e.printStackTrace();
            System.err.println(e.getMessage());
            throw new RuntimeException("error",e);
        }
        System.out.println("Мы Вас приветствуем "+person.getName()+" "+person.getSurname());
        System.out.println("Ваш возраст: " +person.getAge());
    }
}

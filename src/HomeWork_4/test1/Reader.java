package HomeWork_4.test1;

import java.util.Scanner;

public class Reader {
    Scanner cons = new Scanner(System.in);
    String family, name, surname, faculty, birthday, phfone;
    int numberCardReader;
    Book [] booksList;
    int a;
    Reader () {
        System.out.println("Введите фамилию читателя");
        family = cons.next();

        System.out.println("Введите имя читателя");
        name = cons.next();

        System.out.println("Введите отчество читателя");
        surname = cons.next();

        System.out.println("Введите дату рождения читателя");
        birthday = cons.nextLine();
        cons.nextLine();

        System.out.println("Введите название факультета, на котором обучается читатель");
        faculty = cons.nextLine();

        System.out.println("Введите контактный телефон читателя");
        phfone = cons.nextLine();

        System.out.println("Введите номер читательского билета");
        numberCardReader = cons.nextInt();

        booksList = new Book[10];
    }

    void takeBook(){

        boolean isFull = true;
        for (int i = 0; i < booksList.length-1; i++){
            if (booksList[i] == null){
                booksList[i] = new Book();
                System.out.println(family + name.charAt(0) + "." + surname.charAt(0) +". взял книгу: " + booksList[i].name);
                isFull = false;
                break;
            }
        }if (isFull){
            System.out.println("Читатель взял максмальное количество книг. Он должен вернуть хотя-бы одну");
        }
    }

    void returnBook(String str){
        boolean bl = false;
        for (Book b: booksList) {
            if ( b.name.equals(str)){
                b = null;
                System.out.println(family + name.charAt(0) + "." + surname.charAt(0) +". вернул книгу " + str);
                bl = true;
                break;
            }
        }
        if (!bl){
            System.out.println(family + name.charAt(0) + "." + surname.charAt(0) +". не хранит книгу " + str);
        }

    }

    void printStatus() {
        int count = 0;
        for (Book b: booksList) {
            if (b != null) {
                count++;
            }
        }
        System.out.println(family + name.charAt(0) + "." + surname.charAt(0) + ". взял " + count + " книги:");
        for (Book b: booksList) {
            if(b != null){System.out.println(b.name);}
        }
        System.out.println();
    }

}

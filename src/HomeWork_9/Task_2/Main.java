package HomeWork_9.Task_2;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static HomeWork_9.Task_2.FileUtil.restoreReadersList;
import static HomeWork_9.Task_2.FileUtil.saveReadersList;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        CheckNumber checkInt = new CheckNumber();
        int action;
        Map<Integer, Reader> readers = new HashMap<>();

        //readers.put(1, new Reader("Aleksejs", "Ziznevskis", 26440725, "10.11",1));
        int id=1;
        Book[] books = new Book[10];

        try (ObjectInputStream reader = new ObjectInputStream(new FileInputStream(
                "C:\\Users\\Aleksejs\\IdeaProjects\\HomeWork\\src\\HomeWork_9\\Task_2\\person.dat"))){

            readers = (Map<Integer, Reader>) reader.readObject();
            System.out.println("Test Start");


        }catch (Exception e){
            e.printStackTrace();
        }
        //restoreReadersList(readers);

        books[0] = new Book("Мастер и Маргарита","Михаил Булгаков",	"Роман",0, 1);
        books[1] = new Book("Война и мир","Лев Николаевич Толстой","Роман-эпопея",1, 4);

        do {
            System.out.println("1-Добавить нового читателя");
            System.out.println("2-Читатель хочет взять книгу");
            System.out.println("3-Читатель хочет вернуть книгу");
            System.out.println("4-Вывести статус читателя");
            System.out.println("5-Вывести статус всех читателей");
            System.out.println("6-Выйти из программы");
            System.out.println();
            System.out.print("Введите номер действия: ");
            checkInt.getNumber("Введите номер действия: ");
            action=checkInt.action;
//            action=scan.nextInt();
//            System.out.println();

            System.out.println();
           // scan.next();

            switch (action){
                case 1: {
                            id++;
                            int readerId = id;
                            readers.put(readerId,new Reader(readerId));
                            System.out.println("Ваш номер билета: "+readerId);
                            System.out.println();
                            break;
                }
                case 2: {
                    System.out.print("Введите название книги или автора: ");
                    String str = scan.next();
                    int index=0;
                    boolean bookFound = false;
                    for (int i=0; i< books.length; i++){
                        int a = -1;
                        if (books[i]!=null && books[i].numberBook!=0 &           // str!="" &&
                                (books[i].bookAuthor.indexOf(str)!=a || books[i].bookName.indexOf(str)!=a)) {
                            index = i;
                            System.out.println("Книга найдена");
                            System.out.println(books[i].getBookAuthor());
                            bookFound = true;
                            break;
                            }
                        }
                        if (!bookFound) {
                            System.out.println("Книга не найдена");
                            break;
                        }
                    System.out.print("Введите ваш номер пользователя: ");
                    int readerId = scan.nextInt();

                     try {
                        readers.get(readerId).b=0;
                        readers.get(readerId).takeBook(books[index].bookName,
                                books[index].bookAuthor, books[index].bookId,readers.get(readerId).b); //takeBook
                        books[index].numberBook-=readers.get(readerId).b;
                        break;

                     }catch (Exception e){
                         System.err.println("Зарегистрируйте пользователя");
                         //break;
                     }
                     finally {
                         break;
                     }

                }
                case 3:{
                    System.out.println("Введите название книги или автора: ");
                    String str = scan.next();
                    int index=0;
                    boolean bookFound = false;
                    for (int i=0; i< books.length; i++){
                        int a = -1;
                        if (books[i]!=null &&
                                (books[i].bookAuthor.indexOf(str)!=a || books[i].bookName.indexOf(str)!=a)) {
                            index = i;
                            System.out.println("Книга найдена");
                            System.out.println(books[i].getBookAuthor());
                            bookFound = true;
                            break;
                        }
                    } if (!bookFound) {
                        System.out.println("Данная книга не является нашей");
                        break;
                    }
                    System.out.println("Введите ваш номер пользователя: ");
                    int readerId = scan.nextInt();

                    if (readers.get(readerId)!=null){
                        readers.get(readerId).returnBook(index);
                        books[index].numberBook++;
                        break;
                    }break;
                }
                case 4:{
                    System.out.print("Введите номер пользователя: ");
                    int readerId = scan.nextInt();
                    try {
                        readers.get(readerId).printStatus();
                        break;

                    }catch (Exception e){
                        System.err.println("Такого пользователя нету");
                    break;
                    }
                }
                case 5:{

                    for (Map.Entry<Integer, Reader> item : readers.entrySet()){
                        item.getValue().printStatus();
                    }break;
                }
                case 6: {
                    System.out.println("Завершение программы");
                    break;
                } default: {
                    System.out.println("Попробуйте еще раз");
                    System.out.println();
                }
            }

        }while (action!=6);

        saveReadersList(readers);


    }
}

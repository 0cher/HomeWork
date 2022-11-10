package HomeWork_4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in, "cp1251");
        CheckNumber checkInt = new CheckNumber();
        int action;

        Reader[] readers = new Reader[10];
        readers[0] = new Reader("Aleksejs", "Ziznevskis", 26440725, "10.11",1);

        Book[] books = new Book[10];

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
                    boolean isFull=true;
                    for (int i=0; i< readers.length; i++){
                        if (readers[i]==null){
                            int readerId = i+1;
                            readers[i] = new Reader(readerId);
                            System.out.println("Ваш номер билета: "+readerId);
                            System.out.println();
                            isFull=false;
                            break;
                        }
                    }
                    if (isFull){
                        System.out.println("Количество читателей уже максимум");
                    }
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
                    boolean found=false;
                    for (int i=0; i<readers.length; i++){   //i<readers.length-1
                        if (readers[i]!=null && readers[i].readerID==readerId){
                            readers[i].b = 0;
                            readers[i].takeBook(books[index].bookName,
                                    books[index].bookAuthor, books[index].bookId, readers[i].b );   //takeBook

                            books[index].numberBook-=readers[i].b;

                            found=true;
                            break;
                        }
                    }
                    if (!found){
                        System.out.println("Зарегистрируйте пользователя");
                    }
                    break;
                }
                case 3:{
                    System.out.println("Введите название книги или автора: ");
                    String str = scan.nextLine();
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

                    for (int i=0; i<readers.length; i++){   //i<readers.length-1
                        if (readers[i]!=null && readers[i].readerID==readerId){
                            readers[i].returnBook(books[index].bookId);
                            books[index].numberBook++;
 //                         System.out.println(books[index].volumeBook);
                            break;
                        }
                    }break;
                }
                case 4:{
                    System.out.print("Введите номер пользователя: ");
                    int readerId = scan.nextInt();
                    int a=0;
                    boolean found=false;
                    for (int i=0; i<readers.length; i++){   //i<readers.length-1
                        if (readers[i]!=null && readers[i].readerID==readerId) {
                            found = true;
                            readers[i].printStatus();
                        }
                } if (!found){
                        System.out.println("Такого пользователя нету");
                    }break;
                }
                case 5:{

                    for (Reader r:readers){
                        if (r!=null) {
                            r.printStatus();
                         }
                    } break;
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

//        for (int i=0;i< books.length;i++){
//            System.out.println(books[i].numberBook +" " + books[i].bookName);
//        }
    }
}

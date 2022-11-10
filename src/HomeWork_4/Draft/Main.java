package HomeWork_4.Draft;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in, "cp1251");
        int action;

        Reader[] readers = new Reader[10];

        readers[0] = new Reader("Aleksejs", "Ziznevskis", 26440725, "10.11",1);

        Book[] books = new Book[10];

        books[0] = new Book("Мастер и Маргарита","Михаил Булгаков",	"Роман",0, 1);
        books[1] = new Book("Война и мир","Лев Николаевич Толстой","Роман-эпопея",1, 1);


        Reader[] bookId = new Reader[10];

        do {
            System.out.println("1-Добавить нового читателя");
            System.out.println("2-Читатель хочет взять книгу");
            System.out.println("3-Читатель хочет вернуть книгу");
            System.out.println("4-Вывести статус читателя");
            System.out.println("5-Вывести статус всех читателей");
            System.out.println("6-Выйти из программы");
            System.out.println();
            System.out.print("Введите номер действия: ");
            action=scan.nextInt();
            System.out.println();
            scan.nextLine();

            switch (action){
                case 1: {
                    boolean isFull=true;
                    for (int i=0; i< readers.length; i++){
                        if (readers[i]==null){
                            System.out.print("Введите имя: ");
                            String name = scan.nextLine();
                            System.out.print("Введите фамилию: ");
                            String surname = scan.nextLine();
                            System.out.print("Введите номер телефона: ");
                            int telNumber = scan.nextInt();
                            System.out.print("Введите дату рождения: ");
                            String dataOfBirth = scan.next();
                            int readerId = i+1;
                            readers[i] = new Reader(name,surname,telNumber,dataOfBirth, readerId);
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
                    System.out.println("Введите название книги или автора: ");
                    String str = scan.nextLine();
                    int index=0;
                    boolean bookFound = false;
                    for (int i=0; i< books.length; i++){
                        int a = -1;
                        if (books[i]!=null && books[i].volumeBook!=0 &
                                (books[i].bookAuthor.indexOf(str)!=a || books[i].bookName.indexOf(str)!=a)) {     //index !? books[i]!=null && books[i].volumeBook!=0 &
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
                    System.out.println("Введите ваш номер пользователя: ");
                    int readerId = scan.nextInt();
                    boolean found=false;
                    for (int i=0; i<readers.length; i++){   //i<readers.length-1
                        if (readers[i]!=null && readers[i].readerID==readerId){
                            int temp=0;
                            if (bookId[index]!=null) {
                                temp = bookId[index].volume;
                            }
                            bookId[index] = new Reader(readerId,index,temp+1);
                            books[index].volumeBook--;
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
                                (books[i].bookAuthor.indexOf(str)!=a || books[i].bookName.indexOf(str)!=a)) {     //index !? books[i]!=null && books[i].volumeBook!=0 &
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
                    boolean found=false;
                    for (int i=0; i<readers.length; i++){   //i<readers.length-1
                        if (readers[i]!=null && readers[i].readerID==readerId && bookId[index].volume>0){
                            bookId[index].volume--;
                            books[index].volumeBook++;
 //                         System.out.println(books[index].volumeBook);
                            found=true;
                            break;
                        }
                    }
                    if (!found){
                        System.out.println("На вас не числиться данная книга");
                    }break;
                }
                case 4:{
                    System.out.println("Введите ваш номер пользователя: ");
                    int readerId = scan.nextInt();
                    int a=0;
                    boolean found=false;
                    for (int i=0; i<readers.length; i++){   //i<readers.length-1
                        if (readers[i]!=null && readers[i].readerID==readerId) {
                            found = true;
                            for (int j = 0; j < bookId.length; j++) {

                                if (bookId[j]!=null && bookId[j].readerID == readerId) {
                                    System.out.println("Пользователь "+readers[readerId-1].getNameSurname()+ " взял "+
                                            " книгу(и): ");
                                    System.out.println(books[bookId[j].bookID].getBookAuthor());
                                }
                            }break;

                        }
                } if (!found){
                        System.out.println("Такого пользователя нету");
                    }break;
                }
                case 5:{
                    for (int i=0; i< readers.length;i++){
                        if (readers[i]!=null){
                            for (int j=0; j< bookId.length;j++)
                                if (bookId[j]!=null && bookId[j].readerID==readers[i].readerID){
                                    System.out.println("Пользователь "+readers[i].getNameSurname()+ " взял "+" книгу(и): ");
                                    System.out.println(books[bookId[j].bookID].getBookAuthor());
                                    System.out.println();
                                }
                        }
                    }
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


//        System.out.println(readers[0].name);
//        System.out.println(readers[0].surname);
//        System.out.println(readers[0].telNumber);
//        System.out.println(readers[0].dateOfBirth);
//        System.out.println(readers[0].readerID);
//        System.out.println();


    }
}

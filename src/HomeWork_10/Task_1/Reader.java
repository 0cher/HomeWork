package HomeWork_10.Task_1;

import java.io.Serializable;
import java.util.Scanner;
public class Reader implements Serializable {


   private transient Scanner scan = new  Scanner(System.in);
   Book[] books;
   private String name, surname, dateOfBirth;
   private int telNumber;
   private int readerID;
    int b;

    public Reader(String name, String surname,
                  int telNumber, String dateOfBirth,
                  int readerID){
        this.name=name;
        this.surname=surname;
        this.telNumber=telNumber;
        this.dateOfBirth=dateOfBirth;
        this.readerID = readerID;

        books = new Book[10];
    }
    public Reader(int readerID){
        System.out.print("Введите имя: ");
         name = scan.nextLine();
        System.out.print("Введите фамилию: ");
         surname = scan.nextLine();
        System.out.print("Введите номер телефона: ");
        telNumber = scan.nextInt();
        System.out.print("Введите дату рождения: ");
        dateOfBirth = scan.next();
        this.readerID = readerID;

        books = new Book[10];

    }
     int takeBook (String bookName, String bookAuthor,
                   int bookID, int a) {
        b=a;
        boolean isFull = true;
        for (int i = 0; i < books.length; i++){
            if (books[i] != null &&books[i].bookId == bookID){  //&&books[i].bookName.equals(bookName)
                books[i].numberBook++;
                System.out.println("Книга выдана тест1");
                //isFull = false;
                return b++;
                //break;
                //System.out.println();
            } else if (books[i] == null) {
                books[i] = new Book(bookName, bookAuthor, bookID, 1);
                //isFull = false;
                System.out.println("Книга выдана тест2");
                return b++;
                //break;
            }
        }if (!isFull){
             System.out.println("У вас максимальное число книг");
        }return b;
    }
    void returnBook (int bookID) {
        boolean isFound = false;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].numberBook >= 2 &&
                    books[i].bookId==bookID){
                books[i].numberBook--;
                System.out.println("Книга принята.\nНа вас еще числиться "+books[i].numberBook
                        +" книга(и) "+books[i].bookName);
                System.out.println();
                isFound = true;
                break;
            }
            else if (books[i] != null && books[i].numberBook == 1 &&
                    books[i].bookId==bookID) {
                books[i] = null;
                System.out.println("Книга принята");
                System.out.println();
                isFound = true;
                break;
            }
        } if (!isFound){
            System.out.println("На вас не числиться данная книга");
            System.out.println();
        }
    }
    void printStatus(){
        int j = 0;
        for (int i=0; i<books.length;i++){
            if(books[i]!=null && books[i].numberBook>0){
                j +=books[i].numberBook;
                System.out.println(name+" "+surname+" взял "
                        +books[i].numberBook+ " книгу(и) "+books[i].bookName);
            }
        }if (j>1) {
            System.out.println("Всего " + j + " книги.");
        }
    }

    public int getReaderID() {
        return readerID;
    }
}

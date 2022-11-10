package HomeWork_4.Draft;

public class Reader {
    Book [] books;
    String name, surname, dateOfBirth;

    int telNumber;
    String faculty;
    int readerID;
    int bookID;
    int volume;

    //Методы takeBook, returnBook, printStatus
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
    public Reader  (int readerID, int bookID, int volume){

        this.readerID=readerID;
        this.bookID=bookID;
        this.volume =volume;
    }

    public String test (){
        return name;
    }
    public String getNameSurname (){
        return name + " " +surname;
    }
//    public Reader(int size) {
//        books1 = new Book[size];}

    }

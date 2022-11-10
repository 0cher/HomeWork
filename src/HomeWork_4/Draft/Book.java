package HomeWork_4.Draft;

public class Book {
    String bookName;
    String bookAuthor;
    String bookDescription;
    int bookId;
    int volumeBook;

    public Book(String bookName, String bookAuthor, String bookDescription,
                int bookId, int volumeBook){

        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookDescription = bookDescription;
        this.bookId=bookId;
        this.volumeBook=volumeBook;
  }
   public String getBookAuthor (){

        return bookAuthor+ " "+ bookName;

     }
}

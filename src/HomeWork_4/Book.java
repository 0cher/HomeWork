package HomeWork_4;

public class Book {
    String bookName;
    String bookAuthor;
    String bookDescription;
    int bookId;
    int numberBook;

    public Book(String bookName, String bookAuthor, String bookDescription,
                int bookId, int numberBook){

        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookDescription = bookDescription;
        this.bookId=bookId;
        this.numberBook=numberBook;
  }
  public Book (String bookName, String bookAuthor,
               int bookId, int numberBook){
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookId = bookId;
        this.numberBook=numberBook;
  }
   public String getBookAuthor (){

        return "Книга: "+bookName+", "+ bookAuthor;

     }
}

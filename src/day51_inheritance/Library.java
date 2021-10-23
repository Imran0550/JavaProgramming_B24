package day51_inheritance;

public class Library {
    public static void main(String[] args) {

        Book book = new Book();
        System.out.println(book.author = "Saim");
// book reference has access to 6 instance variables which were made in the Book class
        AudioBook audioBook = new AudioBook();
        System.out.println(  audioBook.narrator = "Saim");
        System.out.println(audioBook.title = "Danmenger");
         audioBook.listen();

         EBook eBook = new EBook();
         eBook.pages = 50;

         eBook.title = "Khatar";
         // ebook referance has access to 8 instance variables. 6 from the book class and 2 from Ebook class
         eBook.read();



    }
}

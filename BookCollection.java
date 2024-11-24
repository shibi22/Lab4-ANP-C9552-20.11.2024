import java.util.ArrayList;

class Book {
    private int bookId;
    private String bookName;
	private String genre;
    private String authorName;

    // Parameterized constructor
    public Book(int bookId, String bookName, String genre,String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
		 this.genre = genre;
        this.authorName = authorName;
    }

    // Overriding toString() for convenient display
    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Book Name: " + bookName + ", genre Name: " + genre + ", Author Name: " + authorName;
    }
}

public class BookCollection {
    public static void main(String[] args) {
       
        ArrayList<Book> bookList = new ArrayList<>();  //  ArrayList to store Book objects

        // Add books using the parameterized constructor
        bookList.add(new Book(1, "jigilibugili","comedy", "J.K. Rowling"));
        bookList.add(new Book(2, "jill jung juk", "action,thriller","F. Scott Fitzgerald"));
        bookList.add(new Book(3, "sombu mavan","drama", "Herman Melville"));
        bookList.add(new Book(4, "sombu father","drama", "Homer"));

        // Advanced for loop to display all book details
        System.out.println("Book Details:");
        for (Book book : bookList) {
            System.out.println(book);
        }
    }
}

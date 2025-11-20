import java.util.ArrayList;

class Book {
    int bookId;
    String title;
    String author;
    boolean isIssued;
    
    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }
}

class User {
    int userId;
    String name;
    
    User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }
}

public class Library {
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<User> users = new ArrayList<>();
    
    void issueBook(int bookId) {
        for (Book b : books) {
            if (b.bookId == bookId && !b.isIssued) {
                b.isIssued = true;
                break;
            }
        }
    }
    
    void returnBook(int bookId) {
        for (Book b : books) {
            if (b.bookId == bookId && b.isIssued) {
                b.isIssued = false;
                break;
            }
        }
    }
}
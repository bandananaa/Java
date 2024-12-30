package workshop4;

import java.util.ArrayList;

public class LibraryService {

    private ArrayList<String> books;

    public LibraryService() {
        books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(String bookTitle) {
        books.add(bookTitle);
    }

    // Method to search for a book by its title
    public boolean searchBook(String bookTitle) {
        return books.contains(bookTitle);
    }

    // Method to get all books (for verification)
    public ArrayList<String> getAllBooks() {
        return books;
    }
}

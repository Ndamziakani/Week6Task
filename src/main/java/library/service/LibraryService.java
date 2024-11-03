package library.service;


import library.models.Book;
import library.models.Person;

import java.util.HashMap;
import java.util.Map;

public class LibraryService {
    private Map<String, Book> books = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getTitle(), book);
    }

    public String borrowBook(Person person, String bookTitle) {
        Book book = books.get(bookTitle);
        if (book == null) {
            return "Book not found.";
        }
        if (book.getAvailableCopies() == 0) {
            return "Book taken.";
        }

        if (book.borrow()) {
            return person.getName() + " (Priority: " + person.getPriority() + ") borrowed " + bookTitle;
        }
        return "No copies available.";
    }

    public void returnBook(String bookTitle) {
        Book book = books.get(bookTitle);
        if (book != null) {
            book.returnBook();
        }
    }
}
package service;

import model.Book;
import java.util.ArrayList;

public class LibraryService {

    private ArrayList<Book> books;

    public LibraryService() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }
    
    public void displayBooks() {
        
        if (books.isEmpty()) {
            System.out.println("No books available.");
        }
        else
            for (Book book : books) {
            System.out.println("=====================================");
            System.out.println();
            System.out.println("BookId    : " + book.getBookId());
            System.out.println("Title     : " + book.getTitle());
            System.out.println("Author    : " + book.getAuthor());
            System.out.println("Genre     : " + book.getGenre());
            System.out.println("Publisher : " + book.getPublisher());
            System.out.println("Status    : " + book.isAvailiable());
            System.out.println();
            System.out.println("=====================================");
        }
    }
    
    public Book searchBook(int BookId) {

        for (Book book : books) {
            if (BookId == book.getBookId())
            return book;    
        }    
    return null;
    }
    
}
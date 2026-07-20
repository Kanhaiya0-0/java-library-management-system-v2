package model;

public class Book {

    private int bookId;
    private String title;
    private String author;
    private String genre;
    private String publisher;
    private boolean availiable;
    public Book(int bookId, String title, String author, String genre, String publisher, boolean availiable) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publisher = publisher;
        this.availiable = availiable;
    }
    
}
package model;

public class Book {

    private int bookId;
    private String title;
    private String author;
    private String genre;
    private String publisher;
    private boolean availiable;
    
    public Book(int bookId, String title, String author, String genre, String publisher) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publisher = publisher;
        this.availiable = true;
    }
    
    public int getBookId() {
        return bookId;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getGenre() {
        return genre;
    }
    public String getPublisher() {
        return publisher;
    }
    public boolean isAvailiable() {
        return availiable;
    }

    
}
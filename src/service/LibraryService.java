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
}
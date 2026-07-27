import java.util.Scanner;
import model.Book;
import service.LibraryService;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LibraryService library = new LibraryService();

        while (true) {
            System.out.println("===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Borrow Book");
            System.out.println("5. Exit");
            System.out.println("=====================================");
            System.out.println();
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the book id: ");
                    int bookId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter the title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter the author: ");
                    String author = sc.nextLine();
                    System.out.print("Enter genre of the book: ");
                    String genre = sc.nextLine();
                    System.out.print("Enter the publisher: ");
                    String publisher = sc.nextLine();
                    Book book = new Book(bookId, title, author, genre, publisher);
                    library.addBook(book);
                    System.out.println("Book added successfully!");
                    break;
                case 2:
                    library.displayBooks();
                    break;
                case 3:
                    System.out.print("Enter Book ID: ");    
                    int BookId = sc.nextInt();
                    sc.nextLine();
                    Book foundBook = library.searchBook(BookId);
                    if (foundBook == null) {
                        System.out.println("Book not found.");
                    } else {
                        System.out.println("=====================================");
                        System.out.println();
                        System.out.println("BookId    : " + foundBook.getBookId());
                        System.out.println("Title     : " + foundBook.getTitle());
                        System.out.println("Author    : " + foundBook.getAuthor());
                        System.out.println("Genre     : " + foundBook.getGenre());
                        System.out.println("Publisher : " + foundBook.getPublisher());
                        System.out.println("Status    : " + 
                                            (foundBook.isAvailable() ? "Availiable" : "Borrowed"));
                        System.out.println();
                        System.out.println("=====================================");
                    }
                case 4:
                    System.out.print("Enter Book ID: ");    
                    int bookID = sc.nextInt();
                    sc.nextLine();

                    boolean borrowed = library.borrowBook(bookID);
                    
                    if (borrowed) {
                        System.out.println("Book Borrowed Successfully!");
                    }
                    else {
                        System.out.println("Book Unavailable");
                    }
                case 5:
                    System.out.println("Thank you for using our service!");
                    sc.close();
                    return; // return exits the switch and the function that is running the switch loop
                    default:
                    System.out.println("Enter a valid choice.");
            }         
        System.out.println();
        }
    }
}
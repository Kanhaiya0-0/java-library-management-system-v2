import java.util.Scanner;
import model.Book;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LibraryService library = new LibraryService();

        while (true) {
            System.out.println("===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Exit");
            System.out.println("=====================================");
            System.out.println();
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the book id: ");
                    int bookId = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the title: ");
                    String title = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Enter the author: ");
                    String author = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Enter genre of the book: ");
                    String genre = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Enter the publisher: ");
                    String publisher = sc.nextLine();
                    sc.nextLine();
                    Book book = new Book(bookId, title, author, genre, publisher);
                    library.addBook(book);
                    System.out.println("Book added successfully!");
                    break;
                case 2:
                    //code goes here
                    break;
                case 3:
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
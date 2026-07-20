import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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
                    //code goes here
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
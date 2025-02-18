import java.util.Scanner;

public class librarymanagement24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bookTitles = {
            "Harry Potter",
            "Lord of The Ring",
            "The Alchemist",
            "Sherlock Holmes"
        };
        String[] ISBNs = {
            "978-3-16-148410-0",
            "978-1-843-56710-2",
            "978-0-06-231500-7",
            "978-1-566-19310-3"
        };
        boolean[] availabilityStatus = {true, true, false, true};

        while (true) {
            mainMenu(scanner, bookTitles, ISBNs, availabilityStatus);

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 5) {
                System.out.println("Exiting program.");
                break;
            }

            switch (choice) {
                case 1:
                    displayBooks(bookTitles, ISBNs, availabilityStatus);
                    break;
                case 2:
                    borrowBook(scanner, bookTitles, ISBNs, availabilityStatus);
                    break;
                case 3:
                    returnBook(scanner, bookTitles, ISBNs, availabilityStatus);
                    break;
                default:
                    System.out.println("Thank you for visiting the library.");
            }
        }
        scanner.close();
    }

    public static void mainMenu(Scanner scanner, String[] bookTitles, String[] ISBNs, boolean[] availabilityStatus) {
        System.out.println("\nLibrary Management System");
        System.out.println("1. Display Books");
        System.out.println("2. Borrow Book");
        System.out.println("3. Return Book");
        System.out.println("4. Exit");
    }

    public static void displayBooks(String[] bookTitles, String[] ISBNs, boolean[] availabilityStatus) {
        System.out.println("\nAvailable Books:");
        for (int i = 0; i < bookTitles.length; i++) {
            System.out.println((i + 1) + ". " + bookTitles[i] + " (ISBN: " + ISBNs[i] + ") - " +
                    (availabilityStatus[i] ? "Available" : "Not Available"));
        }
    }

    public static void borrowBook(Scanner scanner, String[] bookTitles, String[] ISBNs, boolean[] availabilityStatus) {
        displayBooks(bookTitles, ISBNs, availabilityStatus);
        System.out.print("\nEnter the number of the book you want to borrow: ");
        int bookNumber = scanner.nextInt();
        scanner.nextLine();

        if (bookNumber < 1 || bookNumber > bookTitles.length) {
            System.out.println("Invalid book number.");
        } else if (!availabilityStatus[bookNumber - 1]) {
            System.out.println("Sorry, this book is already borrowed.");
        } else {
            availabilityStatus[bookNumber - 1] = false;
            System.out.println("You have successfully borrowed: " + bookTitles[bookNumber - 1]);
        }
    }

    public static void returnBook(Scanner scanner, String[] bookTitles, String[] ISBNs, boolean[] availabilityStatus) {
        displayBooks(bookTitles, ISBNs, availabilityStatus);
        System.out.print("\nEnter the number of the book you want to return: ");
        int bookNumber = scanner.nextInt();
        scanner.nextLine(); 

        if (bookNumber < 1 || bookNumber > bookTitles.length) {
            System.out.println("Invalid book number.");
        } else if (availabilityStatus[bookNumber - 1]) {
            System.out.println("This book was not borrowed.");
        } else {
            availabilityStatus[bookNumber - 1] = true;
            System.out.println("Thank you for returning: " + bookTitles[bookNumber - 1]);
        }
    }
}

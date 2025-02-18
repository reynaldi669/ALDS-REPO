import java.util.Scanner;

public class CinemaSeating {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] seats = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                seats[i][j] = 0;
            }
        }

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Book a seat");
            System.out.println("2. Cancel a booking");
            System.out.println("3. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter row number (0-4): ");
                    int row = scanner.nextInt();
                    System.out.print("Enter column number (0-4): ");
                    int col = scanner.nextInt();

                    if (row >= 0 && row < 5 && col >= 0 && col < 5) {
                        if (seats[row][col] == 0) {
                            seats[row][col] = 1;
                            System.out.println("Seat successfully booked.");
                        } else {
                            System.out.println("Seat already booked.");
                        }
                    } else {
                        System.out.println("Invalid seat selection.");
                    }
                    break;

                case 2:
                    System.out.print("Enter row number (0-4): ");
                    row = scanner.nextInt();
                    System.out.print("Enter column number (0-4): ");
                    col = scanner.nextInt();

                    if (row >= 0 && row < 5 && col >= 0 && col < 5) {
                        if (seats[row][col] == 1) {
                            seats[row][col] = 0;
                            System.out.println("Booking successfully canceled.");
                        } else {
                            System.out.println("Seat is not currently booked.");
                        }
                    } else {
                        System.out.println("Invalid seat selection.");
                    }
                    break;

                case 3:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }

            System.out.println("\nCurrent Seating Arrangement:");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(seats[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}

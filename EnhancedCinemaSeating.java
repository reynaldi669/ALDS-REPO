import java.util.Scanner;

public class EnhancedCinemaSeating {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] seatingArrangement = new int[5][5];
        int totalBookedSeats = 0;
        int totalEarnings = 0;
        final int SEAT_PRICE = 10;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                seatingArrangement[i][j] = 0;
            }
        }

        while (true) {
            System.out.println("\nCurrent Seating Arrangement:");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(seatingArrangement[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Total Booked Seats: " + totalBookedSeats);
            System.out.println("Total Available Seats: " + (25 - totalBookedSeats));
            System.out.println("Total Earnings: $" + totalEarnings);

            System.out.println("\nMenu:");
            System.out.println("1. Book a Seat");
            System.out.println("2. Cancel a Booking");
            System.out.println("3. Exit");

            System.out.print("\nChoose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter row number (0-4): ");
                    int row = scanner.nextInt();
                    System.out.print("Enter column number (0-4): ");
                    int column = scanner.nextInt();

                    if (row >= 0 && row < 5 && column >= 0 && column < 5) {
                        if (seatingArrangement[row][column] == 0) {

                            seatingArrangement[row][column] = 1;
                            totalBookedSeats++;
                            totalEarnings += SEAT_PRICE;
                            System.out.println("Seat successfully booked for $" + SEAT_PRICE + ".");
                        } else {
                            System.out.println("Seat is already booked. Please choose a different seat.");
                        }
                    } else {
                        System.out.println("Invalid seat selection. Please enter a valid row and column.");
                    }
                    break;

                case 2:
                    System.out.print("Enter row number (0-4): ");
                    row = scanner.nextInt();
                    System.out.print("Enter column number (0-4): ");
                    column = scanner.nextInt();

                    if (row >= 0 && row < 5 && column >= 0 && column < 5) {
                        if (seatingArrangement[row][column] == 1) {

                            seatingArrangement[row][column] = 0;
                            totalBookedSeats--;
                            totalEarnings -= SEAT_PRICE;
                            System.out.println("Booking successfully canceled.");
                        } else {
                            System.out.println("Seat is not booked. Nothing to cancel.");
                        }
                    } else {
                        System.out.println("Invalid seat selection. Please enter a valid row and column.");
                    }
                    break;

                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
}

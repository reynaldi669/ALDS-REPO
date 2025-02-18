


import java.util.*;


public class Cafeorder24 {
    static Scanner scanner = new Scanner(System.in);
    static String[] menuItems = { "Black Coffee", "Latte", "Milk Tea", "Fried Noodles" };
    static int[] menuPrices = { 15000, 22000, 12000, 18000 };
    static List<String> orders = new ArrayList<>();


    public static void main(String[] args) {
        while (true) {
            System.out.println("===== MAIN MENU =====");
            System.out.println("1. Add Order");
            System.out.println("2. Show Orders");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            System.out.println(" ");


            if (choice == 1) {
                addOrder();
            } else if (choice == 2) {
                showOrders();
            } else if (choice == 3) {
                System.out.println("Exiting the system. Thank you!");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }


    static void addOrder() {
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter table number: ");
        int tableNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println(" ");


        String orderDetails = "Customer Name: " + customerName + "\n" +
                "Table Number: " + tableNumber + "\nOrder Details:\n";


        int totalPrice = 0;
        System.out.println("===== CAFE MENU =====");
        for (int i = 0; i < menuItems.length; i++) {
            System.out.println((i + 1) + ". " + menuItems[i] + " = Rp " + menuPrices[i]);
        }
        while (true) {
            System.out.println(" ");


            System.out.print("Choose a menu (enter menu number, or 0 to finish): ");
            int menuChoice = scanner.nextInt();
            if (menuChoice == 0)
                break;


            if (menuChoice < 1 || menuChoice > menuItems.length) {
                System.out.println("Invalid menu. Please try again.");
                continue;
            }


            System.out.print("Enter quantity for " + menuItems[menuChoice - 1] + ": ");
            int quantity = scanner.nextInt();
            if (quantity <= 0) {
                System.out.println("Quantity must be greater than 0. Please try again.");
                continue;
            }


            int itemPrice = menuPrices[menuChoice - 1] * quantity;
            totalPrice += itemPrice;
            orderDetails += "- " + menuItems[menuChoice - 1] + " x " + quantity + " = Rp " + itemPrice + "\n";
        }


        orderDetails += "Total Order Price: Rp " + totalPrice + "\n----------------------------\n";
        orders.add(orderDetails);
        System.out.println("Order successfully added.");
    }


    static void showOrders() {
        if (orders.isEmpty()) {
            System.out.println("No orders yet.");
            return;
        }


        System.out.println("===== ORDER LIST =====");
        for (String order : orders) {
            System.out.println(order);
        }
    }
}


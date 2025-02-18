import java.util.Scanner;

public class InventoryManager {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inventory = {50, 30, 40, 60, 20};

        while (true) {  
            System.out.println("Current Inventory:");
            for (int i = 0; i < inventory.length; i++) {
                System.out.println(i + ". " + getProductName(i) + ": " + inventory[i]);
            }

            System.out.print("Enter the index of the item to manage (0-4, or 99 to exit): ");
            int itemIndex = scanner.nextInt();

            if (itemIndex == 99) {
                System.out.println("Exiting program. Goodbye!");
                break;
            }
 
            if (itemIndex < 0 || itemIndex >= inventory.length) {
                System.out.println("Invalid item index. Please enter a valid index.");
                continue;
            }
            System.out.print("Enter action (1: Add Stock, 2: Remove Stock): ");
            int action = scanner.nextInt();

            if (action != 1 && action != 2) {
                System.out.println("Invalid action. Please enter 1 or 2.");
                continue;
            }

            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();

            if (action == 1) {
                inventory[itemIndex] += quantity;
                System.out.println("Stock added successfully.");
            } else {
                if (inventory[itemIndex] < quantity) {
                    System.out.println("Not enough stock to remove.");
                    continue;
                }
                inventory[itemIndex] -= quantity;
                System.out.println("Stock removed successfully.");
            }
        }
        scanner.close();
    }

    private static String getProductName(int index) {
        String[] productNames = {"Apples", "Bananas", "Oranges", "Grapes", "Pineapples"};
        if (index >= 0 && index < productNames.length) {
            return productNames[index];
        }
        return "Unknown Product";
    }
}

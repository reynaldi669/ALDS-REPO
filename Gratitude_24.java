import java.util.Scanner;

public class Gratitude_24 {
    
    public static void sayAdditionalGreetings(String greeting) {
        System.out.println(greeting);
    }

    public static void sayThankyou() {
        System.out.println("Thank you!");
    }

    public static void main(String[] args) {
        sayThankyou(); 
        String expression = "Thank you... wish you all the best!!";
        sayAdditionalGreetings(expression); 
    }
}
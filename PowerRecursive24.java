import java.util.Scanner;

public class PowerRecursive24 {
    static void printPowerSeries(int base, int pow) {
        if (pow == 0) {
            System.out.print("1");
        } else {
            System.out.print(base);
            if (pow > 1) System.out.print("x");
            printPowerSeries(base, pow - 1);
        }
    }

    static int calculatePower(int base, int pow) {
        if (pow == 0) return 1;
        return base * calculatePower(base, pow - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Base Number: ");
        int base = input.nextInt();
        System.out.print("Input Power Number: ");
        int power = input.nextInt();

        printPowerSeries(base, power);
        System.out.print(" = ");
        System.out.println(calculatePower(base, power));
    }
}
import java.util.Scanner;

public class Experiment6_24 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p, l, t, area, volume;

        System.out.print("Input Length = ");
        p = input.nextInt();

        System.out.print("Input Width = ");
        l = input.nextInt();

        System.out.print("Input Height = ");
        t = input.nextInt();


        area = calculateArea(p, l);
        volume = calculateVolume(p, l, t);

        System.out.println("Area of the rectangle = " + area);
        System.out.println("Volume of the rectangle = " + volume);

        input.close();
    }
    static int calculateArea(int length, int width) {
        return length * width;
    }
    static int calculateVolume(int length, int width, int height) {
        return calculateArea(length, width) * height;
    }
}

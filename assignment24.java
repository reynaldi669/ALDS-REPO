import java.util.Scanner;

public class assignment24 {
    static int[][] grades = {
        {20, 19, 25, 20, 10, 0, 10},  // Sari
        {30, 30, 40, 10, 15, 20, 25}, // Rina
        {5, 0, 20, 25, 10, 5, 45},    // Yani
        {50, 0, 7, 8, 0, 30, 60},     // Dwi
        {15, 10, 16, 15, 10, 10, 5}   // Lusi
    };
    static String[] students = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};

    public static void displayGrades() {
        System.out.println("\nGrades:");
        System.out.println("       W1  W2  W3  W4  W5  W6  W7");
        for (int i = 0; i < students.length; i++) {
            System.out.printf("%-5s", students[i]);
            for (int j = 0; j < 7; j++) {
                System.out.printf("%4d", grades[i][j]);
            }
            System.out.println();
        }
    }

    public static void findHighestWeek() {
        int maxGrade = 0, week = 0;
        for (int j = 0; j < 7; j++) {
            for (int i = 0; i < 5; i++) {
                if (grades[i][j] > maxGrade) {
                    maxGrade = grades[i][j];
                    week = j + 1;
                }
            }
        }
        System.out.println("\nHighest grade in Week " + week + ": " + maxGrade);
    }

    public static void findHighestStudent() {
        int maxGrade = 0, studentIndex = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                if (grades[i][j] > maxGrade) {
                    maxGrade = grades[i][j];
                    studentIndex = i;
                }
            }
        }
        System.out.println("\nHighest grade by: " + students[studentIndex] + " (" + maxGrade + ")");
    }

    public static void recursiveDescending(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            recursiveDescending(n - 1);
        }
    }

    public static int sumRecursive(int n) {
        return (n == 1) ? 1 : n + sumRecursive(n - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Bagian 1: Manajemen Nilai
        displayGrades();
        findHighestWeek();
        findHighestStudent();

        // Bagian 2: Descending Sequence
        System.out.print("\nEnter a number for descending sequence: ");
        int n = input.nextInt();
        System.out.print("Recursive descending: ");
        recursiveDescending(n);

        // Bagian 3: Penjumlahan Rekursif
        System.out.print("\n\nEnter a number for summation: ");
        int sumNumber = input.nextInt();
        System.out.println("Sum from 1 to " + sumNumber + ": " + sumRecursive(sumNumber));
    }
}
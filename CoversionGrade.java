import java.util.Scanner;

public class CoversionGrade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] grades = new int[4];
        String[] gradeTypes = {"Tugas", "Kuis", "UTS", "UAS"};

        for (int i = 0; i < grades.length; i++) {
            System.out.print("Masukan Nilai " + gradeTypes[i] + ": ");
            grades[i] = scanner.nextInt();
            if (!isValidGrade(grades[i])) {
                System.out.println("nilai tidak valid");
                return;
            }
        }

        double finalGrade = calculateFinalGrade(grades);
        String letterGrade = getLetterGrade(finalGrade);

        System.out.printf("nilai akhir : %.1f%n", finalGrade);
        System.out.println("Nilai Huruf : " + letterGrade);
        if (letterGrade.equals("F")) {
            System.out.println("SELAMAT ANDA LULUS");
        } else {
            System.out.println("SELAMAT ANDA LULUS");
        }
    }

    private static boolean isValidGrade(int grade) {
        return grade >= 0 && grade <= 100;
    }

    private static double calculateFinalGrade(int[] grades) {
        return 0.2 * grades[0] + 0.2 * grades[1] + 0.3 * grades[2] + 0.4 * grades[3];
    }

    private static String getLetterGrade(double finalGrade) {
        if (finalGrade >= 80) return "A";
        if (finalGrade >= 73) return "B+";
        if (finalGrade >= 67) return "B";
        if (finalGrade >= 63) return "C+";
        if (finalGrade >= 57) return "C";
        if (finalGrade >= 53) return "D+";
        if (finalGrade >= 50) return "D";
        return "E";
    }
}
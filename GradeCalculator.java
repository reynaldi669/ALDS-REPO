import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Course names and respective credit values
        String[] courses = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };

        double[] scores = new double[courses.length];
        double[] gradePoints = new double[courses.length];
        String[] letterGrades = new String[courses.length];

        System.out.println("=========================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("=========================");

        // Taking user input for course scores
        for (int i = 0; i < courses.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + courses[i] + ": ");
            scores[i] = scanner.nextDouble();
            letterGrades[i] = calculateGrade(scores[i]);
            gradePoints[i] = calculateGradePoints(letterGrades[i]);
        }

        System.out.println("=========================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=========================");
        System.out.printf("%-40s %-10s %-10s %-10s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        double totalGradePoints = 0;
        for (int i = 0; i < courses.length; i++) {
            System.out.printf("%-40s %-10.2f %-10s %-10.2f\n", courses[i], scores[i], letterGrades[i], gradePoints[i]);
            totalGradePoints += gradePoints[i];
        }

        // Calculate Semester GPA (IP)
        double gpa = totalGradePoints / courses.length;

        System.out.println("=========================");
        System.out.printf("IP : %.2f\n", gpa);
        System.out.println("=========================");

        // Close scanner
        scanner.close();
    }

    // Method to determine letter grade based on numerical score
    public static String calculateGrade(double score) {
        if (score >= 85) return "A";
        else if (score >= 80) return "A-";
        else if (score >= 75) return "B+";
        else if (score >= 70) return "B";
        else if (score >= 65) return "B-";
        else if (score >= 60) return "C+";
        else if (score >= 55) return "C";
        else if (score >= 50) return "D";
        else return "E";
    }

    // Method to determine grade points based on letter grade
    public static double calculateGradePoints(String grade) {
        switch (grade) {
            case "A": return 4.0;
            case "A-": return 3.75;
            case "B+": return 3.5;
            case "B": return 3.0;
            case "B-": return 2.75;
            case "C+": return 2.5;
            case "C": return 2.0;
            case "D": return 1.0;
            default: return 0.0;
        }
    }
}


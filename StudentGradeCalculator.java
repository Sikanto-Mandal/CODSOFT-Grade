import java.util.*;

public class StudentGradeCalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Student Grade Calculator");

        System.out.print("Enter the number of subjects: ");
        int numSubjects = sc.nextInt();
        double totalMarks = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter the name of Subject " + i + ": ");
            String subjectName = sc.next();
            System.out.print("Enter the marks obtained (out of 100) for " + subjectName + ": ");
            double marks = sc.nextDouble();
            totalMarks += marks;
        }
        double avgPer = (totalMarks / numSubjects);

        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Average percentage: " + avgPer);

        String grade;
        if (avgPer >= 90) {
            grade = "A+";
        } else if (avgPer >= 85) {
            grade = "A";
        } else if (avgPer >= 80) {
            grade = "A-";
        } else if (avgPer >= 75) {
            grade = "B+";
        } else if (avgPer >= 70) {
            grade = "B";
        } else if (avgPer >= 65) {
            grade = "B-";
        } else if (avgPer >= 60) {
            grade = "C+";
        } else if (avgPer >= 55) {
            grade = "C";
        } else if (avgPer >= 50) {
            grade = "C-";
        } else if (avgPer >= 45) {
            grade = "D+";
        } else if (avgPer >= 40) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("Grade: " + grade);
        System.out.print("\n");
        sc.close();
    }
}

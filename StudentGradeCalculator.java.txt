package StudentGrade;
import java.util.Scanner;

public class Grade_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name=sc.nextLine();
        System.out.println("Enter your Rollno: ");
        int rollNo=sc.nextInt();

        System.out.print("Enter the number of subjects: ");
        int numOfSubjects = sc.nextInt();

        int[] marks = new int[numOfSubjects];
        int totalMarks = 0;

        for (int i = 0; i < numOfSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + (i + 1) + " (out of 100): ");
            marks[i] = sc.nextInt();
            totalMarks += marks[i];
        }

        double averagePercentage = (double) totalMarks / numOfSubjects;
        char grade = calculateGrade(averagePercentage);

        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + String.format("%.2f", averagePercentage) + "%");
        System.out.println("Grade: " + grade);
    }

    private static char calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90 && averagePercentage <= 100) {
            return 'A';
        } else if (averagePercentage >= 80 && averagePercentage < 90) {
            return 'B';
        } else if (averagePercentage >= 70 && averagePercentage < 80) {
            return 'C';
        } else if (averagePercentage >= 60 && averagePercentage < 70) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
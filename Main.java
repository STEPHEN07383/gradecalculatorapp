package gradecalculatorapp;

import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Grade Calculator");
        System.out.println("----------------");

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        Subject[] subjects = new Subject[numSubjects];

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter the score for subject " + (i + 1) + ": ");
            double score = scanner.nextDouble();
            subjects[i] = new Subject(score);
        }

        double sum = 0;

        for (Subject subject : subjects) {
            sum += subject.getScore();
        }

        double average = sum / numSubjects;
        char grade = calculateGrade(average);

        System.out.println("Average score: " + average);
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    private static char calculateGrade(double average) {
        if (average >= 90) {
            return 'A';
        } else if (average >= 80) {
            return 'B';
        } else if (average >= 70) {
            return 'C';
        } else if (average >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}

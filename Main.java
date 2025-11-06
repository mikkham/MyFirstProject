// Lab: Student Grade Calculator
// Author: Your Name
// Description: This program reads student names and their scores,
// calculates the average, and displays the corresponding letter grade.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter first score: ");
        double score1 = input.nextDouble();

        System.out.print("Enter second score: ");
        double score2 = input.nextDouble();

        System.out.print("Enter third score: ");
        double score3 = input.nextDouble();

        double average = (score1 + score2 + score3) / 3;
        char grade;

        if (average >= 90)
            grade = 'A';
        else if (average >= 80)
            grade = 'B';
        else if (average >= 70)
            grade = 'C';
        else if (average >= 60)
            grade = 'D';
        else
            grade = 'F';

        System.out.println("\n--- Student Report ---");
        System.out.println("Name: " + name);
        System.out.printf("Average Score: %.2f%n", average);
        System.out.println("Letter Grade: " + grade);

    }
}


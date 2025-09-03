import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double quizMarks = 0;
        double assignmentMarks = 0;
        double midTermMarks = 0;
        double finalMarks = 0;

        while (true) {
            System.out.print("Enter Quiz Marks (out of 15): ");
            quizMarks = scanner.nextDouble();
            if (quizMarks >= 0 && quizMarks <= 15) {
                break;
            } else {
                System.out.println("Invalid input! Please enter a number between 0 and 15.");
            }
        }

        while (true) {
            System.out.print("Enter Assignment Marks (out of 10): ");
            assignmentMarks = scanner.nextDouble();
            if (assignmentMarks >= 0 && assignmentMarks <= 10) {
                break;
            } else {
                System.out.println("Invalid input! Please enter a number between 0 and 10.");
            }
        }

        while (true) {
            System.out.print("Enter Mid-Term Marks (out of 25): ");
            midTermMarks = scanner.nextDouble();
            if (midTermMarks >= 0 && midTermMarks <= 25) {
                break;
            } else {
                System.out.println("Invalid input! Please enter a number between 0 and 25.");
            }
        }

        while (true) {
            System.out.print("Enter Final Marks (out of 50): ");
            finalMarks = scanner.nextDouble();
            if (finalMarks >= 0 && finalMarks <= 50) {
                break;
            } else {
                System.out.println("Invalid input! Please enter a number between 0 and 50.");
            }
        }

        double totalMarks = quizMarks + assignmentMarks + midTermMarks + finalMarks;
        double average = totalMarks;  // Max possible = 100

        System.out.println("Total Marks = " + totalMarks);
        System.out.println("Average = " + average);

        if (average >= 85) {
            System.out.println("Grade = A");
        } else if (average >= 70) {
            System.out.println("Grade = B");
        } else if (average >= 50) {
            System.out.println("Grade = C");
        } else {
            System.out.println("Grade = Fail");
        }

        scanner.close();
    }
}





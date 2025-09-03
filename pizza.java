package newpackage;

import java.util.Scanner;

public class pizza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bill = 0;
        String size = "";
        String pepperoni = "";
        String cheese = "";
        while (true) {
            System.out.print("Enter pizza size (small/medium/large): ");
            size = scanner.nextLine().toLowerCase();
            if (size.equals("small") || size.equals("medium") || size.equals("large")) {
                break;
            } else {
                System.out.println("Invalid size entered. Please enter small, medium, or large.");
            }
        }

        switch (size) {
            case "small":
                bill = 100;
                break;
            case "medium":
                bill = 200;
                break;
            case "large":
                bill = 300;
                break;
        }

        while (true) {
            System.out.print("Do you want pepperoni? (yes/no): ");
            pepperoni = scanner.nextLine().toLowerCase();
            if (pepperoni.equals("yes") || pepperoni.equals("no")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter yes or no.");
            }
        }

        if (pepperoni.equals("yes")) {
            if (size.equals("small")) {
                bill += 30;
            } else {
                bill += 50;
            }
        }
        while (true) {
            System.out.print("Do you want cheese? (yes/no): ");
            cheese = scanner.nextLine().toLowerCase();
            if (cheese.equals("yes") || cheese.equals("no")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter yes or no.");
            }
        }
        if (cheese.equals("yes")) {
            bill += 20;
        }

        System.out.println("Your final total is: " + bill);

        scanner.close();
    }
}



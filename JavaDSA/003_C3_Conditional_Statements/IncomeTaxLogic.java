import java.util.*;

public class IncomeTaxLogic {

    public static void main(String[] args) {

        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter their annual income in LPA
        System.out.println("Enter your annual income in LPA:");

        // Read the income entered by the user
        double income = sc.nextDouble();

        // Variable to store the calculated tax amount
        double tax;

        // Check if income is less than or equal to 5 LPA
        if (income <= 5) {

            // Tax rate is 0%
            tax = income * 0 / 100;

            // Print the tax percentage
            System.out.println("The Income Tax percentage is 0%");

            // Print the calculated tax amount
            System.out.println("The Income Tax amount is " + tax + " LPA");

        }

        // Check if income is more than 5 LPA but less than 10 LPA
        else if (income > 5 && income < 10) {

            // Calculate 20% tax on the income
            tax = income * 20 / 100;

            // Print the tax percentage
            System.out.println("The Income Tax percentage is 20%");

            // Print the calculated tax amount
            System.out.println("The Income Tax amount is " + tax + " LPA");

        }

        // If income is 10 LPA or more
        else {

            // Calculate 30% tax on the income
            tax = income * 30 / 100;

            // Print the tax percentage
            System.out.println("The Income Tax percentage is 30%");

            // Print the calculated tax amount
            System.out.println("The Income Tax amount is " + tax + " LPA");
        }

        sc.close();
    }
}
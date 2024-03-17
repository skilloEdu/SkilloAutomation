package main.java.lab.l7.exceptions.exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the first number:");
            double num1 = scanner.nextDouble();

            System.out.println("Enter the second number:");
            double num2 = scanner.nextDouble();

            double result = divide(num1, num2);
            System.out.println("The result is: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Error: You must enter a number.");
            main(args);// Recursively call main method to restart the program
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
            main(args);// Recursively call main method to restart the program
        } finally {
            scanner.close();
        }
    }

    /**
     * Try the following combinations
     *
     * @param dividend - -1,1,0,2,10,2,3.5,2
     * @param divisor - 2,-2,2,0,2,10,2,3.5
     */
    public static double divide(double dividend, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return dividend / divisor;
    }
}

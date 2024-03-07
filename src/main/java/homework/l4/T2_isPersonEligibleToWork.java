package main.java.homework.l4;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class T2_isPersonEligibleToWork {
      public static void TestInput() {
              String input = "22\n";
              System.setIn(new ByteArrayInputStream(input.getBytes()));
          }
    public static void main(String[] args) {
            TestInput();

        /*
          Write Java program to allow the user to input his/her age.
          Then the program will show if the person is eligible to work.
          A person who is eligible to work must be older than or equal to 16 years old.
          Example: Enter your age: 16 You are eligible to work.
         */

        String eligibleToWorkMessage = "You are eligible to work";
        String notEligibleToWorkMessage = "You are NOT eligible to work";

        System.out.println("Please enter your age:");

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age >= 16) {
            if (age > 67) {
                System.out.println(notEligibleToWorkMessage);
            } else {
                System.out.println(eligibleToWorkMessage);
            }
        } else {
            System.out.println(notEligibleToWorkMessage);
        }
    }
}

package main.java.homework.l5.datastructures;

import java.util.Scanner;

public class T7_PalindromBasic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word you want to validate:");
        String input = scanner.nextLine();

        boolean isPalindrome = true;
        int left = 0;
        int right = input.length() - 1;
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println(input + " is a palindrome");
        } else {
            System.out.println(input + " is not a palindrome");
        }
    }
    public static void isPalindrome() {
        String word = "racecar";

        String reveredWord = "";

        boolean isPalindrome = false;

        for (int i = word.length() - 1; i >= 0; i--) {
            reveredWord = reveredWord + word.charAt(i);  //gets given character by index
        }

        // Checking if both the strings are equal
        if (word.equals(reveredWord)) {
            isPalindrome = true;
        }

        System.out.println("The String is palindrome: " + isPalindrome);
    }

}

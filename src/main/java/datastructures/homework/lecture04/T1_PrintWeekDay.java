package main.java.datastructures.homework.lecture04;

import java.util.Scanner;

public class T1_PrintWeekDay {
    public static void main(String[] args) {
        /*
        1. Write a program to print the days of the week based on the user digit 1-7 input.
        7The message should be
        “The [user input digit]-st/nd/rd/th day of the week is [the day of the week]”
        Hint: Use switch-case.

       */
        System.out.println("Please enter a day of the week:");

        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("The " + day + "-st day of the week is Monday");
                break;
            case 2:
                System.out.println("The " + day + "-nd day of the week is Tuesday");
                break;
            case 3:
                System.out.println("The " + day + "-rd day of the week is Wednesday");
                break;
            case 4:
                System.out.println("The " + day + "-th day of the week is Tuesday");
                break;
            case 5:
                System.out.println("The " + day + "-th day of the week is Friday");
                break;
            case 6:
                System.out.println("The " + day + "-th day of the week is Saturday");
                break;
            case 7:
                System.out.println("The " + day + "-th day of the week is Sunday");
                break;
            default:
                System.out.println("Invalid day:" + day + " Please select a day between 1-7");
        }

    }
}

package main.java.homework.l5.datastructures;

import java.util.Scanner;

public class T7_Palindrom_v2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine(); // или число или Енд

        while (!command.equals("END")) {
            // тя е число то текст

            System.out.println(getPalindrome(command));
            command = scanner.nextLine();
        }
        // метод да връща тру или фолс за палиндром, акто го намери
        getPalindrome(command);
    }

    public static boolean getPalindrome(String number) {
        // проверка на числото наобратно
        String reservedNumber = getReversedNumber(number);
        return (number.equals(reservedNumber));
    }

    private static String getReversedNumber(String number) {
        //обхождаме числото от последния към първия елемент
        String reversed = "";
        for (int i = number.length() - 1; i >= 0; i--) {
            char currentElement = number.charAt(i);
            reversed += currentElement;
        }
        // обходила съм и искам да върна обърнатия стринг
        return reversed;
    }
}


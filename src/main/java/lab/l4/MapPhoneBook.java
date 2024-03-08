package main.java.lab.l4;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MapPhoneBook {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, String> phoneBook = new LinkedHashMap<>();

        while (!input.equals("search")) {
            String[] inputArray = input.split("-");
            String name = inputArray[0];
            String phoneNumber = inputArray[1];
            phoneBook.put(name, phoneNumber);

            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!input.equals("stop")) {

            if (phoneBook.containsKey(input)) {
                System.out.println(input + " -> " + phoneBook.get(input));
            } else {
                System.out.printf("Contact %s does not exist.\n", input);
            }

            input = scanner.nextLine();
        }
    }

}

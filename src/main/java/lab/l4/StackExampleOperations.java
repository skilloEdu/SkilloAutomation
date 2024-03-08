package main.java.lab.l4;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class StackExampleOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int x = scanner.nextInt();

        // n брой пъти донавя към стека следващото число
        for (int i = 1; i <= n; i++) {
            stack.push(scanner.nextInt());
        }
        // s брой пъти донавя към стека следващото число
        for (int i = 1; i <= s; i++) {
            stack.pop();
        }
        // x да го има в стека
        if (stack.contains(x)) {
            System.out.println("true");
        } // x го няма в стека
        else {
            // min ел
            // имаме ел
            if (!stack.isEmpty()) {
                System.out.println(Collections.min(stack)); // от библиотеката Coll вадим готов метод за стека
            } else {
                System.out.println(0);
            }
        }
    }
}

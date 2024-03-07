package main.java.homework.l5.datastructures;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class T5_ReversLL {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        //Algorithm:
        // 1. Create a linked list with n elements
        // 2. Run the loop for n/2 times where ‘n’ is the number of elements in the LinkedList.
        // 3. In the first pass, Swap the first and nth element
        // 4. In the second pass, Swap the second and (n-1)th element and so on till you reach the mid of the linked list.
        // 5. Return the linked list after loop termination.

        for (int i = 0; i < numbers.size() / 2; i++) {

            int temp = numbers.get(i);

            numbers.set(i, numbers.get(numbers.size() - i - 1));

            numbers.set(numbers.size() - i - 1, temp);

        }


        System.out.println(numbers);
        System.out.println("The end");

    }
}

package main.java.homework.l5.datastructures;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class T1_SumArrayNumbers {
    public static void main(String[] args) {
        String input = "2.4 5.1  5.9  1.4  7.3";

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double  sumOfNumbers = Arrays.stream(Arrays.stream(
                                 input.split("\\s+")).
                                 mapToDouble(Double::parseDouble).
                                 toArray()).sum();

        double[] numbers = Arrays.stream(input.split("\\s+")).mapToDouble(Double::parseDouble).toArray();

        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];
            System.out.println(sum);
        }

        System.out.println("FINAL SUM "+sum);

        System.out.println("The end");

    }
}

package main.java.homework.l5.datastructures;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class T4_SumArr {

      public static void TestInput() {
              String input = "1 2 3 4 5 6 7 8 9 \n";

              System.setIn(new ByteArrayInputStream(input.getBytes()));
          }
    public static void main(String[] args) throws IOException {
        TestInput();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double numbers =   Arrays.stream(Arrays.stream(
                                reader.readLine().split("\\s+")).
                                mapToDouble(Double::parseDouble).
                                toArray()).sum();

        System.out.println(numbers);
    }
}

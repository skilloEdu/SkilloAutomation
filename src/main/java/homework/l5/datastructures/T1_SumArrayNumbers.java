package main.java.homework.l5.datastructures;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class T1_SumArrayNumbers {

      public static void TestInput() {
              String input = "2.4,5.1,5.9,1.4,7.3\n";

              System.setIn(new ByteArrayInputStream(input.getBytes()));
          }
    public static void main(String[] args) {
        TestInput();

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Scanner scanner = new Scanner(System.in);


        double numbersSum =  Arrays.stream(Arrays.stream(scanner.nextLine().split(","))
                                            .mapToDouble(Double::parseDouble).
                                            toArray()).
                                            sum();

        System.out.println(numbersSum);




        System.out.println("The end");

    }
}

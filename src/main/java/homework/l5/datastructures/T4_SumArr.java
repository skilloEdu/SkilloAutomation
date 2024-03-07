package main.java.homework.l5.datastructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class T4_SumArr {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double numbers =   Arrays.stream(Arrays.stream(
                                reader.readLine().split("\\s+")).
                                mapToDouble(Double::parseDouble).
                                toArray()).sum();


    }
}

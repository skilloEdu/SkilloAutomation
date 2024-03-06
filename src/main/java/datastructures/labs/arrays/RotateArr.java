package main.java.datastructures.labs.arrays;

import java.util.Scanner;

public class RotateArr {
    public static void main(String[] args) {


        String[] numbers =  {"1", "2","3","4","5"};
        int countRotations = 2; // брой ротации

        for (int rotation = 1; rotation <= countRotations; rotation++) {
            //ротация

            // 1. взимаме 1 елемент
            String firstElement = numbers[0];

            // 2. местим всички елементи с 1 наляво, защото масивът не може да бъде добавян (индекс на ел = индекс -1)
            for (int index = 0; index < numbers.length - 1; index++) {
                numbers[index] = numbers[index + 1];
            }

            // 3. на последния индекс да стои 1 елемент
            numbers[numbers.length - 1] = firstElement;
        }

        System.out.println(String.join(" ", numbers));
    }
}

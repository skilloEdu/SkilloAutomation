package main.java.lab.l6;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TwoDArraysHomeWork {

    public static void TestInput() {
        String input = "5\n" +
                "1 2 3 4 5\n" +
                "6 7 8 9 10\n" +
                "11 12 13 14 15\n" +
                "16 17 18 19 20\n" +
                "21 22 23 24 25\n";

        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) throws IOException {

        TestInput();

            /*СТЪПКА 1
            как взимаме диаголна
             ==        1     7     13   19    25
             идекс     0 0   12    23   34    45

            */
        //   не може ли да го направим с фор и да подаваме индексатор в двете измерения Х и У

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));;
        int size =  Integer.parseInt(reader.readLine());

        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            //всеки ред директно го слагаме като масив
            matrix[i] = Arrays.stream(reader.readLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int sumLeftTopRightDownDiagonal = 0;
        for (int index = 0; index < size; index++) {
            int currentNumberOfTheProvidedIndex = matrix[index][index];
            System.out.println("The current provided number in diagonal is: " +currentNumberOfTheProvidedIndex);

            sumLeftTopRightDownDiagonal +=currentNumberOfTheProvidedIndex;
        }

        System.out.println("The first diagonal sum is: "+sumLeftTopRightDownDiagonal);

          /*СТЪПКА 2
            как взимаме диаголна
             ==        5               9     13   17    21
             идекс     0 m.lengt       12    23   34    45

            */
        //   не може ли да го направим с фор и да подаваме индексатор в двете измерения Х и У
        int leftSize = size;
        int sumLeftDiagonal = 0;
        for (int index = 0; index < leftSize; index++) {

            int forLeftDiagonalColumnIndex = (leftSize-1) - index;
            int rows = index;
            int currentLeftDiagonalNum =
                    matrix[forLeftDiagonalColumnIndex][rows];


            System.out.println("The number from the current left diagonal is: "+currentLeftDiagonalNum);
            sumLeftDiagonal +=currentLeftDiagonalNum;

        }

        System.out.println("The Left Diagonal sum is " + sumLeftDiagonal);

        System.out.println("The End");
    }
}

package main.java.lab.l6;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TwoDArraysDIagonalsWithWhileLoops {

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
        // Прочетена матрица
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));;
        int size =  Integer.parseInt(reader.readLine());
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            //всеки ред директно го слагаме като масив
            matrix[i] = Arrays.stream(reader.readLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        // променливи за колона и ред
        int row = 0;
        int col = 0;

        int topLeftToRightDown = 0;
        int topRightToLeftDown = 0;
        int dowLeftToTopRight = 0;
        int downRightToLeftTop = 0;



       while (row < size && col < size) {
           int num = matrix[row][col];
           topLeftToRightDown += matrix[row][col];
           System.out.println("The matrix diagonal starting from TOP LEFT to DOWN right os :" + num  );

           //Ако няма инкрементация ще забие
           row++;
           col++;

       }


        // TOP right ---- > left DOWN
       row = size -1;
       col = 0;

        while (row >=0 && col < size ) {
           int num = matrix[row][col];
            topRightToLeftDown+=num;

            System.out.println("Current num in top left to right down is: "+ num);
            row--;
            col++;
        }


        // down RIGHT to left Right
        row = size-1;
        col = size-1;

        while (row >=0 && col>=0) {
            int num = matrix[row][col];

            downRightToLeftTop+=num;
            row--;
            col--;
        }


        // down Left to TOP Right
        row = 0;
        col = size-1;
        while (row <size  && col>=0) {
            int num = matrix[row][col];

            downRightToLeftTop+=num;
            row++;
            col--;
        }
    }
}

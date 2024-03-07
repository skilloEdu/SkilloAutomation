package main.java.homework.l5.datastructures;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class T2_3_printElementsIn2d {
      public static void TestInput() {
              String input = "4\n"+
                             "3\n"+
                              "1 2 3\n"+
                              "4 5 6\n"+
                              "7 8 9\n"+
                              "10 11 12\n"
                               ;

              System.setIn(new ByteArrayInputStream(input.getBytes()));
          }
    public static void main(String[] args) throws IOException {
        TestInput();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int rows = Integer.parseInt(reader.readLine());
        int cols = Integer.parseInt(reader.readLine());

        int[][] matrix = new int[rows][cols];

        for (int r = 0; r < rows ; r++) {
            String[] inputDataColumsLine = reader.readLine().split("\\s+");

            for (int c = 0; c < cols ; c++) {
                matrix[r][c] = Integer.parseInt(inputDataColumsLine[c]);
            }
        }

        System.out.println("The end");
      }

}

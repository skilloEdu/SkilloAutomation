package main.java.homework.l5.datastructures;

import java.util.Scanner;

public class TwoDArraysDemos {

    public static void main(String[] args) {

        int[][] declareMatrixWithDelcarationList = {
                            {12, 13},
                            {13, 14},
                            {4, 2},
                            {12},
                            {0},
                            };





    }

    private static int[][] readMatrix (Scanner scanner) {
        String[] inputData = scanner.nextLine().split("\\s+");

        int rows = Integer.parseInt(inputData[0]);
        int cols = Integer.parseInt(inputData[1]);

        int[][] matrix = new int[rows][cols];

        for (int r = 0; r < rows ; r++) {
            String[] inputDataColumsLine = scanner.nextLine().split("\\s+");

            for (int c = 0; c < cols ; c++) {
                matrix[r][c] = Integer.parseInt(inputDataColumsLine[c]);
            }
        }

        return matrix;

    }
}

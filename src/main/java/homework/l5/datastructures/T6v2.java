package main.java.homework.l5.datastructures;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.Scanner;


public class T6v2 {
      public static void TestInput() {
              String input = "5\n"+
                             "1 2 3 4 5\n"+
                              "6 7 8 9 10\n"+
                              "11 12 13 14 15\n"+
                              "16 17 18 19 20n"+
                              "21 22 23 24 25\n"
                              ;

              System.setIn(new ByteArrayInputStream(input.getBytes()));
          }
    public static void main(String[] args) {
          TestInput();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Provide matrix size as number");



            int size = Integer.parseInt(scanner.nextLine());
            int[][] matrix = readMatrix(size, scanner, "\\s+");

            int row = 0;
            int col = 0;



            while (row < size && col < size) {
                int current = matrix[row][col];
                System.out.print(current + " ");
                row++;
                col++;
            }
            System.out.println();

            row = size - 1;
            col = 0;

            while (row >= 0 && col < size) {
                int current = matrix[row][col];
                System.out.print(current + " ");
                row--;
                col++;
            }
        }

        private static void printMatrix ( int[][] maxMatrix){
            for (int[] arr : maxMatrix) {
                for (int c : arr) {
                    System.out.print(c + " ");
                }
                System.out.println();
            }
        }

        private static int[][] readMatrix ( int size, Scanner scanner, String splitPattern){
            int[][] matrix = new int[size][];
            for (int row = 0; row < size; row++) {
                matrix[row] = Arrays.stream(scanner.nextLine()
                                .split(splitPattern))
                        .mapToInt(Integer::parseInt)
                        .toArray();
            }
            return matrix;
        }
    }

//  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
//
//        String[][] matrix = reader.lines()
//                .limit(Long.parseLong(reader.readLine()))
//                .map(line -> line.split("\\s+"))
//                .toArray(String[][]::new);
//
//
//        String one = IntStream.range(0, matrix.length)
//                .mapToObj(index -> matrix[index][index])
//                .collect(Collectors.joining(" "));
//
//        String two = IntStream.range(0, matrix.length)
//                .mapToObj(index -> matrix[matrix.length - index - 1][index])
//                .collect(Collectors.joining(" "));
//
//        System.out.println(one);
//        System.out.println(two); //216
//    }



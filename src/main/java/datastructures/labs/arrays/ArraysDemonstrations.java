package main.java.datastructures.labs.arrays;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArraysDemonstrations {
          public static void TestInput() {
                  String input = "7\n"+
                                 "Monday\n"+
                                  "Tuesday\n"+
                                  "Wednesday\n"+
                                  "Thursday\n"+
                                  "Friday\n"+
                                  "Saturday\n"+
                                  "Sunday\n"+
                                   "Friday\n";

                  System.setIn(new ByteArrayInputStream(input.getBytes()));
              }
    public static void main(String[] args) throws IOException {
         // TestInput();
        // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = "1 2 3 4 5 ";    // НАЧАЛЕН МАСИВ
        //"1 2 3 4 5 ";  // 1 -> X 3 4 5 1
        //"2 3 4 5 1 ";  // 1 -> J 2 3 4 5        0   (0+1) = 2
        //"1 2 3 4 5 ";  // 2 -> 3 (J+1) 5 1 2    1    (J=1+1) = 3
        //"1 2 3 4 5 ";  //  3 4 5 2 5
        int rotations = 2;

        String[] nums = input.split("\\s+");

        for (int i = 0; i < rotations ; i++) {
            String firstNumber = nums[0];

            for (int j = 0; j < nums.length -1 ; j++) {
                nums[j] = nums[ j +1];
            }

            nums[nums.length - 1] = firstNumber;
        }

        System.out.println(String.join(" ", nums));

        System.out.println("The end");
    }
}

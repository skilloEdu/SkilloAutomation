package main.java.datastructures.homework.lecture04;

public class T4_PrintLargestNumber {
    public static void main(String[] args) {
        /*
        Find the largest number from a
        given array and print it in a console.

         Hint: use for loop
         */

        int[] arr = {2, 11, 45, 9};

        int largestNumber = arr[0];
        int i;

        // Traverse array elements from second and
        // compare every element with current max
        for (i = 1; i < arr.length; i++) {

            if (arr[i] > largestNumber) {
                largestNumber = arr[i];
            }
        }

        System.out.println("The largest number is: " + largestNumber);
    }
}

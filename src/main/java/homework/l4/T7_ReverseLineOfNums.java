package main.java.homework.l4;

public class T7_ReverseLineOfNums {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};

        //list.length - 1 sets our initial value as the last element in the list
        for (int i = list.length - 1; i >= 0; i--) {
            System.out.print(list[i] + " ");
        }
    }

}

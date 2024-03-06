package main.java.datastructures.labs.arrays;

import java.util.*;

public class TwoDArrayDemos {
    public static void main(String[] args) {

    HashMap<Integer,String> phoneBook = new HashMap<>();

    phoneBook.put(1,"Elena");
    phoneBook.put(2,"Bai Ivan");


    phoneBook.replace(1,"Elenaaa","Milena");

    for (Map.Entry<Integer, String> entry : phoneBook.entrySet()) {
                System.out.println( entry.getKey());
                System.out.println(  entry.getValue());
            }



    }

    public static void noParamsMethod(){
        System.out.println("There is no params in the method signature");
    }

}






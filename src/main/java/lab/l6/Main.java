package main.java.lab.l6;

public class Main {

    public static void main(String[] args) {


        Animal Antoaneta = new Animal(18.0,"Women");

        Antoaneta.greetSomeOne();

        Dog Dancho = new Dog(16.4,"Pudel");

        Dancho.greetSomeOne();

    }

    static void myMethod() {
        // code to be executed
        System.out.println("I just got executed!");
    }

    static void printFirstName(String fname) {
        System.out.println(fname + " Refsnes");
    }

    static void printPersonAge(String fname, int age) {
        System.out.println(fname + " is " + age + "years old");
    }

    static int calculateSum(int x, int y) {
        return x + y;
    }

    static void checkAge(int age) {

        // If age is less than 18, print "access denied"
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");

            // If age is greater than 18, print "access granted"
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    static double calculateSum(double x, double y) {
        return x + y;
    }

    static int calculateSum(int x, int y, int z) {
        return x + y + z;
    }
}

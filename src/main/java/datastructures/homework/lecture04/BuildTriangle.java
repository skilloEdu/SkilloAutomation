package main.java.datastructures.homework.lecture04;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class BuildTriangle {
    public static void TestInput() {
        String input = "60\n" +
                "44\n" +
                "76\n";

        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) {
        TestInput();
        float angle1, angle2, angle3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("======  >>>>>   *****  <<<<   =======");
        System.out.println("Enter value for first angle:");
        angle1 = scanner.nextFloat();
        System.out.println("The user has provided for angle1 value: " + angle1);

        System.out.println("======  >>>>>   *****  <<<<   =======");
        System.out.println("Enter value for second angle:");
        angle2 = scanner.nextFloat();
        System.out.println("The user has provided for angle2 value: " + angle2);

        System.out.println("======  >>>>>   *****  <<<<   =======");
        System.out.println("Enter value for third angle:");
        angle3 = scanner.nextFloat();
        System.out.println("The user has provided for angle3 value: " + angle3);


        String validMessage = "The triangle can be build! The type of the triangle is: ";

        float sumOfAngles = angle1 + angle2 + angle3;

        if (sumOfAngles != 180) {
            System.out.println("The triangle cannot be build!");
        } else if (angle1 == 60 && angle2 == 60 && angle3 == 60) {
            System.out.println(validMessage + "Equilateral");

        } else if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
            System.out.println(validMessage + "Right-angled");

        } else if (angle1 > 90 || angle2 > 90 || angle3 > 90) {
            System.out.println(validMessage + "Obtuse");

        } else if (angle1 < 90 && angle2 < 90 && angle3 < 90) {
            System.out.println(validMessage + "Acute");

        } else if (angle1 == angle2 || angle1 == angle3 || angle2 == angle3) {
            System.out.println(validMessage + "Isosceles");

        } else {
            System.out.println(validMessage + "Multifaceted");

        }
    }

}

package main.java.lab.l6;

public class Animal {


    private static double age;
    public static String type;

    public Animal(Double age, String type) {
        this.age =age;
        this.type = type;

    }

    public static double getAge() {
        double formatedAge = Math.round(age);
        return formatedAge;
    }

    public static String getType() {

        return type;
    }

    public static void setAge(double age) {
        if (age>=0) {
            Animal.age = age;
        } else {
            System.out.println("There is no animal with negative age");
        }

    }

    public static void setType(String type) {
       if (!type.isBlank() || !type.isEmpty()) {
           Animal.type = type;
       } else {
           System.out.println("There is no such animal without type");
       }

    }

    //Action

    public  void greetSomeOne () {
        System.out.println("Hello i am "+ getType());

    }
}
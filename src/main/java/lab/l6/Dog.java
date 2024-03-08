package main.java.lab.l6;

public class Dog extends Animal {

    private static double age;
    private static String Type;

    public Dog(Double age, String type) {
        super(age, type);
    }

    @Override
    public void greetSomeOne() {

        System.out.println("Bau bau bau  I am a dogssss");
    };

}

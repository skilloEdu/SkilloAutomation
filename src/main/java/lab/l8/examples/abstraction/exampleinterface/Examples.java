package main.java.lab.l8.examples.abstraction.exampleinterface;

public class Examples {
    public static void main(String[] args) {
        Animal myPig = new Pig();  // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}

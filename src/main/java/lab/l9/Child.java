package main.java.lab.l9;

public class Child extends Person {
    public Child(String name, char sex, String religion, String language, String nationality, String egn, String country) {
        super(name, sex, religion, language, "Student", nationality, egn, country);
    }

    @Override
    public boolean isAdult() {
        System.out.println("The child is not an adult.");
        return false;
    }

    @Override
    public boolean canTakeLoan() {
        System.out.println("The child can not take a loan.");
        return false;
    }

    @Override
    public void setJob(String job) {
        throw new IllegalArgumentException("The child cannot have a job");
    }

    public void play(String toy) {
        System.out.println("I am playing with a " + toy);
    }
}

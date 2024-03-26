package main.java.lab.l9;

public class American extends Person {
    public American(String name, char sex, String religion, String job, String egn, String country) {
        super(name, sex, religion, "English", job, "American", egn, country);
    }

    public void celebrateThanksgiving() {
        System.out.println("I am celebrating Thanksgiving on the fourth Tuesday in November");
    }
}

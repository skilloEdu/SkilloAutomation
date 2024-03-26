package main.java.lab.l9;

public class Bulgarian extends Person {
    public Bulgarian(String name, char sex, String religion, String job, String egn, String country) {
        super(name, sex, religion, "Bulgarian", job, "Bulgarian", egn, country);
    }

    @Override
    public void sayHello() {
        System.out.println("Здравейте!");
    }

    public void danceHoro() {
        System.out.println("Танцувам хоро!");
    }
}

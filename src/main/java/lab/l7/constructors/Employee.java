package main.java.lab.l7.constructors;

public class Employee {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Employee() {
        System.out.println("Employee is created!");
    }

    public Employee(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public Employee(String firstName, String lastName) {
        this(firstName, lastName, -1);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}

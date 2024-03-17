package main.java.lab.l8.exercises.employee;

public class Exercises {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Dimitar", "Tarkalanov", 20);
        String name = employee.getName();
        System.out.println("Full name is: " + name);
        double annualSalary = employee.getAnnualSalary();
        System.out.println("Annual salary is: " + annualSalary);
        System.out.println(employee);

        double raisedSalary = employee.raiseSalary(-10);
        System.out.println("New salary is: " + raisedSalary);
        annualSalary = employee.getAnnualSalary();
        System.out.println("Annual salary is: " + annualSalary);
        System.out.println(employee);
    }
}

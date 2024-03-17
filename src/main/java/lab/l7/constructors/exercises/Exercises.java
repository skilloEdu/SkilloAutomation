package main.java.lab.l7.constructors.exercises;

public class Exercises {
    public static void main(String[] args) {
        Car car1 = new Car("Volvo", "Black", 2020, 150, false);
        Car car2 = new Car("VW", "Blue", true);
        Car car3 = new Car("Audi", "Red", 2015, 220);
        Car car4 = new Car("BMW", 2022, 220, false);
        Car car5 = new Car();

        Car[] cars = {car1, car2, car3, car4, car5};
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}

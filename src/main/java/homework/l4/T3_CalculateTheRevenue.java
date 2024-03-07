package main.java.homework.l4;

import java.util.Scanner;

public class T3_CalculateTheRevenue {
    public static void main(String[] args) {

        /*
        3. Write a Java program to calculate the
         revenue from a sale based on the unit price and
         quantity of a product input by the user.

         The discount rate is 15% for the quantity
         purchased between 100 and 120 units,
         and 20% for the quantity
         purchased greater than 120 units.
         If the quantity purchased is less than 100 units,
         the discount rate is 0%.

         See the example output as shown below:

        Enter unit price: 25
        Enter quantity: 110
        The revenue from sale: 2337.5$
        Discount: 412.5$(15.0%)

         */
        double revenue;
        double unitPrice;
        int quantity;
        double discountRate;
        double discount;
        String revenueMessage = "The revenue from sale: ";
        String discountMessage = "Discount: ";
        String dPercentage;
        char dollar = '$';

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter unit price:");
        unitPrice = scanner.nextDouble();

        System.out.println("Please enter quantity:");
        quantity = scanner.nextInt();

        revenue = unitPrice * quantity;

        if (quantity >= 100 && quantity <= 120) {
            discountRate = 0.15;
            dPercentage = "(15.0%)";
        } else if (quantity > 120) {
            discountRate = 0.20;
            dPercentage = "(20.0%)";
        } else {
            discountRate = 0;
            dPercentage = "(0.0%)";
        }

        discount = revenue * discountRate;
        revenue = revenue - discount;

        System.out.println(revenueMessage + revenue + dollar);
        System.out.println(discountMessage + discount + dollar + dPercentage );
    }
}

package main.java.datastructures.homework.lecture04;

import java.util.Scanner;

public class CalculateTheRevenue {
    public static void main(String[] args) {
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

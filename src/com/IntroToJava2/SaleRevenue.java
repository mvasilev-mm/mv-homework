package com.IntroToJava2;

import java.util.Scanner;

public class SaleRevenue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter unit price: ");
        int originalUnitPrice = scanner.nextInt();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        double discount = 1;
        String percentage = "0%";

        ///price inside!!!

        if (quantity > 120) {
            discount = 0.8;
            percentage = "20%";
        }
        else if (quantity >= 100 && quantity <= 120) {
            discount = 0.85;
            percentage = "15%";
        }

        double fullPrice = originalUnitPrice * quantity;
        double discountedFullPrice = fullPrice * discount;


        System.out.printf("The revenue from sale: %.2f$\n", discountedFullPrice);
        System.out.printf("Discount: %.2f(%s)$", fullPrice - discountedFullPrice, percentage);

    }
}

package com.Methods;

import java.util.Arrays;
import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter double numbers delimited by space: ");
        double[] numbersInput = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(e -> Double.parseDouble(e)).toArray();

        System.out.printf("The smallest number is: %.2f", averageNumber(numbersInput));


    }

    public static double averageNumber(double[] input) {
        double avg = 0;

        for (int i = 0; i < input.length; i++) {
            avg += input[i];
        }


        return (avg / input.length);
    }
}

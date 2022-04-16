package com.Methods;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter integer numbers delimited by space: ");
        int[] numbersInput = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        System.out.printf("The smallest number is: %d", minNumber(numbersInput));


    }

    public static int minNumber(int[] input) {
        int min = input[0];

        for (int i = 0; i < input.length; i++) {
            if(input[i] < min) {
                min = input[i];
            }
        }


        return min;
    }
}

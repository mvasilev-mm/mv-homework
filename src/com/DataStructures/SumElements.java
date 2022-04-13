package com.DataStructures;

import java.util.Arrays;
import java.util.Scanner;

public class SumElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number sequence delimeted by interval: ");
        int[] numberSequence = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();
        int sum = 0;

        for (int i = 0; i < numberSequence.length; i++) {
            sum += numberSequence[i];
        }

        System.out.printf("The sum of the given array elements is %d", sum);
    }
}

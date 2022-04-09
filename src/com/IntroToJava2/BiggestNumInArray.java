package com.IntroToJava2;

import java.util.Arrays;
import java.util.Scanner;

public class BiggestNumInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number sequence delimeted by interval: ");
        int[] numberSequence = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        Arrays.sort(numberSequence);
        System.out.println(numberSequence[numberSequence.length-1]);




    }
}

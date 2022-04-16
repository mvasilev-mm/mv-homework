package com.Methods;

import java.util.Scanner;

public class IsNumberEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        System.out.print("Enter a number: ");
        int userInput = Integer.parseInt(scanner.nextLine());

        if (isEven(userInput)) {
            System.out.printf("The number is even");
        } else {
            System.out.printf("The number is odd");
        }
    }

    public static boolean isEven(int input) {
        if (input % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}

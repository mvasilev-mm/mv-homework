package com.Methods;

import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        System.out.print("Enter integer number: ");
        int userInput = scanner.nextInt();

        if (isPalindrome(userInput)) {
            System.out.printf("The entered integer %d is a Palindrome", userInput);
        }
        else {
            System.out.printf("The entered integer %d is not a Palindrome", userInput);
        }

    }

    public static boolean isPalindrome(int userInput) {
        String userInputAsString = Integer.toString(userInput);
        String reversedUserInput = "";

        if (userInput < 0) {
            return false;
        }
        else {
            for (int i = userInputAsString.length() - 1; i >= 0; i--) {
                reversedUserInput += userInputAsString.charAt(i);
            }

            if (userInputAsString.equals(reversedUserInput)) {
                return true;
            }
            else {
                return false;
            }
        }
    }

}

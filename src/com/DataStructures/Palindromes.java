package com.DataStructures;

import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        String reversedUserInput = "";

        for (int i = userInput.length() - 1; i >= 0; i--) {
            reversedUserInput += userInput.charAt(i);
        }

        if (userInput.equals(reversedUserInput)) {
            System.out.printf("The string '%s' is a palindrome!", userInput);
        }
        else {
            System.out.printf("The string '%s' is not a palindrome!", userInput);
        }
    }
}

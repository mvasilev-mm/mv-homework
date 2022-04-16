package com.Methods;

import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        System.out.printf("The middle of this string containing %d characters is: %s", userInput.length(), middleChars(userInput));

    }


    public static int charCounter(String userInput) {
        int counter = 0;
        for (int i = 0; i < userInput.length(); i++) {
            counter++;
        }

        return counter;
    }


    public static String middleChars(String userInput) {
        String result = "";

        if (charCounter(userInput) % 2 == 0) {
            result += userInput.charAt((userInput.length() / 2) - 1);
            result += userInput.charAt(userInput.length() / 2);
        }
        else {
            result += userInput.charAt(userInput.length() / 2);
        }

        return result;
    }
}

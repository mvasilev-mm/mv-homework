package com.IntroToJava2;

import java.util.Scanner;

public class WorkEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int input = scanner.nextInt();

        if (input >= 16) {
            System.out.println("You are eligible to work");
        }
        else {
            System.out.println("You are not eligible to work");
        }
    }
}

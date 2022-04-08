package com.IntroToJava2;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 7: ");
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                System.out.printf("The %d-st day of the week is Monday", input);
                break;
            case 2:
                System.out.printf("The %d-nd day of the week is Tuesday", input);
                break;
            case 3:
                System.out.printf("The %d-rd day of the week is Wednesday", input);
                break;
            case 4:
                System.out.printf("The %d-th day of the week is Thursday", input);
                break;
            case 5:
                System.out.printf("The %d-th day of the week is Friday", input);
                break;
            case 6:
                System.out.printf("The %d-th day of the week is Saturday", input);
                break;
            case 7:
                System.out.printf("The %d-th day of the week is Sunday", input);
                break;
            default:
                System.out.printf("%d is not a valid day of the week", input);
                break;
        }
    }
}

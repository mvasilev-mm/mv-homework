package com.IntroToJava2;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Write a program which advices the user where to go to a vacation based on the type of the vacation and the budget.
        // There should be two options – Beach, Mountain.
        // If the user put a different value then the program should print a message that there is no information about this type of vacation.
        // Budgets are considered per day per person.

        // If the budget per day for Beach type vacation is smaller than 50 then the program should advise Bulgaria as a destination,
        // otherwise Outside Bulgaria.
        //
        // If the budget per day for Mountain type vacation is smaller than 30 then the program should advise Bulgaria as a destination,
        // otherwise Outside Bulgaria.


        System.out.print("Enter your desired type of vacation: ");
        String typeOfVacation = scanner.nextLine();

        if (!typeOfVacation.equals("Mountain") && !typeOfVacation.equals("Beach")) {
            System.out.println("There is no information about this type of vacation.");
            return;
        }

        System.out.print("Enter your budget per day: ");
        int dailyBudget = scanner.nextInt();

        if (typeOfVacation.equals("Mountain")) {
            if (dailyBudget < 30) {
                System.out.println("The destination offered is Bulgaria");
            }
            else {
                System.out.println("The destination offered is Outside of Bulgaria");
            }
        }
        else if (typeOfVacation.equals("Beach")) {
            if (dailyBudget < 50) {
                System.out.println("The destination offered is Bulgaria");
            }
            else {
                System.out.println("The destination offered is Outside of Bulgaria");
            }
        }


    }
}

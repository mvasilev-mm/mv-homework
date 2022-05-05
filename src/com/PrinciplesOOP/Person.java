package com.PrinciplesOOP;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Person {

    final String name;
    final String sex;
    final String religion;
    final String languageSpoken;
    String job;
    final String nationality;
    final String EGN;
    final String dateOfBirth;
    final String age;
    String country;
    String fullEGN;

    public Person(String name, String sex, String religion, String languageSpoken, String job, String nationality, String age, String country) {
        this.name = name;
        this.sex = validSex(sex);
        this.religion = religion;
        this.languageSpoken = languageSpoken;
        this.job = job;
        this.nationality = nationality;
        EGN = addEGN();
        dateOfBirth = addDoB();
        this.age = age;
        this.country = country;

        sayHello(name, sex, religion, languageSpoken, job, nationality, age, country);
    }

    public String addEGN(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 digit EGN: ");
        String input = scanner.nextLine();
        if(input.chars().count() != 10){
            throw new InputMismatchException("EGN must be exactly 10 digits! You've entered " + input.chars().count() + " digits");
        }
        fullEGN = input;
        return input;
    }

    public String addDoB(){
        String yearOfBirth = fullEGN.substring(0,2);
        String monthOfBirth = fullEGN.substring(2,4);
        String dayOfBirth = fullEGN.substring(4,6);
        String dateOfBirth = yearOfBirth + "." + monthOfBirth + "." + dayOfBirth;

        return dateOfBirth;

    }

    public String validSex(String sex) {
        String sexToLowerCase = sex.toLowerCase();
        Scanner scanner = new Scanner(System.in);

        if (sexToLowerCase.equals("male") || sexToLowerCase.equals("female")) {
            return sex;
        }
        else {
            Boolean correctSexGiven = false;

            while (!correctSexGiven) {
                System.out.println("Please, enter valid gender: ");
                String userCorrection = scanner.nextLine();

                sexToLowerCase = userCorrection.toLowerCase();
                if (sexToLowerCase.equals("male") || sexToLowerCase.equals("female")) {
                    correctSexGiven = true;
                    sex = userCorrection;
                }
            }

            return sex;
        }
    }

    public void sayHello(String name, String sex, String religion, String languageSpoken, String job, String nationality, String age, String country) {
        System.out.printf("Hello, my name is %s! I am %s, %s years-old. I work as %s.\n", age, name, sex, job);
        System.out.printf("I am %s from %s and speak %s.\n", nationality, country, languageSpoken);

        celebrateEaster(religion);
        isAdult(age, country);
    }

    public void celebrateEaster(String religion) {
        String religionToLowerCase = religion.toLowerCase();
        if (religionToLowerCase.equals("orthodox") || religionToLowerCase.equals("catholic") || religionToLowerCase.equals("christian")) {
            System.out.printf("I am a %s so I celebrate Easter!\n", religion);
        }
        else {
            System.out.println("I am not a Christian so I don't celebrate Easter!");
        }
    }

    public void isAdult(String age, String country) {
        int personAge = Integer.parseInt(age);
        String countryToLowerCase = country.toLowerCase();

        if (countryToLowerCase.equals("bulgaria")) {

            if (personAge > 18) {
                System.out.println("I am an Adult.");
            }
            else {
                System.out.println("I am not an Adult yet.");
            }
        }
        else if (countryToLowerCase.equals("italy")) {
            if (personAge > 18) {
                System.out.println("I am an Adult.");
            }
            else {
                System.out.println("I am not an Adult yet.");
            }
        }
        else if (countryToLowerCase.equals("usa")) {
            if (personAge > 21) {
                System.out.println("I am an Adult.");
            }
            else {
                System.out.println("I am not an Adult yet.");
            }
        }
        else {
            System.out.println("I am feeling as an Adult but I am not sure if I am one.");
        }
    }

    public static void main(String[] args) {

        Person person1 = new Person("Martina","female","christian","bulgarian","QA","bulgarian","28","Bulgaria");
        Person person2 = new Person("Kirilichka","unknown","Orthodox","bulgarian","Project Manager","bulgarian","28","Bulgaria");
        Person person3 = new Person("Mohammed Salah","male","Islam","Arabic","Footballer","egyptian","29","Egypt");

    }
}

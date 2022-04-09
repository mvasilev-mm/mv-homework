package com.IntroToJava2;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class NumbersDivisibleBy5 {
    public static void main(String[] args) {
        int[] list1 = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};
        List<String> numbersDivisibleBy5 = new ArrayList<>();

        for (int i = 0; i < list1.length; i++) {
            if (list1[i] > 150 ) {
                break;
            }
            else {
                if (list1[i] % 5 == 0) {
                    numbersDivisibleBy5.add(String.valueOf(list1[i]));
                }
                else {
                    continue;
                }
            }
        }

        System.out.print(String.join(", ", numbersDivisibleBy5));
    }
}
